class Solution {
    public String removeKdigits(String num, int k) {
        Stack<Integer> s=new Stack<>();
        for(char ch:num.toCharArray()){
            int n=ch-'0';
            while(!s.isEmpty() && s.peek()>n && k!=0){
                s.pop();
                k--;
            }
            
         s.push(n);

        }
        StringBuilder sb=new StringBuilder();
        for(int i:s){
            
            sb.append(i);}
            while(!sb.isEmpty() && sb.charAt(0)=='0' ){
                sb.deleteCharAt(0);
            }
            while(!sb.isEmpty() && k!=0){
                sb.deleteCharAt(sb.length()-1);
                k--;
            }
            if(sb.isEmpty()) return "0";
        return sb.toString();
        
    }
}