import java.io.*;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine().trim());

        StringBuilder sb = new StringBuilder();

        for (int i = 1; i <= n; i++) {
            if (i > 1) {
                sb.append(" that ");
            }

            if (i % 2 == 1) {
                sb.append("I hate");
            } else {
                sb.append("I love");
            }
        }

        sb.append(" it");

        System.out.println(sb);
    }
}