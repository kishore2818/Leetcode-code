class Solution {
    public int countLargestGroup(int n) {
        int count=0;
        int max=0;
        int fre[]=new int[37];
        for(int i=1;i<=n;i++){
            int sum=0;
            int temp=i;
            while(temp>0){
                sum+=temp%10;
                temp/=10;
            }
            fre[sum]++;
            max=Math.max(max,fre[sum]);

        
        }
        for(int i=0;i<37;i++){
        if(fre[i]==max){
            count++;
        }
        }
        return count;
    }
}