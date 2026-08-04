class Solution {
    public int[] productExceptSelf(int[] nums) {
        int[] prefix=new int[nums.length+1];
        int[] suffix=new int[nums.length+1];
        prefix[0]=1;
        // prefix[1]=nums[0];
        suffix[nums.length]=1;
        // suffix[nums.length-2]=nums[nums.length-1];
        for(int i=1;i<prefix.length;i++){
            prefix[i]=prefix[i-1]*nums[i-1];
        }
        for(int i=suffix.length-2;i>=0;i--){
            suffix[i]=suffix[i+1]*nums[i];
        }
        int j=0;
        for(int i=0;i<prefix.length-1;i++){
            
            nums[j]=prefix[i]*suffix[i+1];
            j++;
        }
        return nums;
    }
}