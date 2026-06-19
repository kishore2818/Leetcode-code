class Solution {
    public String decodeString(String s) {
        Stack<Integer> nums = new Stack<>();
        Stack<String> sa = new Stack<>();
        String cur = "";
        int num = 0;
        for (char ch : s.toCharArray()) {
            if (Character.isDigit(ch)) {
                num = num * 10 + (ch - '0');
            }
            else if (ch == '[') {
                nums.push(num);
                sa.push(cur);
                num = 0;
                cur = "";
            }
            else if (ch == ']') {
                int k = nums.pop();
                String temp = cur;
                cur = sa.pop();
                while (k-- > 0) {
                    cur += temp;
                }
            }
            else {
                cur += ch;
            }
        }
        return cur;
    }
}