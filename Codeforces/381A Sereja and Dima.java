import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine().trim());
        StringTokenizer st = new StringTokenizer(br.readLine());

        int[] cards = new int[n];

        for (int i = 0; i < n; i++) {
            cards[i] = Integer.parseInt(st.nextToken());
        }

        int left = 0;
        int right = n - 1;
        int sereja = 0;
        int dima = 0;
        boolean turn = true;

        while (left <= right) {
            int value;

            if (cards[left] > cards[right]) {
                value = cards[left++];
            } else {
                value = cards[right--];
            }

            if (turn) {
                sereja += value;
            } else {
                dima += value;
            }

            turn = !turn;
        }

        System.out.println(sereja + " " + dima);
    }
}