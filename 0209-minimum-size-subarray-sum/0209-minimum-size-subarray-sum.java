class Solution {
    public int minSubArrayLen(int target, int[] nums) {
        int minlength=Integer.MAX_VALUE;
        int n=nums.length;
        int sum=0;
        int winsize=0;
        int left=0;
        for(int i=0;i<n;i++){
            sum=sum+nums[i];
            winsize++;
            while(sum>=target){
                minlength=Math.min(winsize,minlength);
                sum=sum-nums[left];
                left++;
                winsize--;
            }
        }
         if (minlength == Integer.MAX_VALUE) {
            return 0;
        } else {
            return minlength;
        }
    }
}