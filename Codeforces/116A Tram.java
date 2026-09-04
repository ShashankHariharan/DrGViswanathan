import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int passengers = 0;
        int capacity = 0;

        for (int i = 0; i < n; i++) {
            int exit = sc.nextInt();
            int enter = sc.nextInt();

            passengers -= exit;
            passengers += enter;

            capacity = Math.max(capacity, passengers);
        }

        System.out.println(capacity);
    }
}