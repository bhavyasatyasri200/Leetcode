class Solution {
    public int numSubarrayProductLessThanK(int[] nums, int k) {
        if(k<=1) return 0;
        int n=nums.length;
        int product=1;
        int left=0;
        int count=0;
        for(int i=0;i<n;i++){
            product=product*nums[i];
            while(product>=k && left<n){
                product=product/nums[left];
                left++;
            }
            count+=(i-left)+1;
        }
        return count;
    }
}