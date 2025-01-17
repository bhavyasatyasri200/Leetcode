class Solution {
        public int maxProfit(int[] nums) {
            int min = nums[0];
            int max=0;
            for(int i=1;i<nums.length;i++)
            {
                if(min>nums[i])
                min=nums[i];
                if(max<(nums[i]-min))
                max=(nums[i]-min);
            }
            return max;
        }
    }