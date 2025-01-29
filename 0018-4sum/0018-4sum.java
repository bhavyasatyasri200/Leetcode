class Solution {
    public List<List<Integer>> fourSum(int[] nums, int target) {
        Arrays.sort(nums);
        List<List<Integer>> result=new ArrayList<>();
        for(int i=0;i<nums.length;i++)
        {
            if(i>0 && nums[i]==nums[i-1]) continue;
            for(int j=i+1;j<nums.length;j++)
            {
                if(j>i+1 && nums[j]==nums[j-1]) continue;
            int k=j+1;
            int z=nums.length-1;
            while(k<z)
            {
                long sum=(long)nums[i]+nums[j]+nums[k]+nums[z];
                if(sum<target)
                {
                    k++;
                }
                else if(sum>target)
                {
                    z--;
                }
                else 
                {
                   result.add(Arrays.asList(nums[i],nums[j],nums[k],nums[z]));
                    while(k<z && nums[k]==nums[k+1]) k++;
                    while(k<z && nums[z]==nums[z-1]) z--;
                    k++;
                    z--;
                }
            }
            }
        }
        return result;
    }
}