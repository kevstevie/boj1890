import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int[][] map = new int[n][n];
        for (int i = 0; i < n; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            for (int j = 0; j < n; j++) {
                map[i][j] = Integer.parseInt(st.nextToken());
            }
        }
        long[][] dp = new long[n][n];
        dp[0][0] = 1;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                int x = i + map[i][j];
                int y = j + map[i][j];
                if (map[i][j] == 0) continue;
                if (dp[i][j] == 0) continue;
                if ( x < n){
                    dp[x][j]++;
                }
                if ( y < n){
                    dp[i][y]++;
                }
            }
        }
        System.out.println(dp[n-1][n-1]);
    }
}
