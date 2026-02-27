class Solution {
    public int minOperations(String s, int k) {
        int n = s.length();
        int zeros = 0;
        for (char c : s.toCharArray()) {
            if (c == '0') zeros++;
        }
        if (zeros == 0) return 0;
        if (k == n) {
            if (zeros == n) return 1;  
            else return -1;             
        }
        if (k % 2 == 0 && zeros % 2 == 1) {
            return -1;
        }
        int x = (zeros + k - 1) / k;
        while ((x * k - zeros) % 2 != 0) {
            x++;
        }
        return x;
    }
}