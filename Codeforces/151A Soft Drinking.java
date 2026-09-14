import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int n = Integer.parseInt(st.nextToken());
        int k = Integer.parseInt(st.nextToken());
        int l = Integer.parseInt(st.nextToken());
        int c = Integer.parseInt(st.nextToken());
        int d = Integer.parseInt(st.nextToken());
        int p = Integer.parseInt(st.nextToken());
        int nl = Integer.parseInt(st.nextToken());
        int np = Integer.parseInt(st.nextToken());

        int drinkToasts = (k * l) / nl;
        int limeToasts = c * d;
        int saltToasts = p / np;

        int totalToasts = Math.min(drinkToasts, Math.min(limeToasts, saltToasts));

        System.out.println(totalToasts / n);
    }
}