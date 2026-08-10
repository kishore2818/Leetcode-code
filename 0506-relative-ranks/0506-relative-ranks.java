class Solution {
    public String[] findRelativeRanks(int[] score) {
        PriorityQueue<int[]> pq=new PriorityQueue<>((a,b)->b[0]-a[0]);
        int z=0;
        for(int i:score){
            pq.add(new int[]{i,z});
            z++;
        }
        int a=score.length;
        String[] str=new String[score.length];
        int rank=1;
        while(!pq.isEmpty()){
            int cur[]=pq.poll();
            int ind=cur[1];
            if(rank==1) str[ind]="Gold Medal";
            else if(rank==2) str[ind]="Silver Medal";
            else if(rank==3) str[ind]="Bronze Medal";
            else str[ind]=String.valueOf(rank);
            rank++;
        }
        return str;
    }
}