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
    public boolean hasPathSum(TreeNode root, int targetSum) {
        if(root==null ) return false;

        targetSum-=root.val;
        int sum=0;
        // hasPathSum(root.left,targetSum);
        // sum+=left.val;
        // hasPathSum(root.right,targetSum);
        // sum+=right.val;

        if(root.left==null && root.right==null) return targetSum==0;
        
       
        return hasPathSum(root.left,targetSum) || hasPathSum(root.right,targetSum);
    }
}