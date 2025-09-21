import java.util.Scanner;

public class MultipleConstruction {

    public static void solve(int n) {
        int[] arr = new int[2 * n];

        for (int x = n; x >= 1; x--) {
            for (int i = 2 * n - 1; i >= 0; i--) {
                int j = i + x;
                if (j < 2 * n && arr[i] == 0 && arr[j] == 0) {
                    arr[i] = x;
                    arr[j] = x;
                    break;
                }
            }
        }

        for (int a : arr) {
            System.out.print((a >= 1 ? a : 1) + " ");
        }

        System.out.println();
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            int n = sc.nextInt();
            solve(n);
        }
    }
}
