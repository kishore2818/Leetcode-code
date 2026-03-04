class Solution {
    public int vowelStrings(String[] words, int left, int right) {
        int count=0;
    
        for(int i=left;i<=right;i++){
            String word=words[i];
            char c=word.charAt(0);
            char ch=word.charAt(word.length()-1);
            
            if(isVowel(c) && isVowel(ch)) {
                count++;
            }
            }
            return count;
    }
        private boolean isVowel(char ch){
            return ch=='a' || ch=='e' || ch=='i' || ch=='o' || ch=='u';
        
        
    }
}