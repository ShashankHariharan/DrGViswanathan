import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine().trim());
        StringTokenizer st = new StringTokenizer(br.readLine());

        int officers = 0;
        int untreated = 0;

        for (int i = 0; i < n; i++) {
            int event = Integer.parseInt(st.nextToken());

            if (event == -1) {
                if (officers > 0) {
                    officers--;
                } else {
                    untreated++;
                }
            } else {
                officers += event;
            }
        }

        System.out.println(untreated);
    }
}