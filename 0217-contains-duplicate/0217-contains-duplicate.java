class Solution {
    public boolean containsDuplicate(int[] nums) {
       Arrays.sort(nums);
       int flag=0;
       for(int i=1;i<nums.length;i++){
            if(nums[i]==nums[i-1]){
                flag=1;
            }
       }
       if(flag==1){
        return true;
       }
       return false;
    }
}