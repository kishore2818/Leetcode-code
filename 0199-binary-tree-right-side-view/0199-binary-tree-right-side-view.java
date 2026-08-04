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
    public List<Integer> rightSideView(TreeNode root) {
        ArrayList<Integer> list=new ArrayList<>();
        Queue<TreeNode> q=new LinkedList<>();
        q.add(root);
        if(root==null) return new ArrayList<>(); 
        while(!q.isEmpty()){
            int size=q.size();
            for(int i=0;i<size;i++){
                TreeNode cur=q.poll();
                if(size-1==i) list.add(cur.val);

                if(cur.left!=null){
                    q.add(cur.left);
                }

                if(cur.right!=null){
                    q.add(cur.right);
                }
            }
        }
        return list;
    }
}