import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int m = sc.nextInt();

        int nextPrime = n + 1;

        while (nextPrime < m && !isPrime(nextPrime)) {
            nextPrime++;
        }

        System.out.println(nextPrime == m && isPrime(m) ? "YES" : "NO");
    }

    static boolean isPrime(int n) {
        if (n < 2) return false;

        for (int i = 2; i * i <= n; i++) {
            if (n % i == 0) return false;
        }

        return true;
    }
}