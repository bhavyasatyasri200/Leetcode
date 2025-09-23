class Solution {
    public int[] searchRange(int[] nums, int target) {
        if ( nums.length == 0) return new int[]{-1, -1};
        if (nums.length == 1) return nums[0] == target ? new int[]{0, 0} : new int[]{-1, -1};
        int left=0;
        int right=nums.length-1;
        int first=-1;
        int last=-1;
        while(left<=right){
            int mid=(left+right)/2;
            if(nums[mid]==target){
                int i=mid;
               while(i>0 && nums[i-1]==target){
                    i--;
               }
               first=i;
               int j=mid;
               while(j<nums.length-1 && nums[j+1]==target){
                    j++;
               }
               last=j;
               break;
            }
            else if(nums[mid]<target){
                left=mid+1;
            }
            else{
                right=mid-1;
            }
        }
        return new int[] {first,last};
    }
}