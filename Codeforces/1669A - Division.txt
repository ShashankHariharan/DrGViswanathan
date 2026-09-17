import java.io.*;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder out = new StringBuilder();

        int t = Integer.parseInt(br.readLine().trim());

        while (t-- > 0) {
            int rating = Integer.parseInt(br.readLine().trim());

            if (rating >= 1900) {
                out.append("Division 1\n");
            } else if (rating >= 1600) {
                out.append("Division 2\n");
            } else if (rating >= 1400) {
                out.append("Division 3\n");
            } else {
                out.append("Division 4\n");
            }
        }

        System.out.print(out);
    }
}