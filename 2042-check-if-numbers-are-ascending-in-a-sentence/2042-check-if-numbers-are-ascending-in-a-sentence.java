class Solution {
    public boolean areNumbersAscending(String s) {
        int min=0;
        for(int i=0;i<s.length();i++){
            if(Character.isDigit(s.charAt(i))){
                int a=0;
                while(i<s.length() && Character.isDigit(s.charAt(i))){
                    a=a*10+(s.charAt(i)-'0');
                    i++;
                }
                if(a<=min) return false;
                min=a;
            }
        }
        return true;
    }
}