class Solution {
    public int firstMissingPositive(int[] nums) {
      HashSet<Integer> set=new HashSet<>();
      
       if (nums.length == 0) return 1;
       int max=nums[0];
      for(int num:nums){
        if(num>0){
            set.add(num);
        }
      }
      if(set.size()==0) return 1;
      for(int i=1;i<=nums.length+1;i++){
        if(!set.contains(i)){
            return i;
        }
      }
      return 1;
    }
}