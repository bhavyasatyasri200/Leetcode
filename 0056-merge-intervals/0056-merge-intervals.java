class Solution {
    public int[][] merge(int[][] intervals) {
        Arrays.sort(intervals, (a, b) -> a[0] - b[0]);
        List<int[]> result=new ArrayList<>();
        int index=0;
        for(int i=1;i<intervals.length;i++)
        {
            if(intervals[index][1]>=intervals[i][0])
            {
                intervals[index][1]=Math.max(intervals[index][1],intervals[i][1]);
            }
            else
            {
                result.add(intervals[index]);
                index=i;
            }
        }
        result.add(intervals[index]);
        int s[][] =new int[result.size()][2];
        return result.toArray(s);
    }
}  