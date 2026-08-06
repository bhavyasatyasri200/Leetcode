import java.util.*;

class Solution {

    public List<List<Integer>> fourSum(int[] nums, int target) {

        Set<List<Integer>> set = new HashSet<>();

        int n = nums.length;

        for(int i = 0; i < n - 3; i++) {

            for(int j = i + 1; j < n - 2; j++) {

                HashMap<Long, Integer> map = new HashMap<>();

                for(int k = j + 1; k < n; k++) {

                    long complement =
                        (long)target
                        - ((long)nums[i] + nums[j] + nums[k]);

                    if(map.containsKey(complement)) {

                        List<Integer> list = Arrays.asList(
                            nums[i],
                            nums[j],
                            nums[k],
                            (int)complement
                        );

                        Collections.sort(list);

                        set.add(list);
                    }

                    map.put((long)nums[k], k);
                }
            }
        }

        return new ArrayList<>(set);
    }
}