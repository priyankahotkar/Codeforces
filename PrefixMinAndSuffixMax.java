import java.util.Arrays;
import java.util.Scanner;

public class PrefixMinAndSuffixMax {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        while (t-- > 0) {
            int n = sc.nextInt();
            int[] a = new int[n + 1];
            int[] prefix = new int[n + 1];
            int[] suffix = new int[n + 2];
            Arrays.fill(prefix, Integer.MAX_VALUE);

            for (int i = 1; i <= n; i++) {
                a[i] = sc.nextInt();
                prefix[i] = Math.min(a[i], prefix[i - 1]);
            }

            for (int i = n; i >= 0; i--) {
                suffix[i] = Math.max(suffix[i + 1], a[i]);
            }

            for (int i = 1; i <= n; i++) {
                System.out.print(a[i] == prefix[i] || a[i] == suffix[i] ? "1" : "0");
            }
            System.out.println();
        }
    }
}
