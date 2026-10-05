class Solution {
    public int scoreOfParentheses(String s) {
        
        Stack<Integer> st=new Stack<>();
        st.push(0);
        for(char ch:s.toCharArray()){
            if(ch=='(') {
                st.push(0);
            }
            else{
                int in=st.pop();
                int score=Math.max(2*in,1);

                int pre=st.pop();
                st.push(pre+score);
            }
        }
        return st.pop();
    }
}