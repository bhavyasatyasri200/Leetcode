class Solution {
    public List<Integer> findMissingElements(int[] nums) {
        HashSet<Integer> set=new HashSet<>();
        List<Integer> list=new ArrayList<>();
        Arrays.sort(nums);
        int l=nums[0];
        int h=nums[nums.length-1];
        for(int num:nums){
            set.add(num);
        }
        for(int i=l;i<=h;i++){
            if(!set.contains(i)){
                list.add(i);
            }
        }
        return list;
    }
}