class Solution {
    public int majorityElement(int[] nums) { 
        for (int i = 0; i < nums.length; i++) {
            int count = 0;

            // Count occurrences of nums[i]
            for (int j = 0; j < nums.length; j++) {
                if (nums[i] == nums[j]) {
                    count++;
                }
            }

            // Check if it's the majority element
            if (count > nums.length / 2) {
                return nums[i];
            }
        }

        return -1; // This line won't be reached as per the problem's guarantee
    }
}
