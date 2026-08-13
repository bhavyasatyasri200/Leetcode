class Solution {
    public int shipWithinDays(int[] weights, int days) {
        int minDays=0;
        int maxDays=0;
       
        
        for(int weight:weights){
            minDays=Math.max(minDays,weight);
            maxDays+=weight;
        }
        
        while(minDays<=maxDays){
            int mid=minDays+(maxDays-minDays)/2;
            int day=1;
            int sum=0;
            for(int weight:weights){
               if(sum+weight>mid){
                day++;
                sum=0;
               }
               sum+=weight;
            }
            if(day>days){
                minDays=mid+1;
            }
            else{
                maxDays=mid-1;
            }
        }
        return minDays;
    }
}