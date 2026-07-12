class Solution {
    public boolean validateStackSequences(int[] pushed, int[] popped) {
        Stack<Integer> s=new Stack<>();
        int a=0;
        for(int i=0;i<pushed.length;i++){
            s.push(pushed[i]);
            while(!s.isEmpty() && s.peek() == popped[a]){
                s.pop();
                a++;
        }
        }
        return s.isEmpty();
    }
}