import java.util.Scanner;

public class InTheDream {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        while (t-- > 0) {
            int a = sc.nextInt();
            int b = sc.nextInt();
            int c = sc.nextInt();
            int d = sc.nextInt();
            c -= a;
            d -= b;

            boolean ok = (2 * Math.min(a, b) + 2 >= Math.max(a, b))
                    && (2 * Math.min(c, d) + 2 >= Math.max(c, d));

            System.out.println(ok ? "YES" : "NO");
        }
    }
}
