class Solution {
    public void rotate(int[] nums, int k) {
        List<Integer> list= new ArrayList<>();
        for(int num:nums){
            list.add(num);
        }
        k=k%nums.length;
        Collections.rotate(list,k);
        for(int i=0;i<nums.length;i++){
            nums[i]=list.get(i);
        }
    }
}