class Solution {
    public int maxCount(int[] banned, int n, int maxSum) {
        int count=0;
        HashSet<Integer> set=new HashSet<>();
        for(int i:banned){
            set.add(i);
        }
        int sum=0;
        int a=1;
        while(a<=n){
            if(!set.contains(a) && sum+a<=maxSum){
                sum+=a;
                count++;
            }
            a++;
        }
        return count;
    }
}