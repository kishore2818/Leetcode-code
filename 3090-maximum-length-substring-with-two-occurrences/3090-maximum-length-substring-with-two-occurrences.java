class Solution {
    public int maximumLengthSubstring(String s) {
        int fre[]=new int[26];
        int left=0;
        int ans=0;
        for(int i=0;i<s.length();i++){
            char ch=s.charAt(i);
            fre[ch-'a']++;
            while(fre[ch-'a']>2){
                fre[s.charAt(left)-'a']--;
                left++;
            }
            ans=Math.max(ans,i-left+1);
        }
        return ans;
    }
}