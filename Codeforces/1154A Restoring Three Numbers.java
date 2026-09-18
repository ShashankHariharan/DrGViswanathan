import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        long[] x = new long[4];

        for (int i = 0; i < 4; i++) {
            x[i] = Long.parseLong(st.nextToken());
        }

        Arrays.sort(x);

        long a = x[3] - x[2];
        long b = x[3] - x[1];
        long c = x[3] - x[0];

        System.out.println(a + " " + b + " " + c);
    }
}