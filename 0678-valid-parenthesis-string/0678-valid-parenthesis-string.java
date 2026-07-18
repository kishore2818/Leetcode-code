class Solution {
    public boolean checkValidString(String s) {
        int count=0;
        Stack<Integer> open=new Stack<>();
        Stack<Integer> star=new Stack<>();

        for(int i=0;i<s.length();i++){
            char c=s.charAt(i);
            if(c=='(') open.push(i);

            if(c=='*') star.push(i);

            if( c==')'){
                if(!open.isEmpty()){
                
                open.pop();
            }
            else if(!star.isEmpty()) star.pop();
            
            else return false;
    }
        }

        while(!open.isEmpty() && !star.isEmpty()){
            if(open.peek()<star.peek()){
                open.pop();
                star.pop();
            }
            else return false;
        }
        return open.isEmpty();

    }
}