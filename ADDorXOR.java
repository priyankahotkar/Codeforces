import java.util.Scanner;

public class ADDorXOR {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        while (t-- > 0) {
            int a = sc.nextInt();
            int b = sc.nextInt();
            int x = sc.nextInt();
            int y = sc.nextInt();

            if (b == a) {
                System.out.println(0);
            } else if (b < a) {
                if (b == (a ^ 1)) {
                    System.out.println(y);
                } else {
                    System.out.println(-1);
                }
            } else {
                int c0 = b - a; // total steps
                int c1 = ((b + 1) >> 1) - ((a + 1) >> 1); // steps starting at even numbers

                if (y > x) {
                    System.out.println(1L * c0 * x);
                } else {
                    System.out.println(1L * (c0 - c1) * x + 1L * c1 * y);
                }

            }
        }
    }
}
