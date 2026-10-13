import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        StringBuilder out = new StringBuilder();

        int t = sc.nextInt();

        while (t-- > 0) {
            int n = sc.nextInt();
            int k = n / 2;

            if (k % 2 != 0) {
                out.append("NO\n");
                continue;
            }

            out.append("YES\n");

            for (int i = 1; i <= k; i++) {
                out.append(2 * i).append(' ');
            }

            for (int i = 1; i < k; i++) {
                out.append(2 * i - 1).append(' ');
            }

            out.append(3 * k - 1).append('\n');
        }

        System.out.print(out);
    }
}