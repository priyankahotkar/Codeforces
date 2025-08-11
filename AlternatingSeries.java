import java.util.Scanner;

public class AlternatingSeries {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            int n = sc.nextInt();
            if (n == 2) {
                System.out.println("-1 2");
            } else {
                for (int i = 0; i < n; i++) {
                    if (i % 2 == 0) {
                        System.out.print("-1 ");
                    } else {
                        if (i == n - 1 && n % 2 == 0) {
                            System.out.print("2 "); // last element when even
                        } else {
                            System.out.print("3 ");
                        }
                    }
                }
                System.out.println();
            }
        }
    }
}
