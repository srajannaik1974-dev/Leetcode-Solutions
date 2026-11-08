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
    public boolean isSymmetric(TreeNode root) {
       isMirror(root.left);
       return identical(root.left,root.right); 
    }
    public void isMirror(TreeNode root){
        if(root==null) return;
        TreeNode temp=root.left;
        root.left=root.right;
        root.right=temp;
        isMirror(root.left);
        isMirror(root.right);
    }
    public boolean identical(TreeNode p,TreeNode q){
        if(p==null && q==null )return true;
        if(p==null || q==null) return false;
        if(p.val!=q.val) return false;
        return identical(p.left,q.left) && identical(p.right,q.right);
    }
}