class Solution {
    public int sumOfUnique(int[] nums) {
        HashMap<Integer,Integer> map=new HashMap<>();
        for(int i=0;i<nums.length;i++){
            int key=nums[i];
            if(map.containsKey(key)){
                map.put(key,map.get(key)+1);
            }
            else{
                map.put(key,1);
            }
        }
        int sum=0;
        for(int num:map.keySet()){
            if(map.get(num)==1){
                sum+=num;
            }
        }
        return sum;
    }
}