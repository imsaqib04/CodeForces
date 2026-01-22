import java.util.Scanner;

public class SubStringRemoval {

    static final long MOD = 998244353L;

    public static void main(String[] args) {
        Scanner sc = new Scanner ( System.in );

        int n = sc.nextInt ();
        String s = sc.next ();

        // Step 1: Count the Left Block (Prefix)
        long leftCount = 0;
        for (int i = 0; i < n; i++) {
            if (s.charAt ( i ) == s.charAt ( 0 )) {
                leftCount++;
            } else {
                break; // Stop as soon as the character changes
            }
        }

        // Edge Case: If the whole string is the same (e.g. "aaaa")
        // The loops above/below would count everything correctly,
        // but we need to handle the overlap logic.
        // If leftCount == n, the answer is n*(n+1)/2.
        // Let's use the standard formula logic which handles this naturally
        // if we stop the right loop correctly or just use Modulo arithmetic carefully.
        // Actually, the simplest way for "aaaa" is:
        if (leftCount == n) {
            long ans = (long) n * (n + 1) / 2;
            System.out.println ( ans % MOD );
            return;
        }

        // Step 2: Count the Right Block (Suffix)
        long rightCount = 0;
        for (int i = n - 1; i >= 0; i--) {
            if (s.charAt ( i ) == s.charAt ( n - 1 )) {
                rightCount++;
            } else {
                break;
            }
        }

        long ans = 0;

        // Step 3: Apply the Logic
        if (s.charAt ( 0 ) == s.charAt ( n - 1 )) {
            // Scenario B: Ends are same
            // (Left options + 1 for empty) * (Right options + 1 for empty)
            ans = (leftCount + 1) * (rightCount + 1) % MOD;
        } else {
            // Scenario A: Ends are different
            // Left options + Right options + 1 (for empty)
            ans = (leftCount + rightCount + 1) % MOD;
        }

        System.out.println ( ans );
    }

}