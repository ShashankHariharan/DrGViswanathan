import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder out = new StringBuilder();

        int t = Integer.parseInt(br.readLine().trim());

        while (t-- > 0) {
            int n = Integer.parseInt(br.readLine().trim());
            StringTokenizer st = new StringTokenizer(br.readLine());

            Map<Integer, Integer> freq = new HashMap<>();

            for (int i = 0; i < n; i++) {
                int x = Integer.parseInt(st.nextToken());
                freq.put(x, freq.getOrDefault(x, 0) + 1);
            }

            if (freq.size() == 1) {
                out.append("Yes\n");
            } else if (freq.size() == 2) {
                Iterator<Integer> it = freq.values().iterator();
                int count1 = it.next();
                int count2 = it.next();

                out.append(Math.abs(count1 - count2) <= 1 ? "Yes\n" : "No\n");
            } else {
                out.append("No\n");
            }
        }

        System.out.print(out);
    }
}