class Solution {
    public int singleNumber(int[] nums) {
        int count,s=0;
        for (int i = 0; i < nums.length; i++) {
            count=0;
            for (int j = 0; j < nums.length; j++) {
                if (nums[i] == nums[j]) {
                    count++;
                }
            }
            if (count == 1) {
                s = nums[i];
                break; 
            }
        }
        return s;
    }
}