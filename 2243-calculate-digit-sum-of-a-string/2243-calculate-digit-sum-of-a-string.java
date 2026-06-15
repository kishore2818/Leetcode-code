class Solution {
    public String digitSum(String s, int k) {
        while(s.length()>k){
        StringBuilder sb=new StringBuilder();
            for(int i=0;i<s.length();i+=k){
                int a=i+k;
                String sub="";
                if(s.length()>a) sub=s.substring(i,a);
                else sub=s.substring(i);
            
            int sum=0;
            for(char c:sub.toCharArray()){
                sum+=c-'0';
            }
            sb.append(sum);
            }
            s=sb.toString();

        }
        //  String x=sb.toString();
         return s;
    }
}