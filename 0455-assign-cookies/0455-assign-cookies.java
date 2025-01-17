class Solution {
    public int findContentChildren(int[] g, int[] s) {
        Arrays.sort(g);
        Arrays.sort(s);
        int n=g.length;
        int m=s.length;
        int l=0,r=0;
        while(l<m)
        {
            if(r<n && g[r]<=s[l])
            {
                r=r+1;
            }
            l=l+1;
        }
        return r;
    }
}