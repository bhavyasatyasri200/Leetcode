class Solution {
    public int[] rearrangeArray(int[] nums) {
        int n=nums.length;
        int z=n/2;
        int[] positive=new int[z];
        int[] negative=new int[z];
        int[] result=new int[n];
        int pos=0,neg=0;
        for(int i=0;i<n;i++)
        {
            if(nums[i]>=0)
            {
                positive[pos++]=nums[i];
            
            }
            else
            {
                negative[neg++]=nums[i];
            }
        }
        pos=-1;
        neg=-1;

        for(int i=0;i<n;i++){
             if(i%2==0)
            {
            result[i]=positive[++pos];
             }
            else
            {
            result[i]=negative[++neg];
            }
        }
       
        return result;
    }
}