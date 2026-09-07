class Solution {
    void solve(int ind,int target,int[] candidates, List<Integer> ds, List<List<Integer> >ans,int n){
       
    if(target==0){
         ans.add(new ArrayList<>(ds));
         return;
    }
    if(ind==n){
        return;
    }
    if(candidates[ind]<=target){
        ds.add(candidates[ind]);
        solve(ind,target-candidates[ind],candidates,ds,ans,n);
        ds.remove(ds.size()-1);
    }
    solve(ind+1,target,candidates,ds,ans,n);
    }
    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        List<List<Integer>> ans = new ArrayList<>(); 
        List<Integer> ds = new ArrayList<>();
        int n=candidates.length;
        solve(0,target,candidates,ds,ans,n);
        return ans;
    
    }
}