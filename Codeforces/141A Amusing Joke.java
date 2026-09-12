import java.io.*;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String guest = br.readLine();
        String host = br.readLine();
        String pile = br.readLine();

        String combined = guest + host;

        if (combined.length() != pile.length()) {
            System.out.println("NO");
            return;
        }

        int[] freq = new int[26];

        for (char c : combined.toCharArray()) {
            freq[c - 'A']++;
        }

        for (char c : pile.toCharArray()) {
            freq[c - 'A']--;
        }

        for (int x : freq) {
            if (x != 0) {
                System.out.println("NO");
                return;
            }
        }

        System.out.println("YES");
    }
}