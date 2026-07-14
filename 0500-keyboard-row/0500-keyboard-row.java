class Solution {
    public String[] findWords(String[] words) {
        String s1="qwertyuiop";
        String s2="asdfghjkl";
        String s3="zxcvbnm";
        ArrayList<String> list=new ArrayList<>();
        for(int i=0;i<words.length;i++){
            
            String str=words[i].toLowerCase();
            String row="";
            if(s1.contains(str.charAt(0)+"")){
                row=s1;
            }else if(s2.contains(str.charAt(0)+"")){
                row=s2;
            }else{
                row=s3;
            }

            boolean valid=true;
            for(int j=0;j<str.length();j++){
                if(!row.contains(str.charAt(j)+"")){
                    valid=false;
                    break;
                }
            }
            if(valid){
                list.add(words[i]);
            }
        }
        String a[]=new String[list.size()];
        for(int i=0;i<list.size();i++){
            a[i]=list.get(i);
        }
    
    return a;
    }
}