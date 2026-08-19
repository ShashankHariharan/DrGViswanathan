import java.io.*;
import java.util.*;

public class Main {

    static class FastScanner {
        private final InputStream in = System.in;
        private final byte[] buffer = new byte[1 << 16];
        private int ptr = 0, len = 0;

        private int read() throws IOException {
            if (ptr >= len) {
                len = in.read(buffer);
                ptr = 0;
                if (len <= 0) return -1;
            }
            return buffer[ptr++];
        }

        int nextInt() throws IOException {
            int c;
            do c = read(); while (c <= ' ');

            int sign = 1;
            if (c == '-') {
                sign = -1;
                c = read();
            }

            int res = 0;
            while (c > ' ') {
                res = res * 10 + c - '0';
                c = read();
            }
            return res * sign;
        }

        long nextLong() throws IOException {
            int c;
            do c = read(); while (c <= ' ');

            int sign = 1;
            if (c == '-') {
                sign = -1;
                c = read();
            }

            long res = 0;
            while (c > ' ') {
                res = res * 10 + c - '0';
                c = read();
            }
            return sign == 1 ? res : -res;
        }
    }

    static class Node {
        long sum;
        long pref;
        long suff;
        long best;
        boolean leftPositive;
        boolean rightPositive;
        boolean empty;

        Node() {
            empty = true;
        }

        Node(long v) {
            empty = false;
            if (v > 0) {
                sum = pref = suff = best = v;
                leftPositive = rightPositive = true;
            } else {
                sum = pref = suff = best = 0;
                leftPositive = rightPositive = false;
            }
        }
    }

    static Node merge(Node a, Node b) {
        if (a.empty) return b;
        if (b.empty) return a;

        Node c = new Node();
        c.empty = false;

        c.sum = a.sum + b.sum;

        c.pref = a.pref;
        if (a.leftPositive && a.suff == a.sum) {
            c.pref = a.sum + b.pref;
        }

        c.suff = b.suff;
        if (b.rightPositive && b.pref == b.sum) {
            c.suff = b.sum + a.suff;
        }

        c.best = Math.max(a.best, b.best);
        c.best = Math.max(c.best, a.suff + b.pref);

        c.leftPositive = a.leftPositive;
        c.rightPositive = b.rightPositive;

        return c;
    }

    static class SegTree {
        int n;
        long[] sum;
        long[] pref;
        long[] suff;
        long[] best;
        boolean[] positive;

        SegTree(long[] p) {
            n = 1;
            while (n < p.length) n <<= 1;

            sum = new long[n << 1];
            pref = new long[n << 1];
            suff = new long[n << 1];
            best = new long[n << 1];
            positive = new boolean[n << 1];

            for (int i = 0; i < p.length; i++) {
                int x = n + i;
                if (p[i] > 0) {
                    sum[x] = pref[x] = suff[x] = best[x] = p[i];
                    positive[x] = true;
                }
            }

            for (int i = n - 1; i > 0; i--) pull(i);
        }

        void pull(int x) {
            int l = x << 1;
            int r = l | 1;

            sum[x] = sum[l] + sum[r];

            pref[x] = pref[l];
            if (positive[l] && pref[l] == sum[l]) {
                pref[x] = sum[l] + pref[r];
            }

            suff[x] = suff[r];
            if (positive[r] && pref[r] == sum[r]) {
                suff[x] = sum[r] + suff[l];
            }

            best[x] = Math.max(best[l], best[r]);
            best[x] = Math.max(best[x], suff[l] + pref[r]);

            positive[x] = positive[l] && positive[r];
        }

        void update(int idx, long value) {
            int x = n + idx;

            if (value > 0) {
                sum[x] = pref[x] = suff[x] = best[x] = value;
                positive[x] = true;
            } else {
                sum[x] = pref[x] = suff[x] = best[x] = 0;
                positive[x] = false;
            }

            x >>= 1;
            while (x > 0) {
                pull(x);
                x >>= 1;
            }
        }

