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
    public List<Integer> inorderTraversal(TreeNode root) {
        List<Integer> traverseList = new ArrayList<Integer>();
        inorder(root, traverseList);
        return traverseList;
    }

    public void inorder(TreeNode root,List<Integer> traverseList){
        if(root != null){
            inorder(root.left, traverseList);
            traverseList.add(root.val);
            inorder(root.right, traverseList);
        }
    }

}
