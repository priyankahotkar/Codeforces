import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            String s = sc.next();
            int val = Integer.parseInt(s);

            int low = 0, high = 100;
            boolean found = false;

            while (low <= high) {
                int mid = (low + high) / 2;
                int square = mid * mid;

                if (square == val) {
                    System.out.println(0 + " " + mid);  // a = 0, b = mid
                    found = true;
                    break;
                } else if (square < val) {
                    low = mid + 1;
                } else {
                    high = mid - 1;
                }
            }

            if (!found) {
                System.out.println(-1);
            }
        }
    }
}
