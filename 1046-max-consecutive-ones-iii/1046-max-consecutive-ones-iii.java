class Solution {
    public int longestOnes(int[] nums, int k) {
        int n=nums.length;
        int left=0;
        int maxNum=0;
        int sum1=0;
        int sum0=0;
        for (int right=0; right<n;right++) {
            if (nums[right]==1) {
                sum1++;
            } else {
                sum0++;
            }
            while (sum0>k) {
                if (nums[left] == 1) {
                    sum1--;
                } else {
                    sum0--;
                }
                left++;
            }
            int sum=sum0+sum1;
            maxNum = Math.max(maxNum, sum);
        }
        return maxNum;
    }
}
