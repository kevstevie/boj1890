import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
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
        Queue<Node> bfs = new LinkedList<>();

        long count = 0;

        bfs.offer(new Node(0, 0));
        while (!bfs.isEmpty()) {
            Node now = bfs.poll();
            System.out.println(now.x +" "+ now.y);
            if (now.x == n - 1 && now.y == n - 1){
                count++;
                continue;
            }
            if (now.jump == 0 ) continue;
            if (now.x + now.jump < n) {
                bfs.offer(new Node(now.x + now.jump, now.y));
            } else if (now.y + now.jump <n){
                bfs.offer(new Node(now.x, now.y + now.jump));
            }
        }
        System.out.println(count);

    }
    static int[][] map;

    static class Node{
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
