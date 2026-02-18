class Solution {
    public int sumDivisibleByK(int[] nums, int k) {
        HashMap<Integer,Integer> map=new HashMap<>();
        for(int num:nums){
            if(map.containsKey(num)){
                map.put(num,map.get(num)+1);
            }
            else{
                map.put(num,1);
            }
        }
        int sum=0;
        for(int num:map.keySet()){
            int freq=map.get(num);
            if(freq%k==0){
                sum+=num*freq;
            }
        }
        return sum;
    }
}