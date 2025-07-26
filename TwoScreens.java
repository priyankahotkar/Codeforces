import java.util.Scanner;

public class TwoScreens {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int q = sc.nextInt();
        sc.nextLine();

        while (q-- > 0) {
            String s = sc.nextLine();
            String t = sc.nextLine();

            int n = s.length();
            int m = t.length();
            int lcp = 0;

            for (int i = 1; i <= Math.min(n, m); i++) {
                if (s.substring(0, i).equals(t.substring(0, i))) {
                    lcp = i; // Update longest common prefix
                } else {
                    break; // No longer matching
                }
            }

            System.out.println(n + m - Math.max(lcp, 1) + 1);
        }

        sc.close();
    }
}
