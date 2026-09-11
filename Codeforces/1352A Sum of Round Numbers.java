import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder out = new StringBuilder();

        int t = Integer.parseInt(br.readLine().trim());

        while (t-- > 0) {
            int n = Integer.parseInt(br.readLine().trim());

            List<Integer> roundNumbers = new ArrayList<>();
            int place = 1;

            while (n > 0) {
                int digit = n % 10;

                if (digit != 0) {
                    roundNumbers.add(digit * place);
                }

                n /= 10;
                place *= 10;
            }

            out.append(roundNumbers.size()).append('\n');

            for (int i = 0; i < roundNumbers.size(); i++) {
                if (i > 0) out.append(' ');
                out.append(roundNumbers.get(i));
            }
            out.append('\n');
        }

        System.out.print(out);
    }
}