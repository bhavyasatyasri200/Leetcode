class Solution{
    public int findNumbers(int[] nums){
        int count=0;
        for(int i=0;i<nums.length;i++){
            int num=nums[i],digits=0;
            while(num>0){
                num/=10;
                digits++;
            }
            if(digits%2==0)count++;
        }
        return count;
    }
}
