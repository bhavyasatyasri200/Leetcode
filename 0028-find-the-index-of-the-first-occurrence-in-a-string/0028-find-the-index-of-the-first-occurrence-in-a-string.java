class Solution {
    public int strStr(String haystack, String needle) {
        int ans=0;
        for(int i=0;i<haystack.length();i++){
            ans= haystack.indexOf(needle);
        } 
        return ans;
    }
}