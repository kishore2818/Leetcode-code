class Solution {
    public String toHex(int num) {
        if(num==0) return "0";

        String h="0123456789abcdef";
        StringBuilder sb=new StringBuilder();
        while(num!=0){
            sb.append(h.charAt(num & 15));
            num>>>=4;

        }
        return sb.reverse().toString();
    }
}