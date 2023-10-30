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
    public List<List<Integer>> zigzagLevelOrder(TreeNode root) {

        if(root ==null) return new ArrayList<>();
        
        List<List<Integer>> list = new ArrayList<>();
        Queue<TreeNode> q= new LinkedList<>();

        q.offer(root);

        boolean flag=true;

        while(!q.isEmpty()){
            int size= q.size();
            ArrayList<Integer> in_list= new ArrayList<>();
            
            for(int i=0; i<size; i++){
                TreeNode curr= q.poll();
                if(curr.left != null) q.offer(curr.left);
                if(curr.right != null) q.offer(curr.right);
                in_list.add(curr.val);                
            }
            if(!flag){
                Collections.reverse(in_list);
            }

            list.add(in_list);
            flag = !flag;

        }
        return list;
    }
}