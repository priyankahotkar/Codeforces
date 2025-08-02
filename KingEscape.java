import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class KingEscape {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] a = new int[2]; // Queen's position
        int[] b = new int[2]; // King's position
        int[] c = new int[2]; // Target position

        for (int i = 0; i < 2; i++)
            a[i] = sc.nextInt() - 1;
        for (int i = 0; i < 2; i++)
            b[i] = sc.nextInt() - 1;
        for (int i = 0; i < 2; i++)
            c[i] = sc.nextInt() - 1;

        if (!sameRegion(a[0], a[1], b[0], b[1], c[0], c[1])) {
            System.out.println("NO");
        } else {
            bfs(n, a, b, c);
        }
    }

    public static boolean sameRegion(int qx, int qy, int x1, int y1, int x2, int y2) {
        return (x1 < qx && x2 < qx || x1 > qx && x2 > qx || x1 == qx && x2 == qx) &&
                (y1 < qy && y2 < qy || y1 > qy && y2 > qy || y1 == qy && y2 == qy);
    }

    public static boolean isUnderAttack(int x, int y, int qx, int qy) {
        return x == qx || y == qy || Math.abs(x - qx) == Math.abs(y - qy);
    }

    public static void bfs(int n, int[] a, int[] b, int[] c) {
        boolean[][] visited = new boolean[n][n];
        Queue<int[]> queue = new LinkedList<>();

        queue.offer(new int[] { b[0], b[1] });
        visited[b[0]][b[1]] = true;

        int[][] directions = {
                { 0, 1 }, { 1, 0 }, { 1, 1 }, { -1, 0 },
                { 0, -1 }, { -1, -1 }, { -1, 1 }, { 1, -1 }
        };

        while (!queue.isEmpty()) {
            int[] curr = queue.poll();
            int x = curr[0], y = curr[1];

            if (x == c[0] && y == c[1]) {
                System.out.println("YES");
                return;
            }

            for (int[] dir : directions) {
                int nx = x + dir[0], ny = y + dir[1];

                if (nx >= 0 && ny >= 0 && nx < n && ny < n &&
                        !visited[nx][ny] && !isUnderAttack(nx, ny, a[0], a[1])) {
                    visited[nx][ny] = true;
                    queue.offer(new int[] { nx, ny });
                }
            }
        }

        System.out.println("NO");
    }
}
