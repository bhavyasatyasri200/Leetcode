
class Solution {

    void solve(int ind, int target, int[] candidates,
               List<Integer> list, List<List<Integer>> ans, int n) {

        if (target == 0) {
            ans.add(new ArrayList<>(list));
            return;
        }

        if (ind == n) {
            return;
        }

        for (int i = ind; i < n; i++) {

            // Skip duplicates at the same level
            if (i > ind && candidates[i] == candidates[i - 1]) {
                continue;
            }

            if (candidates[i] <= target) {

                // Take
                list.add(candidates[i]);

                // i + 1 because each element can be used only once
                solve(i + 1, target - candidates[i],
                      candidates, list, ans, n);

                // Backtrack
                list.remove(list.size() - 1);
            }
        }
    }

    public List<List<Integer>> combinationSum2(int[] candidates, int target) {

        Arrays.sort(candidates);

        List<Integer> list = new ArrayList<>();
        List<List<Integer>> ans = new ArrayList<>();

        int n = candidates.length;

        solve(0, target, candidates, list, ans, n);

        return ans;
    }
}
