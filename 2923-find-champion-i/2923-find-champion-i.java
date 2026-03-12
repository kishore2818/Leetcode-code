class Solution {
    public int findChampion(int[][] grid) {
        int c=0;
        for(int i=1;i<grid.length;i++){
           if(grid[c][i]==0) c=i;
        }
        return c;
    }
}