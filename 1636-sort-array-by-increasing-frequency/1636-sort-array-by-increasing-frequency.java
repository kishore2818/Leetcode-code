class Solution {
    public int[] frequencySort(int[] nums) {
        HashMap<Integer,Integer> fre=new HashMap<>();

        for(int i:nums){
            fre.put(i,fre.getOrDefault(i,0)+1);
        }
        Integer arr[]=new Integer[nums.length];
        for(int i=0;i<nums.length;i++){
            arr[i]=nums[i];
        }

        Arrays.sort(arr, (a, b) -> {
            if (fre.get(a) != fre.get(b)) {
                return fre.get(a) - fre.get(b); 
            } else {
                return b - a;
            }
        });

        for(int i=0;i<nums.length;i++){
            nums[i]=arr[i];
        }
    return nums;
    }
}