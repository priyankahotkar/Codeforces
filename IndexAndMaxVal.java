import java.util.Scanner;

public class IndexAndMaxVal {
    public static void main(String[] args) {
        IndexAndMaxVal sol = new IndexAndMaxVal();
        sol.solve();
    }

    public void solve() {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        while(t-- > 0) {
            int n = sc.nextInt();
            int m = sc.nextInt();
            long[] nums = new long[n];
            for(int i = 0; i < n; i++) {
                nums[i] = sc.nextLong();
            }
            long[] ans = new long[m];
            for (int i = 0; i < m; i++) {
                char c = sc.next().charAt(0);
                long l = sc.nextLong();
                long r = sc.nextLong();

                if(c == '+') {
                    for(int j = (int) ((l-1 >= 0) ? l-1 : 0); j < n; j++) {
                        if (nums[j] >= l && nums[j] <= r) {
                            nums[j] += 1; 
                        }
                    }
                }
                else {
                    for(int j = (int) ((l-1 >= 0) ? l-1 : 0); j < n; j++) {
                        if (nums[j] >= l && nums[j] <= r) {
                            nums[j] -= 1; 
                        }
                    }
                }
                long maxVal = Long.MIN_VALUE;
                for (int j = 0; j < nums.length; j++) {
                    maxVal = Math.max(maxVal, nums[j]);
                }
                ans[i] = maxVal;
            }
            for (int i = 0; i < ans.length; i++) {
                System.out.print(ans[i] + " ");
            }
            for (int i = 0; i < nums.length; i++) {
                System.out.print(nums[i] + " ");
            }
            System.out.println();
        }
    }
}
