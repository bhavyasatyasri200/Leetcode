class Solution {
    public int minimumRecolors(String blocks, int k) {
        int mini=0;
        for(int i=0;i<k;i++){
            if(blocks.charAt(i)=='B'){
                mini++;
            }
        }
        int minBlack=k-mini;
        int start=0;
        int end=k;
        while(end < blocks.length()){
            if(blocks.charAt(start)=='B'){
                mini--;
            }
            if(blocks.charAt(end)=='B'){
                mini++;
            }
            int Black=k-mini;
            minBlack=Math.min(minBlack,Black);
            start++;
            end++;
        }
        return minBlack;
    }
}