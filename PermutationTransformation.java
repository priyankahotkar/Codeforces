import java.util.HashMap;
import java.util.Scanner;

public class PermutationTransformation {
    class TreeNode {
        int val;
        TreeNode left, right;
        public TreeNode(int x) { this.val = x; }
    }

    HashMap<Integer, Integer> depthMap = new HashMap<>();

    public void solve() {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        while(t-- > 0) {
            int n = sc.nextInt();
            int[] perm = new int[n];
            for(int i = 0; i < n; i++) {
                perm[i] = sc.nextInt();
            }

            TreeNode root = buildTree(perm, 0, n - 1, 0);

            for(int i = 0; i < n; i++) {
                System.out.print(depthMap.get(perm[i]) + " ");
            }
            System.out.println();
        }
    }

    private TreeNode buildTree(int[] perm, int start, int end, int depth) {
        if(start > end) return null;

        int maxIdx = getMaxIndex(perm, start, end);
        TreeNode node = new TreeNode(perm[maxIdx]);
        depthMap.put(perm[maxIdx], depth);

        node.left = buildTree(perm, start, maxIdx - 1, depth + 1);
        node.right = buildTree(perm, maxIdx + 1, end, depth + 1);
        return node;
    }

    private int getMaxIndex(int[] perm, int start, int end) {
        int maxIdx = start;
        for(int i = start; i <= end; i++) {
            if(perm[i] > perm[maxIdx]) {
                maxIdx = i;
            }
        }
        return maxIdx;
    }

    public static void main(String[] args) {
        new PermutationTransformation().solve();
    }
}
