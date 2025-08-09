class Solution {
    public int[] getConcatenation(int[] nums) {
        int arr[] = new int[nums.length * 2];
        int j = 0;
        
        for (int t = 0; t < 2; t++) {
            for (int i = 0; i < nums.length; i++) {
                arr[j++] = nums[i];
            }
        }
        return arr;
    }
}
