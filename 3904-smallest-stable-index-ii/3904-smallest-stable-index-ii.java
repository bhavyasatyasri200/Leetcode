class Solution {
    public int firstStableIndex(int[] nums, int k) {
        int n=nums.length;
        int maxSum[]=new int[n];
        int minSum[]=new int[n];
        maxSum[0]=nums[0];
        minSum[n-1]=nums[n-1];
        for(int i=1;i<n;i++){
            maxSum[i]=Math.max(nums[i],maxSum[i-1]);
        }
        for(int i=n-2;i>=0;i--){
            minSum[i]=Math.min(nums[i],minSum[i+1]);
        }
        for (int i = 0; i < n; i++) {
            if (maxSum[i] - minSum[i] <= k) {
                return i;
            }
        }

        return -1;
    }
}