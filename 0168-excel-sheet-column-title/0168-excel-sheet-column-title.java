class Solution {
    public String convertToTitle(int columnNumber) {
        char str=((char)(columnNumber+64));

        if(columnNumber<=26) return String.valueOf(str);

        String c="";
        while(columnNumber>0){
            columnNumber--;    
            int rev=columnNumber%26;
            c=(char)('A'+rev)+c; 
            columnNumber/=26;

        }
        return c ;
    }
}