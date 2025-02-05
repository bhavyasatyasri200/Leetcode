class Solution {
    public int[] searchRange(int[] nums, int target) {
       int n=nums.length;
       int first=-1,last=-1;
       int[] arr=new int[2];
       for(int i=0;i<n;i++)
       {
        if(nums[i]==target && first==-1)
        {
            first=i;
            arr[0]=first;
        }
        if(first!=-1 && nums[i]==target)
        {
            last=i;
            arr[1]=last;
        }
       }
       if(first==-1)
       {
        arr[0]=-1;
        arr[1]=-1;
       }
       return arr;
       
    }

}