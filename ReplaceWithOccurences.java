import java.util.*;

public class ReplaceWithOccurences {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        while (t-- > 0) {
            int n = sc.nextInt();
            int[] b = new int[n];
            @SuppressWarnings("unchecked")
            ArrayList<Integer>[] posi = new ArrayList[n + 1];
            int[] freq = new int[n + 1];
            long sum = 0;

            for (int i = 0; i < n; i++) {
                b[i] = sc.nextInt();
                if (posi[b[i]] == null)
                    posi[b[i]] = new ArrayList<>();
                posi[b[i]].add(i);
                freq[b[i]]++;
            }

            for (int x = 1; x <= n; x++) {
                if (freq[x] > 0)
                    sum += x;
            }

            if (sum > n) {
                System.out.println(-1);
                continue;
            }

            boolean notPossible = false;
            for (int x = 1; x <= n; x++) {
                if (freq[x] % x != 0) {
                    notPossible = true;
                    break;
                }
            }

            if (notPossible) {
                System.out.println(-1);
                continue;
            }

            int ele = 1;
            int[] a = new int[n];
            for (int x = 1; x <= n; x++) {
                if (posi[x] == null)
                    continue;
                int idx = 0;
                while (idx < posi[x].size()) {
                    for (int k = 0; k < x; k++) {
                        a[posi[x].get(idx++)] = ele;
                    }
                    ele++;
                }
            }

            for (int i = 0; i < n; i++) {
                System.out.print(a[i] + (i == n - 1 ? "\n" : " "));
            }
        }
    }
}
