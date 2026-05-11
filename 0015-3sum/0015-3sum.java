class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        Set<List<Integer>> set=new HashSet<>();
        int n=nums.length;
        int target=0;
        for(int i=0;i<n-2;i++){
            HashMap<Integer,Integer> map=new HashMap<>();
            for(int j=i+1;j<n;j++){
                int complement=target-(nums[i]+nums[j]);
                if(map.containsKey(complement)){
                    List<Integer> list=Arrays.asList(
                        nums[i],nums[j],complement
                    );
                    Collections.sort(list);
                    set.add(list);
                }
                map.put(nums[j],j);
            }
        }
        return new ArrayList<>(set);
    }
}