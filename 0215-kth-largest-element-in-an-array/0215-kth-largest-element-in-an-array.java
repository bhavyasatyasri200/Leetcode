class Solution {
    public int findKthLargest(int[] nums, int k) {
        int count=0;
        Arrays.sort(nums);
        for(int i=nums.length;i>0;i--){
            count=nums[i-k];
            break;
        }
        return count;
    }
}