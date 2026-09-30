import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        StringBuilder out = new StringBuilder();

        int t = sc.nextInt();

        while (t-- > 0) {
            int n = sc.nextInt();
            String s = sc.next();

            int maxDots = 0;
            int current = 0;

            for (int i = 0; i < n; i++) {
                if (s.charAt(i) == '.') {
                    current++;
                    maxDots = Math.max(maxDots, current);
                } else {
                    current = 0;
                }
            }

            if (maxDots >= 3) {
                out.append(2).append('\n');
            } else {
                int dots = 0;
                for (char c : s.toCharArray()) {
                    if (c == '.') {
                        dots++;
                    }
                }
                out.append(dots).append('\n');
            }
        }

        System.out.print(out);
    }
}