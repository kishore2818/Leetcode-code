class Solution {
    public String countAndSay(int n) {
        String ans="1";
        for(int i=0;i<n-1;i++){
            StringBuilder sb=new StringBuilder();
            int j=0;
            while(j<ans.length()){
                char ch=ans.charAt(j);
                int count=0;
                while(j<ans.length() && ch==ans.charAt(j)){
                    count++;
                    j++;
                }
            sb.append(count);
            sb.append(ch);
            }
            ans=sb.toString();
        }
        return ans;
    }
}