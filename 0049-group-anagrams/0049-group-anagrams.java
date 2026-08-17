class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        List<List<String>> ans=new ArrayList<>();
        List<String> key=new ArrayList<>();

        for(String s:strs){
            char[] a=s.toCharArray();
           Arrays.sort(a);
           String str=new String(a);

            boolean found =false;
           for(int i=0;i<key.size();i++){
            if(key.get(i).equals(str)){
            ans.get(i).add(s);
            found=true;
            break;
            }
           }
           if(!found){
            key.add(str);
            List<String> newone=new ArrayList<>();
            newone.add(s);
            ans.add(newone);
           }
        }
        return ans;
    }
}