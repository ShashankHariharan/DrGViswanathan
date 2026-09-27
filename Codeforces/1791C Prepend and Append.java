import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder out = new StringBuilder();

        int t = Integer.parseInt(br.readLine().trim());

        while (t-- > 0) {
            int n = Integer.parseInt(br.readLine().trim());
            String s = br.readLine().trim();

            int left = 0;
            int right = n - 1;

            while (left < right && s.charAt(left) != s.charAt(right)) {
                left++;
                right--;
            }

            out.append(right - left + 1).append('\n');
        }

        System.out.print(out);
    }
}