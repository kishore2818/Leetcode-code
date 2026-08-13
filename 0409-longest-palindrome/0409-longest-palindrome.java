class Solution {
    public int longestPalindrome(String s) {
        HashMap<Character,Integer> map=new HashMap<>();
        for(char ch:s.toCharArray()){
            map.put(ch,map.getOrDefault(ch,0)+1);
        }
        int ans=0;
        boolean odd=false;
        for(Map.Entry<Character,Integer> entry: map.entrySet()){
            int count=entry.getValue();
            if(count%2==0) {
                ans+=count;
            }
            else {
                ans+=count-1;
                odd=true;
            }
        }
        if(odd) ans++;
        return ans;
    }
}