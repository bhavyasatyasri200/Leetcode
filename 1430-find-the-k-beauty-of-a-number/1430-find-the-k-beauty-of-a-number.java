class Solution {
    public int divisorSubstrings(int num, int k) {
        String str=Integer.toString(num);
        int count=0;
        for(int i=0;i<=str.length()-k;i++){
            String sub=str.substring(i,i+k);
            int value=Integer.parseInt(sub);
            if(value!=0 && num%value==0) count++;
        }
        return count;
    }
}