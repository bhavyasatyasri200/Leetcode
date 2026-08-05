class Solution {
    public int longestConsecutive(int[] nums) {
        TreeSet<Integer> set=new TreeSet<>();
        for(int num:nums){
            set.add(num);
        }
        int k=0;
        for(int num:set){
            nums[k]=num;
            k++;
        }
        int j=0;
        int max=0;
        for(int i=0;i<nums.length;i++){
            if(i==nums.length-1){
                max=Math.max(max,i+1-j);
            }
            else if(nums[i+1]!=nums[i]+1){
                max=Math.max(max,i+1-j);
                j=i+1;
            }
        }
        return max;
    }
}