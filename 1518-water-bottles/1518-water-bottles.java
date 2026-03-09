class Solution {
    public int numWaterBottles(int numBottles, int numExchange) {
        int tot=0;
        while(numBottles>=numExchange){
                int n=numBottles/numExchange;

                int bal=numBottles%numExchange;

                tot+=n*numExchange;

                numBottles=n+bal;                
        }
        return tot+numBottles;
    }
}