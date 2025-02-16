class Solution {
    public int findPeakElement(int[] nums) {
        int peak = Integer.MIN_VALUE;
        int result=0;
        if(nums.length==1) return 0;
        for(int i=0;i<nums.length;i++)
        {
            if(nums[i]>peak)
            {
                peak=nums[i];
                result=i;
            }
        }
        return result;
    }
}