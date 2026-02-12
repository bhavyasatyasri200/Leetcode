import java.util.Hashtable;

class Solution {
    public int longestBalanced(String s) {
        int n = s.length();
        int maxLen = 0;

        for (int i = 0; i < n; i++) {
            Hashtable<Character, Integer> map = new Hashtable<>();

            for (int j = i; j < n; j++) {
                char c = s.charAt(j);

                // Update frequency
                map.put(c, map.getOrDefault(c, 0) + 1);

                // Check if balanced
                int freq = -1;
                boolean balanced = true;

                for (int val : map.values()) {
                    if (freq == -1) {
                        freq = val;
                    } else if (val != freq) {
                        balanced = false;
                        break;
                    }
                }

                if (balanced) {
                    maxLen = Math.max(maxLen, j - i + 1);
                }
            }
        }

        return maxLen;
    }
}
