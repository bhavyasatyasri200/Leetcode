class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
       for(int i=0;i<n;i++){
        if(nums2[i]!=0){
            nums1[i+m]=nums2[i];
        }
       }
       Arrays.sort(nums1);
    }
}