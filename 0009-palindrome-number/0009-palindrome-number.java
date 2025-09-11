class Solution {
    public boolean isPalindrome(int x) {
        int left=0;
        String s=String.valueOf(x);
        int n=s.length();
        int right=n-1;
        while(left<right){
            if(s.charAt(left)!=s.charAt(right)){
                return false;
            }
            left++;
            right--;
        }
        return true;
    }
}