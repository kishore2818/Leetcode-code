class Solution {
    public List<Integer> getRow(int r) {
        ArrayList<Integer> list =new ArrayList<>();
        list.add(1);
       for(int i=1;i<=r;i++){
        list.add(0);

        for(int j=i;j>0;j--){
            list.set(j,list.get(j)+list.get(j-1));
        }
       }
        return list;
    }
}