/**
 * // This is MountainArray's API interface.
 * // You should not implement it, or speculate about its implementation
 * interface MountainArray {
 *     public int get(int index) {}
 *     public int length() {}
 * }
 */
 
class Solution {
    public int findInMountainArray(int target, MountainArray mountainArr) {
        int left=0;
        int right=mountainArr.length()-1;
        while(left<right){
            int mid=(left+right)/2;
            if(mountainArr.get(mid)<mountainArr.get(mid+1)){
                left=mid+1;
            }
            else {
                right=mid;
            }
           
        }
        int peek=left;
        int l=0;
        int r=peek;
        while(l<=r){
            int mid=(l+r)/2;
            int value=mountainArr.get(mid);
            if(value==target){
                return mid;
            }
            else if(value<target){
                l=mid+1;
            }
            else{
                r=mid-1;
            }
        }
        int l1=peek+1;
        int r1=mountainArr.length()-1;
        while(l1<=r1){
            int mid=(l1+r1)/2;
            int value=mountainArr.get(mid);
            if(value==target){
                return mid;
            }
            else if(value>target){
                l1=mid+1;
            }
            else{
                r1=mid-1;
            }
        }
        return -1;
    }
}