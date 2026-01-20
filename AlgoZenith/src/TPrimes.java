import java.util.*;

public class TPrimes {
    static final int MAX = 1000000;
    static boolean[] isPrime = new boolean[MAX + 1];

    static void sieve() {
        Arrays.fill(isPrime, true);
        isPrime[0] = isPrime[1] = false;

        for (int i = 2; i * i <= MAX; i++) {
            if (isPrime[i]) {
                for (int j = i * i; j <= MAX; j += i) {
                    isPrime[j] = false;
                }
            }
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        sieve();

        int n = sc.nextInt();
        while (n-- > 0) {
            long x = sc.nextLong();

            long r = (long) Math.sqrt(x);

            if (r * r == x && isPrime[(int) r]) {
                System.out.println("YES");
            } else {
                System.out.println("NO");
            }
        }
    }
}
