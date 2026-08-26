class Solution {
    public boolean satisfiesConditions(int[][] grid) {
        // if(grid[0].length<2) return false;

        for(int i=0;i<grid.length;i++){
            for(int j=0;j<grid[0].length;j++){
                if(i+1<grid.length && grid[i][j]!=grid[i+1][j]) return false;
                if(j+1<grid[0].length &&grid[i][j]==grid[i][j+1])  return false;
            }
        }
        return true;
    }
}