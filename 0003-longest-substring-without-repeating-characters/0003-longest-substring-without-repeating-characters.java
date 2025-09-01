class Solution {
    public int lengthOfLongestSubstring(String s) {
        HashSet ans=new HashSet<>();
        int left=0,right=0,maxLen=0;
        int n=s.length();
        while(right<n){
            char ch=s.charAt(right);
            if(!ans.contains(ch)){
                ans.add(ch);
                maxLen=Math.max(maxLen,right-left+1);
                right++;
            }
            else{
                ans.remove(s.charAt(left));
                left++;
            }
        }
        return maxLen;
    }
}