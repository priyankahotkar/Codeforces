import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class SeatingInABus {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        while (t-- > 0) {
            int n = sc.nextInt();
            int[] a = new int[n];

            for (int i = 0; i < n; i++) {
                a[i] = sc.nextInt();
            }

            Set<Integer> occupied = new HashSet<>();
            occupied.add(a[0]);
            boolean canSit = true;

            for (int i = 1; i < n; i++) {
                if (occupied.contains(a[i] - 1) || occupied.contains(a[i] + 1)) {
                    occupied.add(a[i]);
                } else {
                    canSit = false;
                    break;
                }

            }

            if (canSit) {
                System.out.println("YES");
            } else {
                System.out.println("NO");
            }
        }
    }
}
