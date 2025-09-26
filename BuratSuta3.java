import java.util.Arrays;
import java.util.Scanner;

public class BuratSuta3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        while (t-- > 0) {
            int n = sc.nextInt();
            int q = sc.nextInt();
            int[] arr = new int[n];
            int[][] queries = new int[q][2];

            for (int i = 0; i < n; i++) {
                arr[i] = sc.nextInt();
            }
            for (int i = 0; i < q; i++) {
                queries[i][0] = sc.nextInt();
                queries[i][1] = sc.nextInt();
            }

            for (int i = 0; i < q; i++) {
                int l = queries[i][0];
                int r = queries[i][1];
                int val = (r - l + 1) / 3;
                binarySearch(arr, val, l, r);
                System.out.println();
            }
        }
    }

    public static void binarySearch(int[] arr, int val, int l, int r) {
        int ans = -1;
        int si = 0;
        int ei = r - l + 1;
        int[] copy = Arrays.copyOfRange(arr, l, r + 1);
        Arrays.sort(copy);

        while (si <= ei) {
            int mid = si + (ei - si) / 2;
            if (copy[mid] >= val) {
                ans = mid;
                ei = mid - 1;
            } else {
                si = mid + 1;
            }
        }

        if (ans == -1) {
            System.out.print(-1);
        } else {
            for (int i = ans; i < copy.length; i++) {
                System.out.print(copy[i] + " ");
            }
        }
    }
}
