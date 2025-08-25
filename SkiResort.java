import java.util.Scanner;

public class SkiResort {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        while (t-- > 0) {
            int n = sc.nextInt();
            int k = sc.nextInt();
            int q = sc.nextInt();

            int[] a = new int[n];
            for (int i = 0; i < n; i++) {
                a[i] = sc.nextInt();
            }

            int left = 0;
            long count = 0;
            for (int right = 0; right < n; right++) {
                if (a[right] > q) {
                    left = right + 1;
                }
                if (right - left + 1 >= k) {
                    count += (right - left + 1) - k + 1;
                }
            }

            System.out.println(count);
        }
    }
}
