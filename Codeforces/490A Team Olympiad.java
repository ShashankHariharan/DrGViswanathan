import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        List<Integer> one = new ArrayList<>();
        List<Integer> two = new ArrayList<>();
        List<Integer> three = new ArrayList<>();

        for (int i = 1; i <= n; i++) {
            int x = sc.nextInt();

            if (x == 1) {
                one.add(i);
            } else if (x == 2) {
                two.add(i);
            } else {
                three.add(i);
            }
        }

        int teams = Math.min(one.size(), Math.min(two.size(), three.size()));

        StringBuilder out = new StringBuilder();
        out.append(teams).append('\n');

        for (int i = 0; i < teams; i++) {
            out.append(one.get(i)).append(' ')
               .append(two.get(i)).append(' ')
               .append(three.get(i)).append('\n');
        }

        System.out.print(out);
    }
}