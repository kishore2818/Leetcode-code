class Solution {
    public boolean uniformArray(int[] nums) {
        int min=Integer.MAX_VALUE;
        int e=0;
        for(int i:nums){
            if(i<min) min=i;
            if(i%2==0) e++;
        }
        boolean ae=(e==nums.length);
        boolean ismin=(min%2==1);
        return ae|| ismin;
    }
}