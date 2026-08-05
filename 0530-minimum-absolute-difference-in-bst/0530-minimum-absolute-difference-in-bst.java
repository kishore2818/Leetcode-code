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
    ArrayList<Integer> list=new ArrayList<>();
    public int getMinimumDifference(TreeNode root) {
        // if(root==null) return 0;
        // int ans=root.val;
        // int 
        // getMinimumDifference(root.left);
        // // int min=root.val-ans;
        // min=Math.min(ans,root.val);
        // getMinimumDifference(root.right);
        // min=Math.min(ans,root.val);
        int ans=inorder(root);
        return ans;
        
    }
    public int inorder(TreeNode root){
        if(root!=null){
            inorder(root.left);
            list.add(root.val);
            inorder(root.right);
        }

        int min=Integer.MAX_VALUE;
        int dif=0;
        for(int i=1;i<list.size();i++){
            dif=list.get(i)-list.get(i-1);
            min=Math.min(min,dif);
        }
        return min;
    }
}