import java.io.*;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine().trim());
        int total = 0;

        while (n-- > 0) {
            String s = br.readLine();

            switch (s) {
                case "Tetrahedron":
                    total += 4;
                    break;
                case "Cube":
                    total += 6;
                    break;
                case "Octahedron":
                    total += 8;
                    break;
                case "Dodecahedron":
                    total += 12;
                    break;
                case "Icosahedron":
                    total += 20;
                    break;
            }
        }

        System.out.println(total);
    }
}