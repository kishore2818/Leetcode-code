class Solution {
    public int numberOfArrays(int[] differences, int lower, int upper) {
        // int count=0;
        // for(int i=lower;i<=upper;i++){
        //     int sum=i;
        //     int end=0;
        //     for(int j=0;j<differences.length;j++){
        //         sum+=differences[j];

        //         if(sum>upper || sum<lower) break;
        //         end++;
        //     }
        //     if(end==differences.length) count++;
        // }
        // return count;

        long prefix=0;
        long maxp=0;
        long minp=0;

        for(int x:differences){
            prefix+=x;

            maxp=Math.max(maxp,prefix);
            minp=Math.min(minp,prefix);
        }

        long s=minp-lower;
        long e=maxp-upper;

        if(s<e) return 0;

        return (int)(s-e+1);
    }
}