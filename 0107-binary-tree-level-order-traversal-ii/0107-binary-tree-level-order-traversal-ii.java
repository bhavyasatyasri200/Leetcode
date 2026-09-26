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
 import java.util.*;
class Solution {
    public List<List<Integer>> levelOrderBottom(TreeNode root) {
        List<List<Integer>> ans=new ArrayList<>();

        
        Queue<TreeNode> queue=new LinkedList<>();

        if(root==null) return ans;
        queue.offer(root);
        while(!queue.isEmpty()){
            List<Integer> list=new ArrayList<>();
            int count=queue.size();
            for(int i=0;i<count;i++){
                 if(queue.peek().left!=null){
                queue.offer(queue.peek().left);
                }
                if(queue.peek().right!=null){
                    queue.offer(queue.peek().right);
                }
                list.add(queue.poll().val);
            }
            ans.add(list);
            
        }
        
        Collections.reverse(ans);
        return ans;
    }
}