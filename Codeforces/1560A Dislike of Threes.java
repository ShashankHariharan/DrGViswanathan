import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        StringBuilder out = new StringBuilder();

        int t = sc.nextInt();

        while (t-- > 0) {
            int k = sc.nextInt();
            int count = 0;
            int num = 1;

            while (count < k) {
                if (num % 3 != 0 && num % 10 != 3) {
                    count++;
                }
                num++;
            }

            out.append(num - 1).append('\n');
        }

        System.out.print(out);
    }
}