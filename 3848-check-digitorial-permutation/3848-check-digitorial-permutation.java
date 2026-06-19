class Solution {
    public boolean isDigitorialPermutation(int n) {
        
        int fact[]=new int[10];
        fact[0]=1;
        for(int i=1;i<10;i++){
            int num=1;
            for(int j=1;j<=i;j++){
             num=num*j;
        }    
        fact[i]=num;
        }
        
        int ans=0;
        List<Integer> l1=new ArrayList<>();
        List<Integer> l2=new ArrayList<>();
    
        String str=String.valueOf(n);
        for(char ch:str.toCharArray()){
            int a=ch-'0';
            ans+=fact[a];
        }
        String a=String.valueOf(ans);
        for(char ch:a.toCharArray()){
            int z=ch-'0';
            l1.add(z);
        }
        while(n!=0){
            int rem=n%10;
            l2.add(rem);
            n/=10;
        }
        Collections.sort(l1);
        Collections.sort(l2);

        if(l1.size()!=l2.size()) return false;
        for(int i=0;i<Math.max(l1.size(),l2.size());i++){
            if(!l1.get(i).equals(l2.get(i))) return false;
        }
        return true;   


    }
}