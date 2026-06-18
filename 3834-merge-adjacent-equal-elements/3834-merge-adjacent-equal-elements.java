class Solution {
    public List<Long> mergeAdjacent(int[] nums) {
        ArrayList<Long> list=new ArrayList<>();
        Stack<Long> s=new Stack<>();
        for(int i:nums){
            long n=(long)(i);
            while(!s.isEmpty() && s.peek()==n) {n+=s.pop();}
            s.push(n);
        }
        for(long i:s){
            list.add(i);
        }
        return list;
    }
}