class Solution {
    public int compress(char[] chars) {
        int i=0;
        int j=0;
        ArrayList<Character> list=new ArrayList<>();
       while(i<chars.length){
        int count=0;
        while(j<chars.length && chars[j]==chars[i]){
            count++;
            j++;

        }
        list.add(chars[i]);
        if(count>1){
            String str=String.valueOf(count);
            for(char ch:str.toCharArray()){
                list.add(ch);
            }
        }
        i=j;
       }
       for(int z=0;z<list.size();z++){
        chars[z]=list.get(z);
        
       }
        return list.size();
    }
}