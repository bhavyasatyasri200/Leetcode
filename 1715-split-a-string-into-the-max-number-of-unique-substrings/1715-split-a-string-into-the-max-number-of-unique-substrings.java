class Solution {
    public int maxUniqueSplit(String s) {
        HashSet<String> unique = new HashSet<>();
        return backtrack(s, 0, unique);
    }
    private int backtrack(String s, int start, Set<String> num) {
        int maxCount = 0;
        for (int end = start + 1; end <= s.length(); end++) {
            String substring = s.substring(start, end);

            if (!num.contains(substring)) { 
                num.add(substring);
                maxCount = Math.max(maxCount,1+backtrack (s, end, num));
                num.remove(substring);
            }
        }

        return maxCount;
    }
}