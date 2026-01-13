import java.util.Scanner;

public class PashmakAndFlowers {
    public static void main(String[] args) {

        Scanner sc = new Scanner ( System.in );
        int n = sc.nextInt ();

        long[] arr = new long[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt ();
        }

        long min = Long.MAX_VALUE;
        long max = Long.MIN_VALUE;

        for(long x: arr){
                min = Math.min(x,min);
                max = Math.max(x,max);
        }

        if(max==min){
            long pairs = (long) n*(n-1)/2;
            System.out.println (0 + " " + pairs);
            return;
        }

        int cntMin = 0;
        int cntMax = 0;

        for(long x : arr){
            if(x==min) cntMin++;
            if(x==max) cntMax++;
        }

        System.out.println ((max-min) + " " + (cntMax*cntMin));
    }
}

