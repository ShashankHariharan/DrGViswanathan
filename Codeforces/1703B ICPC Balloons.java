import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        StringBuilder out = new StringBuilder();

        int t = sc.nextInt();

        while (t-- > 0) {
            int n = sc.nextInt();
            String s = sc.next();

            boolean[] seen = new boolean[26];
            int balloons = 0;

            for (int i = 0; i < n; i++) {
                int index = s.charAt(i) - 'A';
                balloons++;

                if (!seen[index]) {
                    balloons++;
                    seen[index] = true;
                }
            }

            out.append(balloons).append('\n');
        }

        System.out.print(out);
    }
}