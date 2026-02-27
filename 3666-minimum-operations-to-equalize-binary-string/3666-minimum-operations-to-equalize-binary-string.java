class Solution {
    public int minOperations(String s, int k) {
        int n = s.length();
        int zeros = 0;

        for (char c : s.toCharArray()) {
            if (c == '0') zeros++;
        }

        if (zeros == 0) return 0;

        // Special case: full flip
        if (k == n) {
            if (zeros == n) return 1;
            else return -1;
        }

        // If k is odd → always possible
        if (k % 2 == 1) {
            return zeros;
        }

        // k is even
        if (zeros % 2 == 1) {
            return -1;
        }

        return zeros;
    }
}