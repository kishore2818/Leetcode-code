class Solution {
    public int countSymmetricIntegers(int low, int high) {
        int count=0;
        for(int i=low;i<=high;i++){
        String str= String.valueOf(i);
        int len=str.length();
        int left=0;
        int right=0;
        if(len%2==1) {
            continue;
        }
        
        else{
            int a=Integer.valueOf(str);
            left=0;
            right=0;
            int n=(int)Math.pow(10,(len/2));
            left=i%n;
            right=i/n;

            }
            int x=0,y=0;
            while(left!=0 ){
                x+=left%10;
                left/=10;}
                while(right!=0){
                y+=right%10;
                right/=10;
            }
            if(x==y) count++;
        }
    return count;
        }
    }
