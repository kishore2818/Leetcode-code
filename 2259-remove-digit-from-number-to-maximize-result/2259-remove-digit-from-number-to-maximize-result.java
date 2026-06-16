class Solution {
    public String removeDigit(String number, char digit) {
        String ans="";
        for(int i=0;i<number.length();i++){
            if(number.charAt(i)==digit){
            StringBuilder sb=new StringBuilder(number);
            sb.deleteCharAt(i);

            String str=sb.toString();
            if(ans.isEmpty() || str.compareTo(ans)>0){
                ans=str;
            }
            }
        }
        return ans;
    }
}