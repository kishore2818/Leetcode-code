class Solution {
    public boolean uniqueOccurrences(int[] arr) {
        Arrays.sort(arr);
        int freq[]=new int[arr.length];
        int k=0;
        int count=1;
        for(int i=1;i<arr.length;i++){
            if(arr[i]==arr[i-1]){
                count++;
            }
            else{
                freq[k++]=count;
                count=1;
            }
        }
        freq[k++]=count;

        Arrays.sort(freq,0,k);
        for(int i=0;i<k-1;i++){
            if(freq[i]==freq[i+1]) return false;
        }
        return true;
    }
}