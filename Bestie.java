import java.util.Scanner;

public class Bestie {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        while (t-- > 0) {
            int n = sc.nextInt();
            int[] a = new int[n];
            for (int i = 0; i < n; i++) {
                a[i] = sc.nextInt();
            }

            int g = a[0];
            for (int i = 1; i < n; i++)
                g = gcd(g, a[i]);

            if (g == 1) {
                System.out.println(0);
                continue;
            }

            int g1 = g;
            g1 = gcd(g1, gcd(a[n - 1], n));
            if (g1 == 1) {
                System.out.println(1);
                continue;
            }

            int g2 = g;
            g2 = gcd(g2, gcd(a[n - 2], n - 1));
            if (g2 == 1) {
                System.out.println(2);
                continue;
            }

            System.out.println(3);
        }
    }

    public static int gcd(int a, int b) {
        return b == 0 ? a : gcd(b, a % b);
    }
}
