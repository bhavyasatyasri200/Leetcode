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
    List<Integer> plist=new ArrayList<Integer>();
    List<Integer> qlist=new ArrayList<Integer>();
     List<Integer> pinorder(TreeNode p){
         if(p==null){
            plist.add(null);
             return plist;
         }
          plist.add(p.val);
         pinorder(p.left);
        
        pinorder(p.right);
         return plist;
    }
    List<Integer> qinorder(TreeNode q){
         if(q==null) {
            qlist.add(null);
            return qlist;
         }
         qlist.add(q.val);
         qinorder(q.left);
         
         qinorder(q.right);
         return qlist;
    }
    public boolean isSameTree(TreeNode p, TreeNode q) {
        pinorder(p);
    qinorder(q);
        if(plist.equals(qlist)) return true;
        else return false;
    }
}