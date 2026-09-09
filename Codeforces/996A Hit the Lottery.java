import java.io.*;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        long n = Long.parseLong(br.readLine().trim());
        int[] denominations = {100, 20, 10, 5, 1};

        long count = 0;

        for (int d : denominations) {
            count += n / d;
            n %= d;
        }

        System.out.println(count);
    }
}