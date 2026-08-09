class Solution {
    public int lengthOfLongestSubstring(String s) {
        HashSet<Character> ans=new HashSet<>();
        int left=0;
        int right=0;
        int n=s.length();
        int maxLen=0;
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