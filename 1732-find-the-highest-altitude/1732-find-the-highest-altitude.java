class Solution {
    public int largestAltitude(int[] gain) {
        ArrayList<Integer> list=new ArrayList<>();
        list.add(0);
        for(int i=0;i<gain.length;i++){
            int a=0;
            
            a=list.get(i)+gain[i];
            list.add(a);
            
            
        }
        Collections.sort(list);
        System.out.print(list);
        return list.get(list.size()-1);
    }
}