class Solution {
    public boolean checkPowersOfThree(int n) {
        // while(n!=1 || n!=0){
        //     int rem=n/3;
        //     n=n/3;
        //     return rem==1 || rem==0;
        // }
        // return false;
        String base=Integer.toString(n,3);
        for(char ch:base.toCharArray()){
            int a=ch-'0';
            if(a!=0 && a!=1) return false; 
        }
        return true;
    }
}