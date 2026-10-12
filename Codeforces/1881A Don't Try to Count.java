import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        StringBuilder out = new StringBuilder();

        int t = sc.nextInt();

        while (t-- > 0) {
            int n = sc.nextInt();
            int m = sc.nextInt();

            String x = sc.next();
            String s = sc.next();

            int operations = 0;
            int answer = -1;

            while (x.length() < m) {
                x += x;
                operations++;

                if (x.contains(s)) {
                    answer = operations;
                    break;
                }
            }

            if (answer == -1 && x.contains(s)) {
                answer = operations;
            }

            if (answer == -1) {
                x += x;
                operations++;

                if (x.contains(s)) {
                    answer = operations;
                }
            }

            out.append(answer).append('\n');
        }

        System.out.print(out);
    }
}