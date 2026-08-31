/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */

class Solution {
    public boolean isValidBST(TreeNode root) {
        // recursive dfs

        // start at root node
        // check if root.left < root -> dfs(root.left)
        // check if root.right > root -> dfs (root.right)
        // else return false
        // keep a min for a right subtree every value on the right subtree should be less than the min
        // keep 

        return dfs(root, Long.MIN_VALUE, Long.MAX_VALUE);
    }

    boolean dfs(TreeNode curr, long min, long max) {
        if (curr == null) {
            return true;
        }
        if(curr.val<=min || curr.val >= max ){
            return false;
        }

        return dfs(curr.left, min, curr.val) && dfs(curr.right, curr.val, max);
    }
}
