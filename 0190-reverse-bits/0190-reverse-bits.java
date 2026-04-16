// import java.math.BigInteger;
class Solution {
    public int reverseBits(int n) {
        // String str=String.valueOf(n);
        // BigInteger b=new BigInteger(str,2);
        // StringBuilder sb=new StringBuilder(b.toString());
        // sb.reverse();
        // BigInteger rev=new BigInteger(sb.toString());
        // long l=Integer.valueOf(rev);
        // return l;


        int res=0;
        for(int i=0;i<32;i++){
            int bit=n & 1;
            res=(res<<1)| bit;
            n=n>>1;
        }
        return res;
    }
}