import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        StringBuilder out = new StringBuilder();

        int t = sc.nextInt();

        while (t-- > 0) {
            String a = sc.next();
            String b = sc.next();

            char temp = a.charAt(0);
            a = b.charAt(0) + a.substring(1);
            b = temp + b.substring(1);

            out.append(a).append(' ').append(b).append('\n');
        }

        System.out.print(out);
    }
}