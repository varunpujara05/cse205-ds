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
    public List<List<Integer>> verticalTraversal(TreeNode root) {
    
    List<List<Integer>> ans = new ArrayList<>();

    if (root == null)
        return ans;
    
    PriorityQueue<Node> pq = new PriorityQueue<Node>(new Node());
    traverse(root, 0, 0, pq);
    
    while (!pq.isEmpty()) {
        int curr = pq.peek().x;
        List<Integer> list = new ArrayList<>();
        
        while (!pq.isEmpty() && pq.peek().x == curr) {
            list.add(pq.poll().treeNode.val);
        }
        
        ans.add(list);
    }
    
    return ans;
}

public void traverse(TreeNode root, int level, int x, PriorityQueue<Node> pq) {
    if (root == null)
        return;
    
    pq.add(new Node(level, x, root));
    traverse(root.left, level + 1, x - 1, pq);
    traverse(root.right, level + 1, x + 1, pq);
}

public class Node implements Comparator<Node> {
    int level;
    int x;
    TreeNode treeNode;
    
    public Node() {};
    public Node(int level, int x, TreeNode node) {
        this.level = level;
        this.x = x;
        this.treeNode = node;
    }
    
    public int compare(Node n1, Node n2) {
        if (n1.x > n2.x)
            return 1;
        else if (n1.x < n2.x)
            return -1;
        
        else {
            if (n1.level > n2.level)
                return 1;
            else if (n2.level > n1.level)
                return -1;
            
            else {
                if (n1.treeNode.val > n2.treeNode.val)
                    return 1;
                else 
                    return -1;
            }
        }
    }
}
}