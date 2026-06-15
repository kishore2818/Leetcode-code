class Solution {
    public int alternateDigitSum(int n) {
        // int ans=0;
        // int count=0;
        // 
        // int fin=0;
        // while(ans!=0){
        //     int rem=ans%10;
        //     int a=1;
        //     fin+=rem;
        // }

        int ans=0;
        ArrayList<Integer> list= new ArrayList<>();
        while(n!=0){
            int rem=n%10;
            ans=ans*10+rem;
            n/=10;
        }
        while(ans!=0){
            int rem=ans%10;
            list.add(rem);
            ans/=10;
        }
        int a=0;
        boolean yes=true;
        for(int i=0;i<list.size();i++){
            if(yes)
            {
                a+=list.get(i);
                yes=false;
            }
            else
            {
                a-=list.get(i);
                yes=true;
            }
        }
        System.out.print(list);
        return a;

    }
}