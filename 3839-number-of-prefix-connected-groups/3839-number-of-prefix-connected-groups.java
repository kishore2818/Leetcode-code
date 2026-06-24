class Solution {
    public int prefixConnected(String[] words, int k) {
        int count=0;
        HashMap<String,Integer> map=new HashMap<>();
        for(int i=0;i<words.length;i++){
            if(k>words[i].length()) continue;
            String str=words[i].substring(0,k);
            map.put(str,map.getOrDefault(str,0)+1);
        }
        for(int i:map.values()){
            if(i>1) count++;
        }
        return count;
    }
}