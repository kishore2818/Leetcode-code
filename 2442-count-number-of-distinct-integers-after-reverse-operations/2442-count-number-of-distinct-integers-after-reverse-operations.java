class Solution {
    public int countDistinctIntegers(int[] nums) {
        // int x=nums.length;
        // int n=x*2;
        // int arr[]=new int[n];
        // int count=0;
        // for(int i=0;i<n;i++){
        //     int f=0;

        //     if(i<nums.length){
        //     arr[i]=nums[i];
        //     }
        //     else{
        //         int r=0;
        //         while(nums[f]!=0){
        //             int a=nums[f]%10;
        //             r=r*10+a;
        //             nums[f]=nums[f]/10;
        //             }
        //             f++;
        //             arr[i]=r;
        //     }
        
        // }
        // for(int i=0;i<n;i++){
        //     for(int j=i+1;j<n;j++){
        //         if(i==j) count--;
        //         count++;
        //     }
        // }
        // return count;

        Set<Integer> set=new HashSet<>();
        for(int i:nums){
            set.add(i);
        }
        for(int i:nums){
            int rev=0;
            if(i>9){
                rev=reverse(i);
                if(!set.contains(rev)) set.add(rev);
            }
            
        }
        return set.size();
    }
    public int reverse(int n){
        int r=0;
        while(n!=0){
            int d=n%10;
            r=r*10+d;
            n/=10;
        }
        return r;
    }
}