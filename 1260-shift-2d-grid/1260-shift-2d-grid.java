class Solution {
    public List<List<Integer>> shiftGrid(int[][] grid, int k) {
        ArrayList<List<Integer>> ans=new ArrayList<>();
        ArrayList<Integer> list=new ArrayList<>();

        for(int[] i:grid){
            for(int j:i)
            list.add(j);
        }
        k%=list.size();
        while(k!=0){
            list.add(0,list.remove(list.size()-1));
            k--;
        }
         int z=0;

        for(int i=0;i<grid.length;i++){
            ArrayList<Integer> a=new ArrayList<>();
            for(int j=0;j<grid[0].length;j++){
                a.add(list.get(z));
                z++;
            }
            ans.add(a);
        }
    
        return ans;
    }
}