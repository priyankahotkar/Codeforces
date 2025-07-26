import java.util.Scanner;

public class RakhshsRevival {
    static final int MAXN = 200010;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int q = sc.nextInt();

        while (q-- > 0) {
            int n = sc.nextInt();
            int m = sc.nextInt();
            int k = sc.nextInt();
            String s = sc.next();

            int[] ps = new int[n + 1]; // prefix array to track decrements
            int ans = 0;
            int cnt = 0;
            int sum = 0;

            for (int i = 0; i < n; i++) {
                sum += ps[i];
                if (sum > 0 || s.charAt(i) == '1') {
                    cnt = 0;
                } else {
                    cnt++;
                    if (cnt == m) {
                        ans++;
                        sum++;
                        cnt = 0;
                        if (i + k < n) {
                            ps[i + k]--;
                        }
                    }
                }
            }

            System.out.println(ans);
        }
    }
}
