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

            boolean found = false;

            for (int i = 0; i < n; i++) {
                int x = Integer.parseInt(st.nextToken());
                if (x == k) {
                    found = true;
                }
            }

            out.append(found ? "YES\n" : "NO\n");
        }

        System.out.print(out);
    }
}