import java.util.*;

public class HiddenKnowledgeOfAncient {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        while (t-- > 0) {
            int n = sc.nextInt();
            int k = sc.nextInt();
            int l = sc.nextInt();
            int r = sc.nextInt();

            int[] a = new int[n];
            for (int i = 0; i < n; i++) {
                a[i] = sc.nextInt();
            }

            long ans = (countAtMostK(a, k, r) - countAtMostK(a, k, l - 1))
                    - (countAtMostK(a, k - 1, r) - countAtMostK(a, k - 1, l - 1));

            System.out.println(ans);
        }
    }

    private static long countAtMostK(int[] a, int k, int maxLen) {
        if (k < 0 || maxLen <= 0)
            return 0;
        int n = a.length;
        Map<Integer, Integer> freq = new HashMap<>();
        int left = 0;
        long res = 0;

        for (int right = 0; right < n; right++) {
            freq.put(a[right], freq.getOrDefault(a[right], 0) + 1);

            while (freq.size() > k) {
                freq.put(a[left], freq.get(a[left]) - 1);
                if (freq.get(a[left]) == 0) {
                    freq.remove(a[left]);
                }
                left++;
            }

            int windowSize = right - left + 1;
            res += Math.min(windowSize, maxLen);
        }
        return res;
    }
}
