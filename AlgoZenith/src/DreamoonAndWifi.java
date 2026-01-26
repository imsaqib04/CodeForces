import java.util.Scanner;

public class DreamoonAndWifi {

    public static void main(String[] args) {
        Scanner sc = new Scanner ( System.in );

        String s1 = sc.next ();
        String s2 = sc.next ();

        // Step 1: Calculate Target Position from s1
        int targetPos = 0;
        for (char c : s1.toCharArray ()) {
            if (c == '+') targetPos++;
            else targetPos--;
        }

        // Step 2: Calculate Current Position and count '?' from s2
        int currentPos = 0;
        int questions = 0;
        for (char c : s2.toCharArray ()) {
            if (c == '+') currentPos++;
            else if (c == '-') currentPos--;
            else questions++;
        }

        // Step 3: Find distance needed
        int distanceNeeded = targetPos - currentPos;

        // Step 4: Logic Checks
        // We need to find 'x' (number of pluses) such that:
        // x moves forward and (questions - x) moves backward equals distanceNeeded
        // Equation: x - (questions - x) = distanceNeeded
        // 2x = distanceNeeded + questions

        // Impossible Case 1: If (distance + questions) is odd, we can't divide by 2
        // Impossible Case 2: We need more moves than available (abs(dist) > questions)
        if ((distanceNeeded + questions) % 2 != 0 || Math.abs ( distanceNeeded ) > questions) {
            System.out.printf ( "%.12f", 0.0 );
            return;
        }

        int requiredPluses = (distanceNeeded + questions) / 2;

        // Step 5: Logic Check - extra safety (required pluses cannot be negative)
        if (requiredPluses < 0 || requiredPluses > questions) {
            System.out.printf ( "%.12f", 0.0 );
            return;
        }

        // Step 6: Probability Calculation
        // Probability = (Ways to choose requiredPluses) / (2^questions)

        double favorableWays = nCr ( questions, requiredPluses );
        double totalWays = Math.pow ( 2, questions );

        System.out.printf ( "%.12f", favorableWays / totalWays );
    }

    // Helper function to calculate nCr (Combinations)
    // Formula: n! / (r! * (n-r)!)
    // Since n is small (max 10), we can just loop.
    public static double nCr(int n, int r) {
        if (r < 0 || r > n) return 0;
        if (r == 0 || r == n) return 1;
        if (r > n / 2) r = n - r; // Optimization: nCr(10, 8) is same as nCr(10, 2)

        double res = 1;
        for (int i = 1; i <= r; i++) {
            res = res * (n - i + 1) / i;
        }
        return res;
    }
}