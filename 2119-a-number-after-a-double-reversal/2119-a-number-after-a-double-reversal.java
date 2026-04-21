class Solution {
    public boolean isSameAfterReversals(int num) {
        // if(num==0) return true;
        // int temp=num;
        // int rev=0;
        // while(temp!=0){
        //     int bal=temp%10;
        //     rev=rev*10+bal;
        //     temp=temp/10;
        // }

        
        return num==0|| num%10!=0;

    }
}