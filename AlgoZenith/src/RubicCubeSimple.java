import java.util.Scanner;

public class RubicCubeSimple {

    static Long MOD = 1000000007L;

    public static void main(String[] args) {
        Scanner sc = new Scanner ( System.in );
        long k = sc.nextLong ();  // height of the tree!

        long exponent = (1L << k) - 2;  // 2^k

        long powerPart = powerMod(4,exponent);

        long ans = (6 * powerPart)%MOD;

        System.out.println (ans);


    }

    static long powerMod(long base, long expo) {

        base = base % MOD;
        long res = 1;
        while (expo > 0) {

            if (expo % 2 == 1) {
                res = (res * base) % MOD;
            }
            expo = expo / 2;
            base = (base * base) % MOD;
        }

        return res;
    }
}