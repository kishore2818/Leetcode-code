class Solution {
    public boolean checkInclusion(String s1, String s2) {
         if(s1.length()>s2.length()){
            return false;
        }
        int need[]=new int[26];
        int win[]= new int[26];

        for(int i=0;i<s1.length();i++){
            need[s1.charAt(i)-'a']++;
        }
        int k=s1.length();
        for(int i=0;i<k;i++){
            win[s2.charAt(i)-'a']++;
        }
        if(Arrays.equals(need,win)) return true;

        

        for(int i=k;i<s2.length();i++){
            win[s2.charAt(i)-'a']++;

            win[s2.charAt(i-k)-'a']--;

            if(Arrays.equals(need,win)) return true;
        }
        return false;
    }
}