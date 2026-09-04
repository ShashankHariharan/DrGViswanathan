import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int y = sc.nextInt();

        while (true) {
            y++;

            String s = String.valueOf(y);
            boolean[] used = new boolean[10];
            boolean distinct = true;

            for (char c : s.toCharArray()) {
                int digit = c - '0';

                if (used[digit]) {
                    distinct = false;
                    break;
                }

                used[digit] = true;
            }

            if (distinct) {
                System.out.println(y);
                return;
            }
        }
    }
}