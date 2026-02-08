class Solution {
    public int findKthPositive(int[] arr, int k) {
        HashSet<Integer> set=new HashSet<>();
        for(int num:arr){
            set.add(num);
        }
        ArrayList<Integer> a=new ArrayList<>();
        for(int i=1;a.size()<k;i++){
            if(!set.contains(i)){
                a.add(i);
            }
        }
        return a.get(k-1);
    }
}