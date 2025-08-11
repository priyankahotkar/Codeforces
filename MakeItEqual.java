import java.util.Arrays;
import java.util.Scanner;

public class MakeItEqual {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            int n = sc.nextInt();
            long k = sc.nextLong();
            long[] A = new long[n], B = new long[n];

            for (int i = 0; i < n; i++) {
                A[i] = sc.nextLong() % k;
            }

            for (int i = 0; i < n; i++) {
                B[i] = sc.nextLong() % k;
            }

            for (int i = 0; i < n; i++) {
                A[i] = Math.min(A[i], (k - A[i]) % k);
                B[i] = Math.min(B[i], (k - B[i]) % k);
            }

            Arrays.sort(A);
            Arrays.sort(B);
            System.out.println(Arrays.equals(A, B) ? "YES" : "NO");
        }
    }
}
