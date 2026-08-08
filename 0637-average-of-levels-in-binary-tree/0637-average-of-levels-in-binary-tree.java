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
    public List<Double> averageOfLevels(TreeNode root) {
        ArrayList<Double> list=new ArrayList<>();

        if(root==null) return new ArrayList<>();

        Queue<TreeNode> q=new LinkedList<>();
        q.add(root);
        while(!q.isEmpty()){
            int s=q.size();
            double ans=0;
            double sum=0;
            for(int i=0;i<s;i++){
            TreeNode cur=q.poll();
            sum+=cur.val;
            if(cur.left!=null){
                q.add(cur.left);
            }
            if(cur.right!=null){
                q.add(cur.right);
            }
            }
            ans=sum/s;
            list.add(ans);
            
        }
        return list;
    }
}