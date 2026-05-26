class Solution {
    public int similarPairs(String[] words) {
        int count=0;
        for(int i=0;i<words.length;i++){
        HashSet<Character> set1=new HashSet<>();
            String word=words[i];
            for(char ch:word.toCharArray()){
                set1.add(ch);
            }
            for(int j=i+1;j<words.length;j++){
            HashSet<Character> set2=new HashSet<>();
            String word2=words[j];
            for(char ch:word2.toCharArray()){
                set2.add(ch);
            }
                if(set1.equals(set2)) count++;
                }
        
    }
    return count;
    }
}