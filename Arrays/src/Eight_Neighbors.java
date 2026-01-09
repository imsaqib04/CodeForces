import java.util.*;

public class Eight_Neighbors {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int T = sc.nextInt();

        while (T-- > 0) {

            int N = sc.nextInt();
            int M = sc.nextInt();

            char[][] grid = new char[N][M];

            for (int i = 0; i < N; i++) {
                grid[i] = sc.next().toCharArray();
            }

            int X = sc.nextInt() - 1;
            int Y = sc.nextInt() - 1;

            int[] dx = {-1, -1, -1,  0, 0, 1, 1, 1};
            int[] dy = {-1,  0,  1, -1, 1,-1, 0, 1};

            boolean allX = true;

            for (int i = 0; i < 8; i++) {
                int nx = X + dx[i];
                int ny = Y + dy[i];

                if (nx >= 0 && nx < N && ny >= 0 && ny < M) {
                    if (grid[nx][ny] != 'x') {
                        allX = false;
                        break;
                    }
                }
            }

            if (allX)
                System.out.println("yes");
            else
                System.out.println("no");
        }

        sc.close();
    }
}
