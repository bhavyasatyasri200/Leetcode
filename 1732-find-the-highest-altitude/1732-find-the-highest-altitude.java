class Solution {
    public int largestAltitude(int[] gain) {
        int pre[]=new int[gain.length+1];
        pre[0]=0;
        for(int i=1;i<=gain.length;i++){
            pre[i]=pre[i-1]+gain[i-1];
        }
        int ans=0;
        for(int i=0;i<pre.length;i++){
            if(pre[i]>ans){
                ans=pre[i];
            }
        }
        return ans;
    }
}