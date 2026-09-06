import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int groups = 1;

        String prev = sc.next();

        for (int i = 1; i < n; i++) {
            String current = sc.next();

            if (!current.equals(prev)) {
                groups++;
            }

            prev = current;
        }

        System.out.println(groups);
    }
}