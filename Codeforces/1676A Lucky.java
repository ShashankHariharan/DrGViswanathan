import java.io.*;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder out = new StringBuilder();

        int t = Integer.parseInt(br.readLine().trim());

        while (t-- > 0) {
            String s = br.readLine().trim();

            int first = 0;
            int last = 0;

            for (int i = 0; i < 3; i++) {
                first += s.charAt(i) - '0';
                last += s.charAt(i + 3) - '0';
            }

            out.append(first == last ? "YES\n" : "NO\n");
        }

        System.out.print(out);
    }
}