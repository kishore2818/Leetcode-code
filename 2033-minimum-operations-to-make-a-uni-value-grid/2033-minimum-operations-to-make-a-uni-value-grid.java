class Solution {
    public int minOperations(int[][] grid, int x) {
        int count=0;
        int m=grid.length,n=grid[0].length;
        int arr[]=new int[m*n];
        int k=0;
        for(int i=0;i<m;i++){
            for (int j=0;j<n;j++){
                arr[k++]=grid[i][j];
            }
        }
        for(int i=0;i<arr.length;i++){
        if((arr[i]-arr[0])%x!=0) return -1;
        }
        Arrays.sort(arr);
        int mid=arr[arr.length/2];
        for(int i=0;i<arr.length;i++){
        count+=Math.abs(arr[i]-mid)/x;
        }
        return count;
    }
}