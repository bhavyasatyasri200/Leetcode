class Solution {
    public boolean search(int[] nums, int target) {
        int arr[]=Arrays.copyOf(nums,nums.length);
        Arrays.sort(arr);
        int left=0;
        int right=arr.length-1;
        while(left<=right){
            int mid=(left+right)/2;
            if(arr[mid]==target){
                return true;
            }
            else if(arr[mid]<target){
                left=mid+1;
            }
            else{
                right=mid-1;
            }
        }
        return false;
    }
}