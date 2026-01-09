import java.util.*;

public class SearchInMatrix {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();

        while (T-- > 0) {
            int N = sc.nextInt();
            int M = sc.nextInt();

            int[][] A = new int[N][M];
            for (int i = 0; i < N; i++) {
                for (int j = 0; j < M; j++) {
                    A[i][j] = sc.nextInt();
                }
            }

            int X = sc.nextInt();
            boolean found = false;

            for (int i = 0; i < N && !found; i++) {
                for (int j = 0; j < M; j++) {
                    if (A[i][j] == X) {
                        found = true;
                        break;
                    }
                }
            }

            if (found)
                System.out.println("will not take number");
            else
                System.out.println("will take number");
        }
        sc.close();
    }
}