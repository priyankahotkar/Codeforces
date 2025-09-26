import java.util.Scanner;

public class BePositive {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        while (t-- > 0) {
            int n = sc.nextInt();
            int[] a = new int[n];
            int numberOfZeroes = 0;
            int numberOfMinusOnes = 0;

            for (int i = 0; i < n; i++) {
                a[i] = sc.nextInt();
                if (a[i] == -1) {
                    numberOfMinusOnes++;
                }
                if (a[i] == 0) {
                    numberOfZeroes++;
                }
            }

            int ans = 0;
            ans += (numberOfMinusOnes % 2) * 2;
            ans += numberOfZeroes;
            System.out.println(ans);
        }
    }
}