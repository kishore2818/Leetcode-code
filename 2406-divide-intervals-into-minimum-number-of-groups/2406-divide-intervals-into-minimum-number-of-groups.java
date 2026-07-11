class Solution {
    public int minGroups(int[][] intervals) {
        Arrays.sort(intervals,(a,b)->a[0]-b[0]);
        
        PriorityQueue<Integer> q=new PriorityQueue<>();

        for(int i[]:intervals){
           int s=i[0];
           int e=i[1];

           if(!q.isEmpty() && s>q.peek()){
                q.poll();

           }
           q.add(e);
           
        }
        return q.size();
    }
}