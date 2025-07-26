import java.util.Scanner;

public class ContestProposal {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        final int N = 105;
        int[] a = new int[N];
        int[] b = new int[N];

        while (t-- > 0) {
            int n = sc.nextInt();

            for (int i = 1; i <= n; i++) {
                a[i] = sc.nextInt();
            }

            for (int i = 1; i <= n; i++) {
                b[i] = sc.nextInt();
            }

            int diff = 0;
            int ans = 0;

            for (int i = 1; i <= n; i++) {
                if (a[i - diff] > b[i]) {
                    diff++;
                    ans++;
                }
            }

            System.out.println(ans);
        }
    }
}
