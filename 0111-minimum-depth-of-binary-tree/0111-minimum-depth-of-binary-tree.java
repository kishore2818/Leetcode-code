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
    public int minDepth(TreeNode root) {
        Queue<TreeNode> q=new LinkedList<>();
        if(root==null) return 0;
        q.add(root);
        int ld=0;
        int rd=0;
        int c=1;
        
        while(!q.isEmpty()){
            int s=q.size();
           for(int i=0;i<s;i++)
           {
            TreeNode temp=q.poll();
            if(temp.left==null && temp.right==null) return c;
           
           if(temp.left!=null) q.add(temp.left);
           if(temp.right!=null)q.add((temp.right)); 
           }
           c++;
        
    
        }
        return c;
    }
}