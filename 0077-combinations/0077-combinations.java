class Solution {
    static void solve(int ind,int n,int k,int[] res,List<Integer> list,List<List<Integer>> ans){
        
        if(list.size()==k){
            ans.add(new ArrayList<>(list));
            return;
        }
        // if(ind==n) return;
        for(int i=ind;i<n;i++){
            list.add(res[i]);
            solve(i+1,n,k,res,list,ans);
            list.remove(list.size()-1);
        }
      
    }
    public List<List<Integer>> combine(int n, int k) {
        int arr[]=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=i+1;
        }
        List<Integer> list=new ArrayList<>();
        List<List<Integer>> ans=new ArrayList<>();
        solve(0,n,k,arr,list,ans);
        return ans;

    }
}