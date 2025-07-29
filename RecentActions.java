import java.util.*;

public class RecentActions {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        while (t-- > 0) {
            int n = sc.nextInt();
            int m = sc.nextInt();
            int[] p = new int[m];
            for (int i = 0; i < m; i++) {
                p[i] = sc.nextInt();
            }

            Deque<Integer> field = new ArrayDeque<>();
            Set<Integer> inField = new HashSet<>();
            int[] result = new int[n + 1];
            Arrays.fill(result, -1);

            // Initially [1..n]
            for (int i = 1; i <= n; i++) {
                field.addLast(i);
                inField.add(i);
            }

            for (int time = 1; time <= m; time++) {
                int post = p[time - 1];

                if (inField.contains(post)) {
                    // Already present, do nothing (no movement needed)
                    continue;
                }

                // Insert new post at front
                field.addFirst(post);
                inField.add(post);

                // Remove last (oldest)
                int removed = field.removeLast();
                inField.remove(removed);

                if (removed <= n && result[removed] == -1) {
                    result[removed] = time;
                }
            }

            // Print removal times for posts 1 to n
            for (int i = 1; i <= n; i++) {
                System.out.print(result[i] + " ");
            }
            System.out.println();
        }
    }
}
