class Solution {
    public boolean validPalindrome(String s) {
       int left=0;
       int right=s.length()-1;
       int count=0;
       while(left<right){
         if(s.charAt(left)==s.charAt(right)){
            left++;
            right--;
         }
         else {
            int l1=left+1;
            int r1=right;
            while(l1<r1 && s.charAt(l1)==s.charAt(r1)){
                l1++;
                r1--;
            }
            int l2=left;
            int r2=right-1;
            while(l2<r2 && s.charAt(l2)==s.charAt(r2)){
                l2++;
                r2--;
            }
            return l1 >= r1 || l2 >= r2;
         }
       }
       return true;
    }
}