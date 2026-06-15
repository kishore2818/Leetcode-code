class Solution {
    public int maxProduct(int n) {
        int ans=0;
       ArrayList<Integer> list=new ArrayList<>();
       while(n!=0){
        int rem=n%10;
        list.add(rem);
        n/=10;
       }
       Collections.sort(list);

        return list.get(list.size()-2)*list.get(list.size()-1);
    }
}