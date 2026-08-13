class Solution {
    public int search(int[] nums, int target) {
        int arr[]=Arrays.copyOf(nums,nums.length);
        Arrays.sort(arr);
        int left=0;
        int right=nums.length-1;
        while(left<=right){
            int mid=(left+right)/2;
            if(arr[mid]==target){
                for(int i=0;i<nums.length;i++){
                    if(nums[i]==target){
                        return i;
                    }
                }
            }
            else if(arr[mid]<target){
                left=mid+1;
            }
            else{
                right=mid-1;
            }
        }
        return -1;
    }
}