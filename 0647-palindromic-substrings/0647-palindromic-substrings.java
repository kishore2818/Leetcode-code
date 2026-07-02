class Solution {
    public static boolean isPalindrome(String s){
        StringBuilder sb=new StringBuilder(s).reverse();
         return s.equals(sb.toString());
    }
    public int countSubstrings(String s) {
        int count=0;
    for(int i=0;i<s.length();i++){
        StringBuilder str=new StringBuilder();
        for(int j=i;j<s.length();j++){
            str.append(s.charAt(j));
            if(isPalindrome(str.toString())) count++;
        }
    }
        return count;
    }
}