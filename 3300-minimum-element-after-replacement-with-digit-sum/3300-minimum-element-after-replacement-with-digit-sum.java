class Solution {
    public int minElement(int[] nums) {
        int arr[]=new int[nums.length];
        for(int i=0;i<nums.length;i++){
            int temp=nums[i];
            // if(temp<=9) {
            //     arr[i]=temp;
            // }else
            {
                int ans=0;
            while(temp!=0){
                ans+=temp%10;
                temp=temp/10;
            }
            arr[i]=ans;
            }
        }
        Arrays.sort(arr);
        return arr[0];
    }
}