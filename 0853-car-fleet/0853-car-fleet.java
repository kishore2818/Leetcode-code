class Solution {
    public int carFleet(int target, int[] position, int[] speed) {
        int n=position.length;
        int arr[][]=new int[n][2];
        for(int i=0;i<n;i++){
            arr[i][0]=position[i];
            arr[i][1]=speed[i];
        }

        Arrays.sort(arr,(a,b)->b[0]-a[0]);

        int count=0;
        double lasttime=0;

        for(int i=0;i<n;i++){
            double dis=target-arr[i][0];
            double time=(double)dis/arr[i][1];

            if(time>lasttime){
                count++;
                lasttime=time;
            }
        }
        return count;
    }
}