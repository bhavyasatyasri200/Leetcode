import java.util.Arrays;
class Solution{
    public int search(int[] nums,int target){
        int[] arr=Arrays.copyOf(nums,nums.length);
        Arrays.sort(arr);
        int low=0,high=arr.length-1;
        while(low<=high){
            int mid=low+(high-low)/2;
            if(arr[mid]==target){
                for(int i=0;i<nums.length;i++){
                    if(nums[i]==target){
                        return i;
                    }
                }
            }
            if(arr[mid]<target){
                low=mid+1;
            }else{
                high=mid-1;
            }
        }
        return -1;
    }
}
