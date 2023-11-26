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

    public boolean findTarget(TreeNode root, int k) {
    return run(root, root, k);
}

public boolean run(TreeNode root, TreeNode currNode, int k) {

    if (currNode == null) return false;
    if (search(root, k-currNode.val, currNode)) return true;
    
    return run(root, currNode.left, k) || run(root, currNode.right, k);
}

public boolean search(TreeNode root, int val, TreeNode curr) {

    if (root == null) return false;
    if (val > root.val) return search(root.right, val, curr);
    else if (val < root.val) return search(root.left, val, curr);
    else if (val == root.val) return root != curr;
    
    return false;
    }
}