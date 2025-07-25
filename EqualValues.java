import java.util.Scanner;

public class EqualValues {
    public static void main(String[] args) {
        EqualValues solution = new EqualValues();
        solution.solve();
    }

    public void solve() {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        while(t-- > 0) {
            int n = sc.nextInt();
            int[] nums = new int[n];
            for(int i = 0; i < n; i++) {
                nums[i] = sc.nextInt();
            }

            System.out.println(minCost(nums));
        }
    }

    public int minCost(int[] nums) {
        int n = nums.length;
        long minCost = Long.MAX_VALUE;

        for(int i = 0; i < n; i++) {
            long cost = 0;
            int target = nums[i];

            // Go left
            for(int j = i - 1; j >= 0; j--) {
                if(nums[j] != target) {
                    cost += (j + 1L) * target;
                    break; // only one left operation needed
                }
            }

            // Go right
            for(int j = i + 1; j < n; j++) {
                if(nums[j] != target) {
                    cost += (n - j) * 1L * target;
                    break; // only one right operation needed
                }
            }

            minCost = Math.min(minCost, cost);
        }
        return (int) minCost; // Return the minimum cost found
    }   
}
