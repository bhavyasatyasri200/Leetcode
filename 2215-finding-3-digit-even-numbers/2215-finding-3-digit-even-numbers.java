class Solution {
    public int[] findEvenNumbers(int[] digits) {
        Set<Integer> set = new HashSet<>();
        int total = 0;
        int n = digits.length;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                for (int k = 0; k < n; k++) {
                    if (i != j && j != k && k != i) {
                        total = digits[i] * 100 + digits[j] * 10 + digits[k];
                        if (total % 2 == 0 && total >= 100) {
                            set.add(total);
                        }
                    }
                }
            }
        }
        return set.stream()
                  .sorted()
                  .mapToInt(Integer::intValue)
                  .toArray();
    }
}
