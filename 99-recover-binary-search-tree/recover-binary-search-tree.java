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
    TreeNode p = null, f = null, s = null;
    void rec(TreeNode root){
        if(root == null){
            return;
        }
        rec(root.left);
        if(p!=null && root.val < p.val){
            if(f == null){
                f = p;
            }
            s = root;
        }
        p = root;
        rec(root.right);
    }
    public void recoverTree(TreeNode root) {
        if(root == null){
            return;
        }
        rec(root);
        int temp = f.val;
        f.val = s.val;
        s.val = temp;
    }
}