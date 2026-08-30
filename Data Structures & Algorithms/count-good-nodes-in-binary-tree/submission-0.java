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
    public int goodNodes(TreeNode root) {

        // nodes  between root and node x, < x 

        // root will always be good

        // curr = root, 

        // search curr.left and curr.right 
        // good node counter =>  count

        //
        // left = curr.left right = curr.right
        // if left > curr count++ (first level only) -> curr=curr.left -> call program again 
        // if right > curr count++ (first level only) -> curr=curr.right -> call program again 

        // else call program on its own ? without counter ++ but keeping track of path? 






        return dfs(root, root.val);



        
        // 




        
    }

    int dfs(TreeNode node, int max){
        if(node==null){
            return 0;
        }

        int sum;

        if (node.val >= max) {
            sum = 1;
        } else {
            sum = 0;
        }

        max = Math.max(max, node.val);

        sum = sum + dfs(node.left, max);
        sum = sum + dfs(node.right, max);
        return sum; 
    }
}
