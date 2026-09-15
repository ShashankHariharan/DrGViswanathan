import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine().trim());
        StringTokenizer st = new StringTokenizer(br.readLine());

        int first = Integer.parseInt(st.nextToken());
        int max = first;
        int min = first;
        int amazing = 0;

        for (int i = 1; i < n; i++) {
            int score = Integer.parseInt(st.nextToken());

            if (score > max) {
                amazing++;
                max = score;
            } else if (score < min) {
                amazing++;
                min = score;
            }
        }

        System.out.println(amazing);
    }
}