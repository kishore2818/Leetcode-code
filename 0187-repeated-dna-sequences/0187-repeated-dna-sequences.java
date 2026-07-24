class Solution {
    public List<String> findRepeatedDnaSequences(String s) {
        Set<String> s1=new HashSet<>();
        Set<String> s2=new HashSet<>();
        for(int i=0;i<=s.length()-10;i++){
            String sub=s.substring(i,i+10);
            if(!s1.add(sub)){
                s2.add(sub);
            }
        }
        return new ArrayList<>(s2);
    }
}