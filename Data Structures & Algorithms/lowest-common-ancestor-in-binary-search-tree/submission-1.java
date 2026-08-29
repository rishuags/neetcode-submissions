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
    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {

        // traverse from root (bfs or dfs) until you find p and q 

        // once both are found, work your way back? 

        // use bst properties to find it? 

        // p is less than root so left subtree, 8 is more than root so right subtree
        // root.left and root.right
        // p found and q found

        ///////

        // if p = 4, and q = 7 
        // common ancestor is 5

        // start at root, p < root, left subtree, root.left, 
        // q > root, right subtree, root.right 

        // currRight pointer is at 3, currLeft pointer is at 8 

        // p > currLeft, currLeft = currLeft.right (else, currLeft=currLeft.left)

        // q < currRight, currRight = currRight.left (else currRight=currRight.right)


        TreeNode curr = root;

        //if p < root and q < root left subtree, curr=curr.left
        //if p > root and q > root right subtree, curr=curr.right
        //if p < root and q > root, ancestor = root  
        // if p or q == root, root

        while(curr!=null){
            if(p.val<curr.val && q.val<curr.val){
                curr=curr.left;
            } else if(p.val>curr.val && q.val>curr.val){
                curr=curr.right;
            } else { // cases where p < curr + q > curr or vice versa or p or q = curr
                return curr;
            }
        }


    /*
    both smaller than curr
    → LCA must be somewhere left 
    both bigger than curr
    → LCA must be somewhere right
    otherwise
    → they split here, or curr is p/q
    → curr is the LCA
    */



        return null;

        
    }
}
