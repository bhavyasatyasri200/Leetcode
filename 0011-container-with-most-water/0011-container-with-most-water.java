class Solution {
    public int maxArea(int[] height) {
        int left=0;
        int right=height.length-1;
        int ans=0;
        while(left<right){
            int count=0;
            int min=Math.min(height[left],height[right]);
            int co=min*(right-left);
            ans=Math.max(ans,co);
            if(height[left]<height[right]){
                left++;
            }
            else{
                right--;
            }
        }
        return ans;
    }
}