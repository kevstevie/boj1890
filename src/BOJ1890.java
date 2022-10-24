import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;
import java.util.StringTokenizer;

class BOJ1890 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        map = new int[n][n];
        for (int i = 0; i < n; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            for (int j = 0; j < n; j++) {
                map[i][j] = Integer.parseInt(st.nextToken());
            }
        }
        Stack<Node> dfs = new Stack<>();

    }
    static int[][] map;


    class Node{
        int x;
        int y;
        int jump;

        public Node(int x, int y) {
            this.x = x;
            this.y = y;
            jump = map[x][y];
        }
    }
}
