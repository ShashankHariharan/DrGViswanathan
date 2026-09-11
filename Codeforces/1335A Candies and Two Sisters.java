import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder out = new StringBuilder();

        int t = Integer.parseInt(br.readLine().trim());

        while (t-- > 0) {
            long n = Long.parseLong(br.readLine().trim());

            if (n < 3) {
                out.append(0).append('\n');
            } else {
                out.append((n - 1) / 2).append('\n');
            }
        }

        System.out.print(out);
    }
}