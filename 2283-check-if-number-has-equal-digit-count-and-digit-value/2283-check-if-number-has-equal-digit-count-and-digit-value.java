class Solution {
    public boolean digitCount(String num) {
        int fre[]=new int[10];
        for(int i=0;i<num.length();i++){
            int dig=num.charAt(i)-'0';
            fre[dig]++;
        }
        for(int i=0;i<num.length();i++){
            if(fre[i]!=num.charAt(i)-'0') return false;
        }
        return true;
    }
}