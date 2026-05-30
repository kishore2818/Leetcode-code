class Solution {
    public int[] shortestToChar(String s, char c) {
        int arr[]=new int[s.length()];
        int n=s.length();
        int l=-n;
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)==c){
                l=i;
            }
            arr[i]=i-l;
        }

        l=2*n;
        for(int i=n-1;i>=0;i--){
            if(s.charAt(i)==c){
                l=i;
            }
            arr[i]=Math.min(arr[i],l-i);
        }
        return arr;
    }
}