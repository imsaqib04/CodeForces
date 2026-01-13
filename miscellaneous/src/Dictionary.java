import java.util.Scanner;

public class Dictionary {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < n; i++) {
            String s = sc.next();

            char x = s.charAt(0);
            char y = s.charAt(1);

            int index = (x - 'a') * 25
                    + (y - 'a')
                    - (y > x ? 1 : 0)
                    + 1;

            sb.append(index).append('\n'); // store
        }

        System.out.print(sb.toString());
    }
}
