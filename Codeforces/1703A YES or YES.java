import java.io.*;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder out = new StringBuilder();

        int t = Integer.parseInt(br.readLine().trim());

        while (t-- > 0) {
            String s = br.readLine().trim();

            if (s.equalsIgnoreCase("YES")) {
                out.append("YES\n");
            } else {
                out.append("NO\n");
            }
        }

        System.out.print(out);
    }
}