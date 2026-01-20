import java.util.Scanner;

public class KolyaAndTanya {
    static long MOD = 1000000007;

    // Modular Exponentiation Function
    public static long power(long base, long exp) {
        long res = 1;
        while (exp > 0) {
            if (exp % 2 == 1) res = (res * base) % MOD;
            base = (base * base) % MOD;
            exp /= 2;
        }
        return res;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        // Total ways: (3^3)^n = 27^n
        long totalWays = power(27, n);

        // Unwanted ways (Kolya wins): 7^n
        long kolyaWays = power(7, n);

        // Final Answer: Total - Unwanted
        long ans = (totalWays - kolyaWays + MOD) % MOD;

        System.out.println(ans);

        sc.close();
    }
}