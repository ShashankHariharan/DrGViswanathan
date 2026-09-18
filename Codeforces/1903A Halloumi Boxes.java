import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder out = new StringBuilder();

        int t = Integer.parseInt(br.readLine().trim());

        while (t-- > 0) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            int n = Integer.parseInt(st.nextToken());
            int k = Integer.parseInt(st.nextToken());

            st = new StringTokenizer(br.readLine());
            int[] a = new int[n];

            for (int i = 0; i < n; i++) {
                a[i] = Integer.parseInt(st.nextToken());
            }

            if (k >= 2) {
                out.append("YES\n");
            } else {
                boolean sorted = true;

                for (int i = 1; i < n; i++) {
                    if (a[i] < a[i - 1]) {
                        sorted = false;
                        break;
                    }
                }

                out.append(sorted ? "YES\n" : "NO\n");
            }
        }

        System.out.print(out);
    }
}