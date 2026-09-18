import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int k = Integer.parseInt(st.nextToken());
        int r = Integer.parseInt(st.nextToken());

        for (int i = 1; i <= 10; i++) {
            int amount = k * i;

            if (amount % 10 == 0 || amount % 10 == r) {
                System.out.println(i);
                return;
            }
        }
    }
}