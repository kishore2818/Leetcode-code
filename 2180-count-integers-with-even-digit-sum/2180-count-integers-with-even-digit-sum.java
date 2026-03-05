class Solution {
    public int countEven(int num) {
        int count=0;
        if(num<9) {
            return num/2;
        }
        int ans=0;
        for(int i=1;i<=num;i++){
            ans=0;
            int temp=i;
            while(temp!=0 ){
            ans+=temp%10;
            temp=temp/10;
        }
        
        if(ans%2==0)count++;
        }
        return count;
    }
}