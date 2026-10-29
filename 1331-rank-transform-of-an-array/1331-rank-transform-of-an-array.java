class Solution {
    public int[] arrayRankTransform(int[] arr) {
        int ar[]=new int[arr.length];
        int temp[]=arr.clone();
        Arrays.sort(temp);
        HashMap<Integer,Integer> map=new HashMap<>();
        int r=1;
        for(int i=0;i<arr.length;i++){
            
            if(!map.containsKey(temp[i])){
                map.put(temp[i],r);
                r++;
            }
           
        }

        for(int i=0;i<arr.length;i++){
            ar[i]=map.get(arr[i]);
        }
        
        return ar;
    }
}