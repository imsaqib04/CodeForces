import java.util.Scanner;

public class PashaAndStick
{
        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);

            long n = sc.nextLong();

            if (n % 2 != 0) {
                System.out.println(0);
            } else {
                // Formula: (n/2 - 1) / 2
                System.out.println((n / 2 - 1) / 2);
            }

            sc.close();
        }
}