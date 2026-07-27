class Solution {
    public double findMaxAverage(int[] nums, int k) {
        int sum=0;
        for(int i=0;i<k;i++){
            sum+=nums[i];
        }
        double maxAvg=(double)sum/k;
        int start=1;
        int end=k;
        while(end< nums.length){
            sum=sum-nums[start-1]+nums[end];
            double avg=(double)sum/k;
            maxAvg=Math.max(avg,maxAvg);
            start++;
            end++;
        }
        return maxAvg;

    }
}