class Solution {
    public int getLucky(String s, int k) {
        int ans=0;
        StringBuilder sb=new StringBuilder();
        for(char c:s.toCharArray()){
            sb.append(c-'a'+1);
        
        }
        while(k-->0){
            ans=0;
            for(char c:sb.toString().toCharArray()){
                ans+=c-'0';

            }
            sb=new StringBuilder(String.valueOf(ans));
        }
        return ans;
    }
}