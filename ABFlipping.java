import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class ABFlipping {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        while (t-- > 0) {
            int n = sc.nextInt();
            String s = sc.next();

            char[] arr = s.toCharArray();
            int pt1 = 0;
            int pt2 = 0;
            int ans = 0;

            while (pt1 < n && arr[pt1] == 'B') {
                pt1++;
                pt2++;
            }

            while (pt1 < n) {
                int countA = 0;
                int countB = 0;

                while (pt2 < n && arr[pt2] == 'A') {
                    countA++;
                    pt2++;
                }
                while (pt2 < n && arr[pt2] == 'B') {
                    countB++;
                    pt2++;
                }

                if (arr[pt2 - 1] == 'B') {
                    ans += pt2 - pt1 - 1;
                }

                if (countB > 0) {
                    pt1 = pt2 - 1;
                } else {
                    break;
                }
            }

            System.out.println(ans);
        }
    }

    // public static void flip(char[] arr, Set<Integer> indices) {
    // boolean canFlip = false;
    // for (int i = 0; i < arr.length - 1; i++) {
    // if (arr[i] == 'A' && arr[i + 1] == 'B' && !indices.contains(i)) {
    // arr[i + 1] = 'A';
    // arr[i] = 'B';
    // flips++;
    // canFlip = true;
    // }
    // }

    // if (canFlip) {
    // flip(arr, indices);
    // } else {
    // return;
    // }
    // }
}