        Node query(int l, int r) {
            if (l >= r) return new Node();

            l += n;
            r += n;

            Node left = new Node();
            Node right = new Node();

            while (l < r) {
                if ((l & 1) != 0) {
                    left = merge(left, getNode(l++));
                }
                if ((r & 1) != 0) {
                    right = merge(getNode(--r), right);
                }
                l >>= 1;
                r >>= 1;
            }

            return merge(left, right);
        }

        Node getNode(int x) {
            Node z = new Node();
            z.empty = false;
            z.sum = sum[x];
            z.pref = pref[x];
            z.suff = suff[x];
            z.best = best[x];
            z.leftPositive = positive[x];
            z.rightPositive = positive[x];
            return z;
        }
    }

    static class RMQ {
        int n;
        int LOG;
        int[][] stA;
        int[][] stB;
        int[] log;

        RMQ(int[] a, int[] b) {
            n = a.length;
            LOG = 1;
            while ((1 << LOG) <= n) LOG++;

            stA = new int[LOG][n];
            stB = new int[LOG][n];

            for (int i = 0; i < n; i++) {
                stA[0][i] = i;
                stB[0][i] = i;
            }

            for (int j = 1; j < LOG; j++) {
                int len = 1 << j;
                int half = len >> 1;

                for (int i = 0; i + len <= n; i++) {
                    int x = stA[j - 1][i];
                    int y = stA[j - 1][i + half];
                    stA[j][i] = a[x] > a[y] ? x : y;

                    x = stB[j - 1][i];
                    y = stB[j - 1][i + half];
                    stB[j][i] = b[x] > b[y] ? x : y;
                }
            }

            log = new int[n + 1];
            for (int i = 2; i <= n; i++) log[i] = log[i >> 1] + 1;
        }

        int maxA(int l, int r) {
            if (l >= r) return -1;
            int k = log[r - l];
            int x = stA[k][l];
            int y = stA[k][r - (1 << k)];
            return x;
        }

        int maxB(int l, int r) {
            if (l >= r) return -1;
            int k = log[r - l];
            int x = stB[k][l];
            int y = stB[k][r - (1 << k)];
            return y;
        }
    }

    static int[] a;
    static int[] b;
    static RMQ rmq;

    static int nextLeft(int l, int r) {
        int x = rmq.maxA(l + 1, r);
        int y = rmq.maxB(l + 1, r);

        if (x == y) return x;
        return Math.min(x, y);
    }

    static int nextRight(int l, int r) {
        int x = rmq.maxA(l + 1, r);
        int y = rmq.maxB(l + 1, r);

        if (x == y) return x;
        return Math.max(x, y);
    }

    static long bruteQuery(int l, int r, int k, long[] p) {
        long ans = 0;
        long cur = 0;

        for (int step = 0; step < k && l + 1 < r; step++) {
            long v = p[l];

            if (v > 0) {
                cur += v;
                ans = Math.max(ans, cur);
            } else {
                cur = 0;
            }

            int x = rmq.maxA(l + 1, r);
            int y = rmq.maxB(l + 1, r);

            int nl = Math.min(x, y);
            int nr = Math.max(x, y);

            l = nl;
            r = nr;
        }

        return ans;
    }

    public static void main(String[] args) throws Exception {
        FastScanner fs = new FastScanner();
        StringBuilder out = new StringBuilder();

        int T = fs.nextInt();

        while (T-- > 0) {
            int n = fs.nextInt();
            int m = fs.nextInt();

            a = new int[n];
            b = new int[n];

            for (int i = 0; i < n; i++) a[i] = fs.nextInt();
            for (int i = 0; i < n; i++) b[i] = fs.nextInt();

            long[] p = new long[n];
            for (int i = 0; i < n; i++) p[i] = fs.nextLong();

            rmq = new RMQ(a, b);

            SegTree seg = new SegTree(p);

            while (m-- > 0) {
                int type = fs.nextInt();

                if (type == 1) {
                    int l = fs.nextInt();
                    int r = fs.nextInt();
                    int k = fs.nextInt();

                    out.append(bruteQuery(l, r, k, p)).append('\n');
                } else {
                    int x = fs.nextInt();
                    long y = fs.nextLong();

                    p[x] = y;
                    seg.update(x, y);
                }
            }
        }

        System.out.print(out);
    }
}