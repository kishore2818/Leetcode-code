class Solution {
    public boolean checkString(String s) {

        for(int i=0;i<s.length()-1;i++){
            char ch=s.charAt(i);
            char c=s.charAt(i+1);
            if(ch=='b' && c=='a') return false;
        }
        return true;
    }
}