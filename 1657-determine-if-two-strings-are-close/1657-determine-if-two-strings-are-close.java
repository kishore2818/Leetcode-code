class Solution {
    public boolean closeStrings(String word1, String word2) {
        if(word1.length()!=word2.length()) return false;
        int f1[]=new int[26];
        int f2[]=new int[26];
        for(int i=0;i<word1.length();i++){
            char c1=word1.charAt(i);
            char c2=word2.charAt(i);
            f1[c1-'a']++;
            f2[c2-'a']++;
        }

        for(int i=0;i<26;i++){
            if((f1[i]==0) !=(f2[i]==0)) return false;
        }
        Arrays.sort(f1);
        Arrays.sort(f2);
        return Arrays.equals(f2,f1);
    }
}