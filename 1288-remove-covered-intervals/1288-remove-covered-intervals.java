class Solution {
    public int removeCoveredIntervals(int[][] intervals) {
        Arrays.sort(intervals,(a,b)->b[1]-a[1]);
        int count=intervals.length;
        for(int i=0;i<intervals.length;i++){
            
            for(int j=0;j<intervals.length;j++){
                if(i==j) continue;
                int a=intervals[i][0];
                int b=intervals[i][1];
                int c=intervals[j][0];
                int d=intervals[j][1];
                if(c<=a && b<=d) {
                    count--; 
                    break;}
            }
            
        }

        return count;
    }
}