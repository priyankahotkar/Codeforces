import java.util.ArrayList;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;
import java.util.Scanner;
import java.util.Set;

public class GoldRush {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            int n = sc.nextInt();
            int m = sc.nextInt();
            List<Integer> piles = new ArrayList<>();
            piles.add(n);
            System.out.println(isPossible(n, m) ? "YES" : "NO");
        }
    }

    // DFS Approach - TLE
    // public static boolean isPossible(List<Integer> piles, int pileSize, int m) {
    // if (pileSize == m) {
    // return true;
    // }
    // if (pileSize < m) {
    // return false;
    // }

    // for (int i = 1; i * 3 <= pileSize; i++) {
    // if (i + 2 * i == pileSize) {
    // piles.add(i);
    // piles.add(2 * i);
    // if (isPossible(piles, i, m) || isPossible(piles, 2 * i, m)) {
    // return true;
    // }
    // piles.remove(piles.size() - 1);
    // piles.remove(piles.size() - 1);
    // }
    // }

    // return false;
    // }

    // BFS Approach
    public static boolean isPossible(int n, int m) {
        if (n < m)
            return false;
        Queue<Integer> q = new LinkedList<>();
        Set<Integer> visited = new HashSet<>();

        q.add(n);
        visited.add(n);

        while (!q.isEmpty()) {
            int curr = q.remove();
            if (curr == m) {
                return true;
            }

            if (curr % 3 != 0) {
                continue;
            }

            int a = curr / 3;
            int b = a * 2;

            if (!visited.contains(a)) {
                q.add(a);
                visited.add(a);
            }

            if (!visited.contains(b)) {
                q.add(b);
                visited.add(b);
            }
        }

        return false;
    }
}
