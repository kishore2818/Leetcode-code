class Solution {
    public int sumBase(int n, int k) {
        int count=0;
        while(n>0){
        int a=n%k;
        n=n/k;
        count+=a;
        }
        return count;
    }
}