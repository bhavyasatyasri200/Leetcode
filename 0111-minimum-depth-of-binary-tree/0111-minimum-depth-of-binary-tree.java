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
    static int height(TreeNode root){
        if(root==null) return 0;
        int left=height(root.left);
        int right=height(root.right);
        if(left==0){
            return right+1;
        }
        if(right==0){
            return left+1;
        }
        return 1+Math.min(left,right);
    }
    public int minDepth(TreeNode root) {
        return height(root);
    }
}