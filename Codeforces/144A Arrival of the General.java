import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine().trim());
        StringTokenizer st = new StringTokenizer(br.readLine());

        int[] a = new int[n];
        int max = -1, min = Integer.MAX_VALUE;

        for (int i = 0; i < n; i++) {
            a[i] = Integer.parseInt(st.nextToken());
            max = Math.max(max, a[i]);
            min = Math.min(min, a[i]);
        }

        int maxIndex = 0;
        int minIndex = 0;

        // First occurrence of maximum
        for (int i = 0; i < n; i++) {
            if (a[i] == max) {
                maxIndex = i;
                break;
            }
        }

        // Last occurrence of minimum
        for (int i = n - 1; i >= 0; i--) {
            if (a[i] == min) {
                minIndex = i;
                break;
            }
        }

        int ans = maxIndex + (n - 1 - minIndex);

        // If maximum is before minimum, movements overlap by one position
        if (maxIndex > minIndex) {
            ans--;
        }

        System.out.println(ans);
    }
}