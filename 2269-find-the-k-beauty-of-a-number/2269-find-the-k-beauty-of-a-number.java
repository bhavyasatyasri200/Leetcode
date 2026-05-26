class Solution {
    public int divisorSubstrings(int num, int k) {
        int count=0;
        String s=Integer.toString(num);
        for(int i=0;i<=s.length()-k;i++){
            String part=s.substring(i,i+k);
            int n=Integer.parseInt(part);
            if(n!=0 && num%n==0) count++;
        }
        return count;
        
    }
}