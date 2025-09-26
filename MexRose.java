import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;

public class MexRose {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        while (t-- > 0) {
            int n = sc.nextInt();
            int k = sc.nextInt();
            int[] a = new int[n];
            Map<Integer, List<Integer>> map = new HashMap<>();

            for (int i = 0; i < n; i++) {
                a[i] = sc.nextInt();
                map.putIfAbsent(a[i], new ArrayList<>());
                map.get(a[i]).add(i);
            }

            int opr = 0;
            if (map.containsKey(k)) {
                opr += map.get(k).size();
            }
            int op1 = 0;
            for (int i = 0; i < k; i++) {
                if (!map.containsKey(i)) {
                    op1++;
                }
            }

            opr = Math.max(opr, op1);

            System.out.println(opr);
        }
    }
}