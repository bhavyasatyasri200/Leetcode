class Solution {
    public List<Integer> findClosestElements(int[] arr, int k, int x) {
        int left=0;
        int right=arr.length-1;
        
        List<Integer> list=new ArrayList<>();
        while((right-left+1)!=k){
            int diff1=Math.abs(x-arr[left]);
            int diff2=Math.abs(x-arr[right]);
            if(diff1<=diff2){
                right--;
            }
            else{
                left++;
            }
           
        }
        for(int i=left;i<=right;i++){
            list.add(arr[i]);
        }
        return list;
    }
}