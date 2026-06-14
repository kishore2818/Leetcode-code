class Solution {
    public boolean canAliceWin(int n) {
       int rem=10;
       boolean Aturn=true;
       while(rem<=n){
        n-=rem;
        rem--;
        Aturn=!Aturn;
       }
       return !Aturn;
    }
}