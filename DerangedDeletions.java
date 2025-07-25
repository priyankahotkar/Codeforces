import java.util.Scanner;

public class DerangedDeletions {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        while (t-- > 0) {
            int n = sc.nextInt();
            int[] a = new int[n];

            for (int i = 0; i < n; i++) {
                a[i] = sc.nextInt();
            }

            boolean found = false;
            for (int i = 0; i < n && !found; i++) {
                for (int j = i + 1; j < n; j++) {
                    if (a[i] > a[j]) {
                        System.out.println("YES");
                        System.out.println(2);
                        System.out.println(a[i] + " " + a[j]);
                        found = true;
                        break;
                    }
                }
            }

            if (!found) {
                System.out.println("NO");
            }
        }

        sc.close();
    }
}
