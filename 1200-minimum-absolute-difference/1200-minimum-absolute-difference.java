class Solution {
    public List<List<Integer>> minimumAbsDifference(int[] arr) {
        Arrays.sort(arr);
        int min=Integer.MAX_VALUE;
        ArrayList<List<Integer>> list =new ArrayList <>();
        for(int i=0;i<arr.length-1;i++){
            min=Math.min(min,arr[i+1]-arr[i]);
        }
        for(int i=0;i<arr.length-1;i++){
        List<Integer> pair=new ArrayList<>();

            if(arr[i+1]-arr[i]==min){
               pair.add(arr[i]);
               pair.add(arr[i+1]);
               list.add(pair);
            }
        }
        return list;
    }
}