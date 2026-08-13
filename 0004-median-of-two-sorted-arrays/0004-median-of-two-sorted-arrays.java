class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int a=nums1.length;
        int b=nums2.length;
        int arr[]=new int[a+b];
        int k=0;
        for(int i=0;i<a;i++){
            arr[k]=nums1[i];
            k++;
        }
        for(int i=0;i<b;i++){
            arr[k]=nums2[i];
            k++;
        }
        Arrays.sort(arr);
         int n = arr.length;

        if (n % 2 != 0) {
            return arr[n / 2];
        } else {
            return (arr[n / 2 - 1] + arr[n / 2]) / 2.0;
        }
    }
}