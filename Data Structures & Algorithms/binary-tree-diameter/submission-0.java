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
    public int diameterOfBinaryTree(TreeNode root) {
        int answer [] = new int [1];
        search(root, answer);
        return answer[0];


        
    }

    int search(TreeNode root, int[] answer){
        if(root == null){
            return 0;
        }

        int left = search (root.left, answer);
        int right = search (root.right, answer);
        answer[0] = Math.max(answer[0], left+right);
        return 1 + Math.max(left, right);
    }
}
