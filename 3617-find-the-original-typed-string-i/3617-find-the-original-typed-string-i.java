class Solution {
    public int possibleStringCount(String word) {
        int count = 1; 
        int i = 0;
        while (i < word.length()) {
            int temp = 0;
            char ch = word.charAt(i);
            while (i < word.length() && word.charAt(i) == ch) {
                temp++;
                i++;
            }
            if (temp > 1) {
                count += temp-1;
            }
        }
        
        return count;
    }
}