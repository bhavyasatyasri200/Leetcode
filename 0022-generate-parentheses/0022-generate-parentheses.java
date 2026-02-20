class Solution {
    public List<String> generateParenthesis(int n) {
        List<String> ans=new ArrayList<>();
        solve("",n,0,0,ans);
        return ans;
    }
    public void solve(String s,int n, int open,int close,List<String> ans){
        if(s.length()==2*n){
            ans.add(s);
        }
        if(open<n){
            solve(s+"(", n, open+1,close,ans);
        }
        if(close<open){
            solve(s+")",n,open,close+1,ans);
        }
    }
}