class Solution {
    public int myAtoi(String s) {
        // int n=0;
        // int sign=1;
        // StringBuilder sb=new StringBuilder(0);
        // for(int i=0;i<s.length();i++){
        //     char ch=s.charAt(i);
            
        //     if(ch==' ') continue;
        //     else if(Character.isLetter(ch))break;
        //     else if(ch=='-') sign=-1; 
        //     else if(Character.isDigit(ch)){
        //     res=res*10+ch-'0';
        // }
        // }
        // return res*sign;

        int i=0;
        int sign=1;
        int n=s.length();
        int res=0;
        while(i<n && s.charAt(i)==' ') i++;

        if(i<n &&(s.charAt(i)=='-' || s.charAt(i)=='+')){
            if(s.charAt(i)=='-') {
                sign=-1;
                
            }
            i++;}

            while(i<n && Character.isDigit(s.charAt(i))){
                int d=s.charAt(i)-'0';

                if(res>Integer.MAX_VALUE/10 || res==Integer.MAX_VALUE/10 && d>7){
                    if(sign==1) return Integer.MAX_VALUE;
                    else return Integer.MIN_VALUE;
                }

                res=res*10+d;
                i++;
            }
            return res*sign;
        }
    
}