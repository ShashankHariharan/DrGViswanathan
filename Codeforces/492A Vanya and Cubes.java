import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int height = 0;
        int level = 1;
        int used = 0;

        while (true) {
            int cubes = level * (level + 1) / 2;

            if (used + cubes > n) {
                break;
            }

            used += cubes;
            height++;
            level++;
        }

        System.out.println(height);
    }
}