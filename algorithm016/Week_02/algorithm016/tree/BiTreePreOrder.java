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

    public List<Integer> preorderTraversal(TreeNode root) {
        List<Integer> traversal = new ArrayList<Integer>();
        this.preorderTraversal(root, traversal);
        return traversal;

    }

    public void preorderTraversal(TreeNode root, List<Integer> traversal) {
        if(root != null){
            traversal.add(root.val);
            this.preorderTraversal(root.left, traversal);
            this.preorderTraversal(root.right, traversal);
        }
    }

}
