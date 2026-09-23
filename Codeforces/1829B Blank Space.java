import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder out = new StringBuilder();

        int t = Integer.parseInt(br.readLine().trim());

        while (t-- > 0) {
            int n = Integer.parseInt(br.readLine().trim());
            StringTokenizer st = new StringTokenizer(br.readLine());

            int current = 0;
            int max = 0;

            for (int i = 0; i < n; i++) {
                int x = Integer.parseInt(st.nextToken());

                if (x == 0) {
                    current++;
                    max = Math.max(max, current);
                } else {
                    current = 0;
                }
            }

            out.append(max).append('\n');
        }

        System.out.print(out);
    }
}