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
    TreeNode pre=null;
    int min=Integer.MAX_VALUE;
    public int minDiffInBST(TreeNode root) {
        diff(root);
        return min;
    }
    public void diff(TreeNode root){
        if(root==null) return ;

        diff(root.left);
        if(pre!=null) {
            min=Math.min(min,root.val-pre.val);
        }
        pre=root;
        diff(root.right);
        
        }
    }
