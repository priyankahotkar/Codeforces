import java.util.Arrays;
import java.util.Scanner;

public class IWillDefinitelyMakeIt {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        while (t-- > 0) {
            int n = sc.nextInt();
            int p = sc.nextInt();
            int[] a = new int[n + 1]; // 1-based indexing
            for (int i = 1; i <= n; i++) {
                a[i] = sc.nextInt();
            }

            int cur = a[p];
            int dist = a[p];
            Arrays.sort(a, 1, n + 1); // Sort from index 1 to n
            boolean ans = true;

            for (int i = 1; i <= n; i++) {
                if (a[i] < cur) {
                    continue;
                }
                if (a[i] - cur > dist) {
                    ans = false;
                }
                cur = a[i];
            }

            System.out.println(ans ? "YES" : "NO");
        }

        sc.close();
    }
}