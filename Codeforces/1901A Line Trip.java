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
            int x = Integer.parseInt(st.nextToken());

            st = new StringTokenizer(br.readLine());

            int prev = 0;
            int maxGap = 0;

            for (int i = 0; i < n; i++) {
                int station = Integer.parseInt(st.nextToken());
                maxGap = Math.max(maxGap, station - prev);
                prev = station;
            }

            maxGap = Math.max(maxGap, 2 * (x - prev));

            out.append(maxGap).append('\n');
        }

        System.out.print(out);
    }
}