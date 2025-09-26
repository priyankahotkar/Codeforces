import java.util.*;

public class AandB {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        while (t-- > 0) {
            int n = sc.nextInt();
            String s = sc.next();

            List<Integer> indicesA = new ArrayList<>();
            List<Integer> indicesB = new ArrayList<>();

            for (int i = 0; i < n; i++) {
                if (s.charAt(i) == 'a') {
                    indicesA.add(i);
                } else {
                    indicesB.add(i);
                }
            }

            long ans = Math.min(
                    minOps(indicesA),
                    minOps(indicesB));

            System.out.println(ans);
        }
    }

    private static long minOps(List<Integer> indices) {
        if (indices.isEmpty())
            return 0;

        int m = indices.size();
        int medianIndex = indices.get(m / 2);

        long ops = 0;
        for (int i = 0; i < m; i++) {
            int target = medianIndex - (m / 2) + i;
            ops += Math.abs(indices.get(i) - target);
        }
        return ops;
    }
}
