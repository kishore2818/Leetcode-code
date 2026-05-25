class Solution {
    public String frequencySort(String s) {
        String str="";
        HashMap<Character,Integer> map=new HashMap<>();

        for(char c:s.toCharArray()){
            map.put(c,map.getOrDefault(c,0)+1);
        }

        ArrayList<Character> list=new ArrayList<>(map.keySet());
        
        Collections.sort(list,(a,b)->map.get(b)-map.get(a));
        StringBuilder sb=new StringBuilder();
        for(char i:list){
            int fre=map.get(i);
            for(int j=0;j<fre;j++){
                sb.append(i);
            }
        }
        return sb.toString();
    }
}