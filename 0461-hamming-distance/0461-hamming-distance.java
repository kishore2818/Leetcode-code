class Solution {
    public int hammingDistance(int x, int y) {
        // String a="";
        // String b="";
        // while(x>0){
        //     a=(x%2)+a;
        //     x=x/2;
        // }
        // while(y>0){
        //     b=(y%2)+b;
        //     y=y/2;
        // }

        // int m=Integer.valueOf(a,2);
        // int n=Integer.valueOf(b,2);
        // int xor=m^n;
        // String ans=Integer.toBinaryString(xor);
        // int count=0;
        // for(int i=0;i<ans.length();i++){
        //     char ch=ans.charAt(i);
        //     if(ch=='1') count++;
        // }
        int xor=x^y;
        int count=0;

        while(xor>0){
            if((xor & 1)==1) count++;
            xor=xor>>1;
        }
        return count;
    }
}