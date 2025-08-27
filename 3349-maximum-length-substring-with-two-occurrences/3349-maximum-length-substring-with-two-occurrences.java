class Solution {
    public int maximumLengthSubstring(String s) {
        int n = s.length();
        int left = 0, maxLen = 0;
        Map<Character, Integer> count = new HashMap<>();

        for (int right = 0; right < n; right++) {
            char c = s.charAt(right);
            count.put(c, count.getOrDefault(c, 0) + 1);

            // shrink window if any char exceeds 2
            while (count.get(c) > 2) {
                char leftChar = s.charAt(left);
                count.put(leftChar, count.get(leftChar) - 1);
                left++;
            }

            maxLen = Math.max(maxLen, right - left + 1);
        }
        return maxLen;
    }
}