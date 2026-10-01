import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        StringBuilder out = new StringBuilder();

        int t = sc.nextInt();

        while (t-- > 0) {
            long a = sc.nextLong();
            long b = sc.nextLong();
            long c = sc.nextLong();

            if (a > b) {
                out.append("First\n");
            } else if (a < b) {
                out.append("Second\n");
            } else {
                out.append(c % 2 == 1 ? "First\n" : "Second\n");
            }
        }

        System.out.print(out);
    }
}