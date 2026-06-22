class Solution {
    public int peakIndexInMountainArray(int[] arr) {
        int index=0;
        for(int i=0;i<arr.length;i++){
            if(arr[index]<arr[i]){
                index=i;
            }
        }
       
        return index;
    }
}