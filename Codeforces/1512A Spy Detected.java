import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder out = new StringBuilder();

        int t = Integer.parseInt(br.readLine().trim());

        while (t-- > 0) {
            int n = Integer.parseInt(br.readLine().trim());
            int[] a = new int[n];


            for (int i = 0; i < n; i++) {
                a[i] = Integer.parseInt(st.nextToken());
            }

            int index;

            if (a[0] == a[1]) {
                index = 0;
                for (int i = 2; i < n; i++) {
                    if (a[i] != a[0]) {
                        index = i;
                        break;
                    }
                }
            } else {
                index = (a[0] == a[2]) ? 1 : 0;
            }

            out.append(index + 1).append('\n');
        }

        System.out.print(out);
    }
}