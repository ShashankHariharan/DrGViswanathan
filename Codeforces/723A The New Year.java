import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int x1 = Integer.parseInt(st.nextToken());
        int x2 = Integer.parseInt(st.nextToken());
        int x3 = Integer.parseInt(st.nextToken());

        int min = Math.min(x1, Math.min(x2, x3));
        int max = Math.max(x1, Math.max(x2, x3));

        System.out.println(max - min);
    }
}