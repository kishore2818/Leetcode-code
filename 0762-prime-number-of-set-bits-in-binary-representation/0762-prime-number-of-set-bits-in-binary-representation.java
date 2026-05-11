class Solution {
    public int countPrimeSetBits(int left, int right) {
        int count=0;
        for(int i=left;i<=right;i++){
            int num =i;
            int set=0;
            while(num>0){
                set+=num &1;
                num>>=1;
            }
            if(set == 2 || set == 3 || set == 5 || set == 7 ||
               set == 11 || set == 13 || set == 17 || set == 19){
                count++;
        }
        }
        return count;
    }
}