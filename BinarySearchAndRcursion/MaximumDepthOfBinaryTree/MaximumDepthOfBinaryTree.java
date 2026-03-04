package BinarySearchAndRcursion.MaximumDepthOfBinaryTree;

class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;
    TreeNode(int x) {
        val = x;
    }
}

public class MaximumDepthOfBinaryTree {
    public static void main(String[] args) {
        // 建立測試樹: [3, 9, 20, null, null, 15, 7]
        TreeNode root = new TreeNode(3);
        root.left = new TreeNode(9);
        root.right = new TreeNode(20);
        root.right.left = new TreeNode(15);
        root.right.right = new TreeNode(7);

        Solution solution = new Solution();
        System.out.println("Max Depth: " + solution.maxDepth(root)); // 預設: 3
    }
}

class Solution {
    public int maxDepth(TreeNode root) {
        // 1. Base Case: 沒東西了，深度為 0
        if (root == null) {
            return 0;
        }

        // 2. 遞迴呼叫左右子樹
        int leftHeight = maxDepth(root.left);
        int rightHeight = maxDepth(root.right);

        // 3. 回傳較高的一邊，記得加 1 (目前這層)
        return Math.max(leftHeight, rightHeight) + 1;
    }
}