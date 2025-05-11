class Solution {
    public long minSum(int[] nums1, int[] nums2) {
        long nums1sum=0;
        long nums1zeros=0;
        long nums2sum=0;
        long nums2zeros=0;
        for(int i=0;i<nums1.length;i++)
        {
            nums1sum+=nums1[i];
            if(nums1[i]==0)
            {
                nums1zeros++;
            }
        }
        long total1=nums1sum+nums1zeros;
        for(int j=0;j<nums2.length;j++)
        {
            nums2sum+=nums2[j];
            if(nums2[j]==0)
            {
                nums2zeros++;
            }
        }
        long total2=nums2sum+nums2zeros;
        if(total2>=total1 && nums1zeros!=0)
        {
            return total2;
        }
        if (total1>=total2 && nums2zeros!=0)
        {
            return total1;
        }
        if(total1==total2 && nums1zeros==0 && nums2zeros==0)
        {
            return total1;
        }
         if (nums2zeros==0 && total1>total2 || nums1zeros==0 && total2>total1)
        {
            return -1;
        }
        return -1;
    }
}