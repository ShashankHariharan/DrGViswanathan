import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        StringBuilder out = new StringBuilder();

        int t = sc.nextInt();
        String target = "codeforces";

        while (t-- > 0) {
            String s = sc.next();
            int count = 0;

            for (int i = 0; i < 10; i++) {
                if (s.charAt(i) != target.charAt(i)) {
                    count++;
                }
            }

            out.append(count).append('\n');
        }

        System.out.print(out);
    }
}