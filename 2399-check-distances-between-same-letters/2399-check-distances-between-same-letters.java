class Solution {
    public boolean checkDistances(String s, int[] distance) {
        int arr[]=new int[26];
        for(int i=0;i<26;i++){
            arr[i]=-1;
        }
        for(int i=0;i<s.length();i++){
            int a=s.charAt(i)-'a';
            if(arr[a]==-1){
                arr[a]=i;
            }
            else{
                if(i-arr[a]-1!=distance[a]){
                    return false;
                }
            }
        }
        return true;
    }
}