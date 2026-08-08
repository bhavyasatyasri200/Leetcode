class Solution {
    public boolean checkInclusion(String s1, String s2) {

        HashMap<Character, Integer> map = new HashMap<>();

        int s = s1.length();
        int t = s2.length();
        int k = s1.length();

        // Frequency of characters in s1
        for (int i = 0; i < s; i++) {
            char ch = s1.charAt(i);
            map.put(ch, map.getOrDefault(ch, 0) + 1);
        }

        int j = 0;

        for (int i = 0; i < t; i++) {

            char ch1 = s2.charAt(i);

            // Add current character to window
            map.put(ch1, map.getOrDefault(ch1, 0) - 1);

            // Window size = k
            if (i - j + 1 == k) {

                boolean valid = true;

                // Check whether all required frequencies are satisfied
                for (char ch : map.keySet()) {
                    if (map.get(ch) != 0) {
                        valid = false;
                        break;
                    }
                }

                if (valid) {
                    return true;
                }

                // Remove left character before sliding
                char left = s2.charAt(j);
                map.put(left, map.getOrDefault(left, 0) + 1);

                j++;
            }
        }

        return false;
    }
}