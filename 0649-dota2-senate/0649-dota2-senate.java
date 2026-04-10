class Solution {
    public String predictPartyVictory(String senate) {
        Queue<Integer> R=new LinkedList<>();
        Queue<Integer> D=new LinkedList<>();
        int n=senate.length();
        for(int i=0;i<senate.length();i++){
            if(senate.charAt(i)=='R') R.add(i);
            else D.add(i);
            }
        while(!R.isEmpty() && !D.isEmpty()){
            int ir=R.poll();
            int id=D.poll();

            if(ir<id){
                R.add(ir+n);
            }
            else{
                D.add(id+n);
            }
        }
        return R.isEmpty()? "Dire":"Radiant";
        }
}