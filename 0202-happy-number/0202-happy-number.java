class Solution {
    public boolean isHappy(int n) {
        // Use a HashSet to track numbers we've seen to detect cycles
        Set<Integer> seen = new HashSet<>();
        
        while (n != 1 && !seen.contains(n)) {
            seen.add(n);
            n = sumOfSquares(n);
        }
        
        return n == 1;
    }

    // Helper method to calculate the sum of the squares of the digits of a number
    private int sumOfSquares(int n) {
        int sum = 0;
        while (n > 0) {
            int digit = n % 10; // Get the last digit
            sum += digit * digit; // Square it and add to the sum
            n /= 10; // Remove the last digit
        }
        return sum;
    }
}
