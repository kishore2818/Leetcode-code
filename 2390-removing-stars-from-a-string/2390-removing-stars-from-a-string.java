class Solution {
    public String removeStars(String s) {
        // StringBuilder str=new StringBuilder();
        // for(int i=0;i<s.length();i++){
        //     char ch=s.charAt(i);
        //     if(ch=='*'){

        //     }
        // }
        Stack<Character> st=new Stack<>();
        for(int i=0;i<s.length();i++){
            char ch=s.charAt(i);
            if(Character.isLowerCase(ch)){
                st.push(ch);
            }
            else if(!Character.isLowerCase(ch) && !st.isEmpty()){
                st.pop();
            }
        }
        StringBuilder sb=new StringBuilder();
        for(char i:st){
            sb.append(i);
        }
        return sb.toString();
    }
}