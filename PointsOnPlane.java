import java.util.Scanner;

public class PointsOnPlane {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long t = sc.nextLong();

        while (t-- > 0) {
            long n = sc.nextLong();

            long ans = (long) Math.sqrt(n);

            while (ans * ans > n) {
                ans--;
            }

            while (ans * ans < n) {
                ans++;
            }

            System.out.println(ans - 1);
        }
    }
}
