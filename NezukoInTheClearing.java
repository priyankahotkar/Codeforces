import java.util.*;

public class NezukoInTheClearing {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        while (t-- > 0) {
            long h = sc.nextLong();
            int d = sc.nextInt();

            // Case 1: Enough health to go straight
            if (h > (long) d * (d + 1) / 2) {
                System.out.println(d);
                continue;
            }

            // Find maximum streak m
            long left = 0, right = d, m = 0;
            while (left <= right) {
                long mid = (left + right) / 2;
                if (mid * (mid + 1) / 2 <= h) {
                    m = mid;
                    left = mid + 1;
                } else {
                    right = mid - 1;
                }
            }

            // Simulate remaining moves
            long health = h - m * (m + 1) / 2;
            int pos = (int) m;
            long turns = m;
            int consecutive = (int) m + 1; // next cost if continued

            while (pos < d) {
                if (health - consecutive <= 0) {
                    health++;
                    consecutive = 1;
                    turns++;
                } else {
                    health -= consecutive;
                    pos++;
                    consecutive++;
                    turns++;
                }
            }

            System.out.println(turns);
        }
    }
}
