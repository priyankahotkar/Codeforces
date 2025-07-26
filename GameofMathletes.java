import java.util.HashMap;
import java.util.Scanner;

public class GameofMathletes {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        while (t-- > 0) {
            int n = sc.nextInt();
            int k = sc.nextInt();
            int[] a = new int[n];

            for (int i = 0; i < n; i++) {
                a[i] = sc.nextInt();
            }

            HashMap<Integer, Integer> freq = new HashMap<>();
            for (int x : a) {
                freq.put(x, freq.getOrDefault(x, 0) + 1);
            }

            int score = 0;

            for (int x : a) {
                int y = k - x;

                // If both x and y are available
                if (freq.getOrDefault(x, 0) > 0 && freq.getOrDefault(y, 0) > 0) {
                    // Special case: x == y
                    if (x == y && freq.get(x) >= 2) {
                        score++;
                        freq.put(x, freq.get(x) - 2);
                    }
                    // General case: x != y
                    else if (x != y) {
                        score++;
                        freq.put(x, freq.get(x) - 1);
                        freq.put(y, freq.get(y) - 1);
                    }
                }
            }

            System.out.println(score);
        }

        sc.close();
    }
}
