
class Solution {

    List<Integer> list = new ArrayList<>();
    List<List<Integer>> result = new ArrayList<>();

    public List<List<Integer>> subsets(int[] nums) {
        subsets(nums, 0);
        return result;
    }

   void subsets(int[] nums, int ind) {
        if (ind >= nums.length) {
            result.add(new ArrayList<>(list));
            return;
        }

        list.add(nums[ind]);
        subsets(nums, ind + 1);

        list.remove(list.size() - 1);

        subsets(nums, ind + 1);
    }
}
