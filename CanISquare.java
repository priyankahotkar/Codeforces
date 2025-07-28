import java.util.Scanner;

public class CanISquare {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        while (t-- > 0) {
            int n = sc.nextInt();
            // int[] a = new int[n];
            long sum = 0;

            for (int i = 0; i < n; i++) {
                // a[i] = sc.nextInt();
                sum += sc.nextLong();
            }

            if (isSquare(sum)) {
                System.out.println("YES");
            } else {
                System.out.println("NO");
            }
        }
    }

    public static boolean isSquare(long num) {
        long start = 1;
        long end = (long) 1e9;

        while (start <= end) {
            long mid = start + (end - start) / 2;
            long sq = mid * mid;

            if (sq == num) {
                return true;
            } else if (sq < num) {
                start = mid + 1;
            } else {
                end = mid - 1;
            }
        }

        return false;
    }
}
