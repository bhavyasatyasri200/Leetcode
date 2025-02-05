class Solution {
    public boolean areAlmostEqual(String s1, String s2) {
        int first = -1;
        int last = -1;
        int count = 0;
        
        for (int i = 0; i < s1.length(); i++) {
            if (s1.charAt(i) != s2.charAt(i)) {
                count++;
                if (first == -1) {
                    first = i;
                } else if (last == -1) {
                    last = i;
                }
            }
        }
        
        if (count == 0) return true;
        if (count == 2 && s1.charAt(first) == s2.charAt(last) && s1.charAt(last) == s2.charAt(first)) {
            return true;
        }
        return false;
    }
}
