class Solution {
    public int longestBalanced(int[] nums) {
        int result = 0;

        for (int i = 0; i < nums.length; i++) {
            HashSet<Integer> even = new HashSet<>();
            HashSet<Integer> odd = new HashSet<>();
            int length = 0;

            for (int j = i; j < nums.length; j++) {
                length++;

                if (nums[j] % 2 == 0)
                    even.add(nums[j]);
                else
                    odd.add(nums[j]);

                if (even.size() == odd.size()) {
                    result = Math.max(result, length);
                }
            }
        }
        return result;
    }
}
