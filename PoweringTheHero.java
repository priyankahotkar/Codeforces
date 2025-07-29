import java.util.Scanner;
import java.util.PriorityQueue;
import java.util.Collections;

public class PoweringTheHero {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        while (t-- > 0) {
            int n = sc.nextInt();
            int[] s = new int[n];

            for (int i = 0; i < n; i++) {
                s[i] = sc.nextInt();
            }

            PriorityQueue<Integer> bonuses = new PriorityQueue<>(Collections.reverseOrder());
            long totalPower = 0;

            for (int i = 0; i < n; i++) {
                if (s[i] > 0) {
                    bonuses.add(s[i]);
                } else {
                    if (!bonuses.isEmpty()) {
                        totalPower += bonuses.poll();
                    }
                }
            }

            System.out.println(totalPower);
        }
    }
}
