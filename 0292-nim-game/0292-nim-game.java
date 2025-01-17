class Solution {
    public boolean canWinNim(int n) {
        // Return true if n is not a multiple of 4, otherwise return false
        return n % 4 != 0;
    }
}