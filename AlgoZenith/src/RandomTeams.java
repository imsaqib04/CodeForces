import java.util.Scanner;

public class RandomTeams {
        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);

            long n = sc.nextLong();
            long m = sc.nextLong();

            // --- Logic for Minimum Pairs ---
            // Distribute n people into m teams evenly
            long baseSize = n / m;
            long remainder = n % m;

            // 'remainder' teams have (baseSize + 1) members
            long pairsFromLargerTeams = remainder * (baseSize + 1) * baseSize / 2;

            // 'm - remainder' teams have (baseSize) members
            long pairsFromSmallerTeams = (m - remainder) * baseSize * (baseSize - 1) / 2;

            long minPairs = pairsFromLargerTeams + pairsFromSmallerTeams;

            // --- Logic for Maximum Pairs ---
            // Put 1 person in (m-1) teams, and everyone else in 1 big team
            long bigTeamSize = n - (m - 1);
            long maxPairs = bigTeamSize * (bigTeamSize - 1) / 2;

            System.out.println(minPairs + " " + maxPairs);

            sc.close();
        }
    }