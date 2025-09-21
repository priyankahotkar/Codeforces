import java.util.Scanner;

public class ShortestIncreasingPath {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        while (t-- > 0) {
            int x = sc.nextInt();
            int y = sc.nextInt();
            int ans = -1;
            if (x == y) {
                ans = -1;
            }

            else if (x < y) {
                ans = 2;
            }

            else if (x > y && x - y >= 2) {
                if (y == 1) {
                    ans = -1;
                } else {
                    ans = 3;
                }
            }

            System.out.println(ans);
        }
    }

    public static int gcd(int a, int b) {
        while (b != 0) {
            int temp = b;
            b = a % b;
            a = temp;
        }
        return a;
    }
}