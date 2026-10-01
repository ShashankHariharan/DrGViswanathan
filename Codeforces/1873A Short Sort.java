import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        StringBuilder out = new StringBuilder();

        int t = sc.nextInt();

        while (t-- > 0) {
            String s = sc.next();

            int matches = 0;

            if (s.charAt(0) == 'a') matches++;
            if (s.charAt(1) == 'b') matches++;
            if (s.charAt(2) == 'c') matches++;

            out.append(matches >= 1 ? "YES\n" : "NO\n");
        }

        System.out.print(out);
    }
}