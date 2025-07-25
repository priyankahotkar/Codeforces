import java.util.Scanner;

public class Tournament {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        while (t-- > 0) {
            int n = sc.nextInt();
            int j = sc.nextInt();
            int k = sc.nextInt();
            int[] arr = new int[n];
            for(int i = 0; i < n; i++) {
                arr[i] = sc.nextInt();
            }

            if (isThereWay(n, j, k, arr)) {
                System.out.println("Yes");
            } else {
                System.out.println("No");
            }
        }
    }

    public static boolean isThereWay(int n, int j, int k, int[] arr) {
        if ((n-k)%2 == 0 && n-k >= 1) {
            return true;
        } else {
            return false;
        }
    }
}
