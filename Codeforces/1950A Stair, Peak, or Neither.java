import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        StringBuilder out = new StringBuilder();

        int t = sc.nextInt();

        while (t-- > 0) {
            int a = sc.nextInt();
            int b = sc.nextInt();
            int c = sc.nextInt();

            if (a < b && b < c) {
                out.append("STAIR\n");
            } else if (a < b && b > c) {
                out.append("PEAK\n");
            } else {
                out.append("NONE\n");
            }
        }

        System.out.print(out);
    }
}