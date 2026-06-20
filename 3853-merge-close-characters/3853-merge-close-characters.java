class Solution {
    public String mergeCharacters(String s, int k) {
        StringBuilder sb=new StringBuilder();
        int fre[]=new int[26];
        Arrays.fill(fre,-1);
        for(int i=0;i<s.length();i++){
            int ch=s.charAt(i)-'a';
                if(fre[ch]!=-1 && sb.length()-fre[ch]<=k) continue;
                fre[ch]=sb.length();
                sb.append(s.charAt(i));
            }
        
        return sb.toString();
    }
}