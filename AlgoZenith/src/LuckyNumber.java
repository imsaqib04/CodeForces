import java.util.Scanner;

public class LuckyNumber {
    public static void main(String[] args) {

        Scanner sc = new Scanner ( System.in );
        int n = sc.nextInt ();

//        double ans= Math.pow(2, n+1)-2;
         long ans = (1L<< (n+1)) -2;
        System.out.println (ans);
    }
}