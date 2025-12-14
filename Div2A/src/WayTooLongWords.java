// Input
//4
//word
//localization
//internationalization
//pneumonoultramicroscopicsilicovolcanoconiosis

// output
//word
//l10n
//i18n
//p43s

import java.util.Scanner;
public class WayTooLongWords {

    String solve(String s) {
        int n = s.length ();
        if (n > 10) {
            return s.charAt ( 0 ) + String.valueOf ( s.length () - 2 ) + s.charAt ( n - 1 );
        } else {
            return s;
        }
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner ( System.in );
        int N = sc.nextInt ();
        WayTooLongWords w = new WayTooLongWords ();

        for(int i = 0;i<N;i++) {
            String read = sc.next ();
            String result = w.solve ( read );
            System.out.println ( result );
        }
        sc.close();
    }
}
