class Solution {
    public int[] getSneakyNumbers(int[] nums) {
        HashMap<Integer, Integer> map=new HashMap<>();
        int arr[]=new int[2];
        int index=0;
        for(int num:nums){
            
            if(map.containsKey(num)){
                map.put(num,map.get(num)+1);
            }
            else{
                map.put(num,1);
            }
        }
       for(int key:map.keySet()){
            if(map.get(key)>1){
                arr[index++]=key;
                if(index==2){
                    break;
                }
            }
       }
       return arr;
    }
}