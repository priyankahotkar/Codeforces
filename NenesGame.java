import java.util.Scanner;

public class NenesGame {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        while (t-- > 0) {
            int k = sc.nextInt();
            int q = sc.nextInt();
            int[] a = new int[k];
            int[] ni = new int[q];

            int min = Integer.MAX_VALUE;
            for (int i = 0; i < k; i++) {
                a[i] = sc.nextInt();
                min = Math.min(a[i], min);
            }

            for (int i = 0; i < q; i++) {
                ni[i] = sc.nextInt();
            }

            for (int i = 0; i < q; i++) {
                System.out.print(Math.min(ni[i], min - 1) + " ");
            }
            System.out.println();
        }
    }
}
