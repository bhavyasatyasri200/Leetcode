class Solution {
    public int maxSubArray(int[] nums) {
        int n=nums.length;
        int m=nums[0];
        int neg=nums[0];
        int sum=0;
        for(int i=0;i<n;i++)
        {
            sum+=nums[i];
            if(m<sum)
            {
                m=sum;
            }
            if(sum<0)
            {
                sum=0;
            }
            if(nums[i]>neg)
            {
                neg=nums[i];
            }
        }
        if(m>0 && neg>0)
        {
            return m;
        }
        return neg;
    }
}