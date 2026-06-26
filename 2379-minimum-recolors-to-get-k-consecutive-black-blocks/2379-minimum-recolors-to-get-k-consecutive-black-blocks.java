class Solution {
    public int minimumRecolors(String blocks, int k) {
        int count=0;
        int left=0;
        for(int i=0;i<k;i++){
            if(blocks.charAt(i)=='W') count++;
        }
        int min=count;
        for(int right=k;right<blocks.length();right++){
            if(blocks.charAt(left)=='W'){
            count--;}
            left++;
        
            if(blocks.charAt(right)=='W') count++;

            min=Math.min(min,count);
        }
        return min;
    }
}