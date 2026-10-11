import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        StringBuilder out = new StringBuilder();

        int t = sc.nextInt();

        while (t-- > 0) {
            int n = sc.nextInt();
            String s = sc.next();

            char[] a = s.toCharArray();
            char[] b = "Timur".toCharArray();

            Arrays.sort(a);
            Arrays.sort(b);

            out.append(n == 5 && Arrays.equals(a, b) && s.contains("T") && s.chars().filter(c -> c == 'T').count() == 1
                    ? "YES\n" : "NO\n");
        }

        System.out.print(out);
    }
}