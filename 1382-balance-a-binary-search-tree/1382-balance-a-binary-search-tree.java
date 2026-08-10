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
    
    public List<Integer> inorder(TreeNode root,ArrayList<Integer> list){
        if(root==null) return new ArrayList<>();

        
        inorder(root.left,list);
        list.add(root.val);
        inorder(root.right,list);
        
        return list;
    }
    public TreeNode balance(ArrayList<Integer> list,int left,int right){
        if(left>right) return null;
        int mid=left+(right-left)/2;
        TreeNode root=new TreeNode(list.get(mid));
        root.left=balance(list,left,mid-1);
        root.right=balance(list,mid+1,right);

        return root;
    }
    public TreeNode balanceBST(TreeNode root) {
        ArrayList<Integer> list=new ArrayList<>();
        inorder(root,list);
        
        return balance(list,0,list.size()-1);
    }
}