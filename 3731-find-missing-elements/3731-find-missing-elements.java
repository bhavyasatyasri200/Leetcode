class Solution {
    public List<Integer> findMissingElements(int[] nums) {
        HashSet<Integer> set=new HashSet<>();
        List<Integer> list=new ArrayList<>();
        int l=nums[0];
        int h=nums[0];
        for(int num:nums){
            set.add(num);
            l=Math.min(l,num);
            h=Math.max(h,num);
        }
        for(int i=l;i<=h;i++){
            if(!set.contains(i)){
                list.add(i);
            }
        }
        return list;
    }
}