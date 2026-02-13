class Solution {
    public boolean uniqueOccurrences(int[] arr) {
        HashMap<Integer,Integer> map=new HashMap<>();
        for(int i=0;i<arr.length;i++){
            int key=arr[i];
            if(map.containsKey(key)){
                map.put(key,map.get(key)+1);
            }
            else{
                map.put(key,1);
            }
        }
        HashSet<Integer> set=new HashSet<>();
        for(int num:map.values()){
            if(set.contains(num)){
                return false;
            }
            set.add(num);
        }
        return true;

    }
}