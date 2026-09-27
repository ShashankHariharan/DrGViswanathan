import java.io.*;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String s = br.readLine().trim();

        StringBuilder ans = new StringBuilder();

        for (int i = 0; i < s.length();) {
            if (s.charAt(i) == '.') {
                ans.append('0');
                i++;
            } else {
                if (i + 1 < s.length() && s.charAt(i + 1) == '.') {
                    ans.append('1');
                } else {
                    ans.append('2');
                }
                i += 2;
            }
        }

        System.out.println(ans);
    }
}