import java.util.Scanner;

public class LongestGoodArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        while (t-- > 0) {
            int l = sc.nextInt();
            int r = sc.nextInt();

            if (l == r) {
                System.out.println(1);
                continue;
            }

            r -= l;

            long start = 2, end = 1000000000;
            while (start < end) {
                long mid = start + (end - start) / 2;

                if (mid * (mid - 1) / 2 <= r) {
                    start = mid + 1;
                } else {
                    end = mid;
                }
            }

            System.out.println(start - 1);
        }
    }
}
