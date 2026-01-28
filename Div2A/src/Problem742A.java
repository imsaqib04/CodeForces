import java.util.Scanner;

public class Problem742A {

    public static void main(String[] args) {

        Scanner sc = new Scanner ( System.in );
        int n = sc.nextInt ();

        if(n==0){
            System.out.println ("1");
        }
        else{
            int r = n%4;
            if(r==1){
                System.out.println ("8");
            }
            else if(r==2){
                System.out.println ("4");
            }
            else if(r==3){
                System.out.println ("2");
            }
            else{
                System.out.println ("6");
            }
        }

    }
}
