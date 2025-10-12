class Solution {
    public boolean search(int[] nums, int target) {
        int left = 0;
        int right = nums.length - 1;

        while (left <= right) {
            int mid = (left + right) / 2;

            if (nums[mid] == target || nums[left] == target || nums[right] == target) {
                return true;
            }

            // handle duplicates
            if (nums[left] == nums[mid] && nums[mid] == nums[right]) {
                left++;
                right--;
                continue;
            }

            // if left half is sorted
            if (nums[left] <= nums[mid]) {
                int low = left;
                int high = mid;
                while (low <= high) { // search in sorted left half
                    int mid1 = (low + high) / 2;
                    if (nums[mid1] == target) return true;
                    else if (nums[mid1] < target) low = mid1 + 1;
                    else high = mid1 - 1;
                }
                left = mid + 1; // move to right half after checking left
            } 
            // if right half is sorted
            else {
                int low = mid;
                int high = right;
                while (low <= high) { // search in sorted right half
                    int mid1 = (low + high) / 2;
                    if (nums[mid1] == target) return true;
                    else if (nums[mid1] < target) low = mid1 + 1;
                    else high = mid1 - 1;
                }
                right = mid - 1; // move to left half after checking right
            }
        }

        return false;
    }
}
