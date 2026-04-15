class Solution {
    public int titleToNumber(String columnTitle) {
        String str="";
        int tot=0;
        if(columnTitle.length()<=1) return ((int)(columnTitle.charAt(0)))-64;
        
        for(int i=0;i<columnTitle.length();i++){
            char ch=columnTitle.charAt(i);
            int c=((int)ch)-64;  
            tot=tot*26+c;    
        }
        return tot;
    }
}