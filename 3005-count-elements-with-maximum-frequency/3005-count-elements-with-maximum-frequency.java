class Solution {
    public int maxFrequencyElements(int[] nums) {
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
        int res=0;
        for(int num:map.values()){
            res=Math.max(num,res);
        }
        int count=0;
        for(int num1:map.values()){
            if(num1==res){
                count+=num1;
            }
        }
        return count;
    }
}