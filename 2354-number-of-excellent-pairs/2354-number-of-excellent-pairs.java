class Solution {
    public long countExcellentPairs(int[] nums, int k) {
        HashSet<Integer> set=new HashSet<>();
        for(int i:nums){
            set.add(i);
        }
        long[] fre=new long[32];
        for(int i:set){
            fre[Integer.bitCount(i)]++;
        }
        long count=0;
        for(int i=0;i<32;i++){
            for(int j=0;j<32;j++){
            // long a=Integer.bitCount(arr[i]);
            // long b=Integer.bitCount(arr[j]);
            if(i+j>=k){
                count+=fre[i]*fre[j];
            }

        }
        }
        return count;
    }
}