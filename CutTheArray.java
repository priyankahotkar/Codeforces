import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class CutTheArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        while (t-- > 0) {
            int n = sc.nextInt();
            int[] a = new int[n];

            for (int i = 0; i < n; i++) {
                a[i] = sc.nextInt();
            }

            int[] prefixSum = new int[n];
            prefixSum[0] = a[0];

            for (int i = 1; i < n; i++) {
                prefixSum[i] = prefixSum[i - 1] + a[i];
            }

            boolean found = false;
            for (int l = 0; l < n - 2 && !found; l++) {
                for (int r = l + 1; r < n - 1 && !found; r++) {
                    int s1 = prefixSum[l] % 3;
                    int s2 = (prefixSum[r] - prefixSum[l]) % 3;
                    int s3 = (prefixSum[n - 1] - prefixSum[r]) % 3;

                    Set<Integer> set = new HashSet<>();
                    set.add(s1);
                    set.add(s2);
                    set.add(s3);

                    if (set.size() == 1 || set.size() == 3) {
                        System.out.println((l + 1) + " " + (r + 1));
                        found = true;
                    }
                }
            }
            if (!found) {
                System.out.println("0 0");
            }
        }
    }
}
