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
class BSTIterator {
    Stack<TreeNode> stack;

    public BSTIterator(TreeNode root) {

        stack = new Stack<>();
        TreeNode curr = root;

        while(curr != null){
            stack.push(curr);

            if(curr.left != null) curr = curr.left;
            else break;
        }
    }

    public boolean hasNext() {
        return !stack.isEmpty();
    }

    public int next() {

        TreeNode node = stack.pop();
        TreeNode curr = node;

        if(curr.right != null){
            curr = curr.right;

            while(curr != null){

                stack.push(curr);
                if(curr.left != null) curr = curr.left;
                else break;
            }
        }
        return node.val;
    }
}

/**
 * Your BSTIterator object will be instantiated and called as such:
 * BSTIterator obj = new BSTIterator(root);
 * int param_1 = obj.next();
 * boolean param_2 = obj.hasNext();
 */