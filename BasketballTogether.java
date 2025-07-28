import java.util.*;

public class BasketballTogether {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int d = sc.nextInt();

        Integer[] powers = new Integer[n];
        for (int i = 0; i < n; i++) {
            powers[i] = sc.nextInt();
        }

        Arrays.sort(powers); // Ascending order

        int wins = 0;
        int l = 0;
        int r = n - 1;

        while (l <= r) {
            int k = d / powers[r] + 1; // number of players in a team

            if (r - l + 1 >= k) { // are k players available ?
                wins++;
                r--; // use strongest player
                l += k - 1; // use k-1 weakest players
            } else {
                break;
            }
        }

        System.out.println(wins);
    }
}
