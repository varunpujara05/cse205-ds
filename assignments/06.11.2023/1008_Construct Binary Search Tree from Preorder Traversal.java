/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */

class Solution {
    public TreeNode bstFromPreorder(int[] preorder) {
     return binTree(preorder, 0, preorder.length - 1);   
    }
    
    public TreeNode binTree(int[] preorder, int start, int end) {
        if(start > end) return null;
        
        TreeNode node = new TreeNode(preorder[start]);
        int i;

        for(i = start; i <= end; i++) {
        
        if(preorder[i] > node.val) break;
        }
        
        node.left = binTree(preorder, start+1, i-1);
        node.right = binTree(preorder, i, end);
        return node;
        
    }
    
}