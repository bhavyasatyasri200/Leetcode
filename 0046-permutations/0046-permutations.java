class Solution {
    static void solve(int ind,int n,int[] nums,List<Integer> list,List<List<Integer>> res){
        if(list.size()==nums.length){
            res.add(new ArrayList<>(list));
            return;
        }
       
        for(int i=ind;i<nums.length;i++){
            if(list.contains(nums[i])) continue;
            list.add(nums[i]);
            solve(0,n,nums,list,res);
            list.remove(list.size()-1);
        }
    }
    public List<List<Integer>> permute(int[] nums) {
        List<Integer> list=new ArrayList<>();
        List<List<Integer>> res=new ArrayList<>();
        int n=nums.length;
        solve(0,n,nums,list,res);
        return res;
    }
}