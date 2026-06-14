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

    public boolean isSubtree(TreeNode root, TreeNode subRoot) {

        if (root == null) {
            return false;
        }

        // check current node
        if (isSameTree(root, subRoot)) {
            return true;
        }

        // search left or right subtree
        return isSubtree(root.left, subRoot)
                || isSubtree(root.right, subRoot);
    }

    private boolean isSameTree(TreeNode p, TreeNode q) {

        // both null
        if (p == null && q == null) {
            return true;
        }

        // one null
        if (p == null || q == null) {
            return false;
        }

        // values differ
        if (p.val != q.val) {
            return false;
        }

        // compare left and right
        return isSameTree(p.left, q.left)
                && isSameTree(p.right, q.right);
    }
}