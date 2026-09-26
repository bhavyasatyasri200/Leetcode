class Solution {
    public List<List<Integer>> zigzagLevelOrder(TreeNode root) {
        Queue<TreeNode> queue = new LinkedList<>();
        List<List<Integer>> list = new ArrayList<>();
        if(root == null) return list;
        queue.offer(root);
        int count = 0;
        while(!queue.isEmpty()) {
            List<Integer> ans = new ArrayList<>();
            int s = queue.size();
            count++;
            for(int i = 0; i < s; i++) {
                if(queue.peek().left != null) {
                    queue.offer(queue.peek().left);
                }

                if(queue.peek().right != null) {
                    queue.offer(queue.peek().right);
                }
                ans.add(queue.poll().val);
            }

            if(count % 2 == 0) {
                Collections.reverse(ans);
            }

            list.add(ans);
        }

        return list;
    }
}