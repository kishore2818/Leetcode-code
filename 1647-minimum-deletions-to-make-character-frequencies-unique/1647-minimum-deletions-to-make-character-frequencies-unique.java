class Solution {
    public int minDeletions(String s) {
        int fre[]=new int[26];
        for(char ch:s.toCharArray()){
            fre[ch-'a']++;
        }
        int count=0;
        HashSet<Integer> set= new HashSet<>();
        for(int i=0;i<26;i++){
            int n=fre[i];
            if(fre[i]==0){
               continue;
            }
                while(set.contains(n) && n>0){
                    n--;
                    count++;
                }
                set.add(n);
            }
        
        return count;
    }
}