class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        Set<List<Integer>> ans = new HashSet<>();
        int n = nums.length;

        for (int i = 0; i < n - 2; i++) {
            HashSet<Integer> seen = new HashSet<>();

            for (int j = i + 1; j < n; j++) {
                int complement = -(nums[i] + nums[j]);

                if (seen.contains(complement)) {
                    List<Integer> triplet = Arrays.asList(nums[i], nums[j], complement);
                    Collections.sort(triplet);
                    ans.add(triplet);
                }

                seen.add(nums[j]);
            }
        }

        return new ArrayList<>(ans);
    }
}