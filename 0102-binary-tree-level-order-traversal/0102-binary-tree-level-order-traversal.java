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
    public List<List<Integer>> levelOrder(TreeNode root) {
        List<List<Integer>> list=new ArrayList<>();
        Queue<TreeNode> q=new LinkedList<>();
        q.add(root);
        if(root==null) return  new ArrayList<>();

        while(!q.isEmpty()){
           int s=q.size();
           ArrayList<Integer> a=new ArrayList<>();
           for(int i=0;i<s;i++){
            TreeNode cur=q.poll();
            a.add(cur.val);
            if(cur.left!=null){
                q.add(cur.left);
            }
            if(cur.right!=null)
            {
                q.add(cur.right);
            }
           }
              list.add(a);
        }
        return list;
    }
}