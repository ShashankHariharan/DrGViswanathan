import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        StringBuilder out = new StringBuilder();

        int t = sc.nextInt();

        while (t-- > 0) {
            int n = sc.nextInt();
            int evenMismatch = 0;
            int oddMismatch = 0;

            for (int i = 0; i < n; i++) {
                int a = sc.nextInt();

                if (i % 2 != a % 2) {
                    if (i % 2 == 0) {
                        evenMismatch++;
                    } else {
                        oddMismatch++;
                    }
                }
            }

            if (evenMismatch != oddMismatch) {
                out.append("-1\n");
            } else {
                out.append(evenMismatch).append('\n');
            }
        }

        System.out.print(out);
    }
}