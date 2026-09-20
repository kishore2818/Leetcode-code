class Solution {
    public int reverseDegree(String s) {
        int ans=0;
        for(int i=0;i<s.length();i++){
            char ch=s.charAt(i);
            int a=27-(ch-'a'+1);
            ans+=(i+1)*a;
        }

        return ans;
    }
}