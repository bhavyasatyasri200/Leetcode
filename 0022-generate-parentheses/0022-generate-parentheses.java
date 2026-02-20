class Solution {
    public List<String> generateParenthesis(int n) {
        List<String> list=new ArrayList<>();
        solve(n,0,0,"",list);
        return list;
    }
    public void solve(int n,int open,int close,String s,List<String> list){
        if(s.length()==2*n){
            list.add(s);
        }
        if(open<n){
            solve(n,open+1,close,s+"(",list);
        }
        if(close<open){
            solve(n,open,close+1,s+")",list);
        }
    }
}