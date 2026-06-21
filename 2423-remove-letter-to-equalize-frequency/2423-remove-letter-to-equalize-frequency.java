class Solution {
    public boolean equalFrequency(String word) {
        int fre[]=new int [26];
        for(char ch:word.toCharArray()){
            fre[ch-'a']++;
        }
        for(int i=0;i<26;i++){
            int a=fre[i];
            if(a==0) continue;
            
            fre[i]--;
            if(isValid(fre)){
                return true;
            }
            fre[i]++;
        
        }
        return false;
    }
    private boolean isValid(int [] fre){
        int tar=0;

        for(int i:fre){
            if(i==0) continue;

            if(tar==0) tar=i;
            else if(tar!=i) return false;
        }
            return true;
        }
    

}