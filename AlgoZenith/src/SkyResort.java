import java.util.Scanner;

public class SkyResort {
    // n -> length
    // k = min days to live in resort
    // max comfortable temp

    // 2nd line gives only temp

    //input
    //3 1 15
    //-5 0 -10
    // output
    // 6

    public static void main(String[] args) {
        Scanner sc = new Scanner ( System.in );
        long T = sc.nextLong ();

        while(T>0){

            int n = sc.nextInt ();   // length
            long k = sc.nextLong (); // min days
            long q = sc.nextInt (); // max temp

            long [] arr = new long[n];

            for(int i =0;i<n;i++){
                arr[i] = sc.nextLong ();
            }

            long ans = 0;
            long currStreak=0;
            for(int i =0;i<n;i++){

                if(arr[i]<=q) {
                   currStreak++;
                }
                else{

                    if(currStreak>=k){
                        long x =currStreak-k+1;
                        ans = ans+ (x*(x+1))/2;
                    }
                    currStreak = 0;

                }
            }
            if (currStreak >= k) {
                long x = currStreak - k + 1;
                ans += (x * (x + 1)) / 2;
            }
            System.out.println (ans);

            T--;
        }
    }



}
