class Solution {
    public int gcd(int a,int b){
        while(b!=0){
            int temp=b;
            b=a%b;
            a=temp;
        }
        return a;
    }
    public int lcm(int a,int b){
        return (a/gcd(a,b))*b;
    }
    public int maxLength(int[] nums) {
        int max=0;
        for(int i=0;i<nums.length;i++){
            long p=1;
            int l=1;
            int g=0;
            for(int j=i;j<nums.length;j++){
                p*=nums[j];
                l=lcm(l,nums[j]);
                g=gcd(g,nums[j]);
                if(p==(long)l*g){
                    max=Math.max(max,j-i+1);
                }
            }
        }
        return max;
    }
}