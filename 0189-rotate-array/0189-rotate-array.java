import java.util.*;

class Solution {
    public void rotate(int[] nums, int k) {

        List<Integer> list = new ArrayList<>();

        // copy array to list
        for (int i = 0; i < nums.length; i++) {
            list.add(nums[i]);
        }

        // normalize k
        k = k % nums.length;

        // rotate
        Collections.rotate(list, k);

        // copy back
        for (int i = 0; i < nums.length; i++) {
            nums[i] = list.get(i);
        }
    }
}