import java.util.*;

public class BinaryStringBattle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            int n = sc.nextInt(), k = sc.nextInt();
            String s = sc.next();

            boolean bobWins = false;

            // Check for any substring of length k that is all '1's
            int count = 0;
            for (int i = 0; i < k; i++) {
                if (s.charAt(i) == '1') count++;
            }

            if (count == k) {
                bobWins = true;
            } else {
                for (int i = k; i < n; i++) {
                    if (s.charAt(i - k) == '1') count--;
                    if (s.charAt(i) == '1') count++;
                    if (count == k) {
                        bobWins = true;
                        break;
                    }
                }
            }

            System.out.println(bobWins ? "Bob" : "Alice");
        }
    }
}
