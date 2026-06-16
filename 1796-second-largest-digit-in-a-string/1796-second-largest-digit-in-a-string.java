class Solution {
    public int secondHighest(String s) {
        int fre[]=new int[10];
        ArrayList<Integer> list=new ArrayList<>();
        for(int i=0;i<s.length();i++){
            char ch=s.charAt(i);
            if(Character.isDigit(ch)){
                int a=ch-'0';
                if(!list.contains(a)) {
                list.add(a);
            }}
        }
        Collections.sort(list);
        if(list.size()<2) {
            return -1;}
        return list.get(list.size()-2);
    }
}