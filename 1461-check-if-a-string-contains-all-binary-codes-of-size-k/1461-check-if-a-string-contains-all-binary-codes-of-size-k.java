class Solution {
    public boolean hasAllCodes(String s, int k) {
        int n = s.length();
        if (n < k) return false;
        
        int totalNeeded = 1 << k;  // 2^k
        boolean[] seen = new boolean[totalNeeded];
        
        int hash = 0;
        int mask = totalNeeded - 1; 
        
        for (int i = 0; i < n; i++) {
            hash = ((hash << 1) & mask) | (s.charAt(i) - '0');
            if (i >= k - 1) {
                if (!seen[hash]) {
                    seen[hash] = true;
                    totalNeeded--;
                    if (totalNeeded == 0) {
                        return true;
                    }
                }
            }
        }
        
        return false;
    }
}