class Solution {
    public String discountPrices(String sentence, int discount) {
        String arr[]=sentence.trim().split("\\s+");
        StringBuilder sb=new StringBuilder();
        for(String s:arr){
             String str="";
             boolean present=true;
            if( s.length()>1 && '$'==s.charAt(0)){
                
                for(int i=1;i<s.length();i++){
                    if(!Character.isDigit(s.charAt(i))){
                        present=false;
                    }
                    str+=s.charAt(i);
                }

            if(present){
                double a=Double.valueOf(str);
                double n=a-(a*discount/100.0);
                sb.append(String.format("$%.2f",n));
            }
            else{
            sb.append(s);
            }
            }
            else {
                sb.append(s);
            }
            sb.append(" ");
        }
        return sb.toString().trim();
    }
}