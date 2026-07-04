class Solution {
    public boolean winnerOfGame(String colors) {
    //    StringBuilder sb=new StringBuilder(colors);
    //     int turn=0;

    //    for(int i=1;i<colors.length()-1;i++){
    //     char ch=colors.charAt(i);
    //     if(turn%2==0){
    //     if(colors.charAt(i)=='A' && colors.charAt(i-1)=='A' && colors.charAt(i+1)=='A'){
    //     }else return false;}
    //     else{
    //         if(colors.charAt(i)=='B' && colors.charAt(i-1)=='B' && colors.charAt(i+1)=='B'){
    //         }else return true;}
    //         turn++;
    //    }
    //     return false;

    int x=0;
    int y=0;
    int count=1;
    for(int i=1;i<colors.length();i++){
        char b=colors.charAt(i-1);
        char a=colors.charAt(i);
        if(a==b) {
            count++;
            }
        else{
            if(b=='A' && count>=3){
                x+=count-2;
            }
            if(b=='B' && count>=3) {
                y+=count-2;
            }
            count=1;
        }}
        
        if( colors.charAt(colors.length()-1)=='A' && count>=3) x+=count-2;
        if( colors.charAt(colors.length()-1)=='B' && count>=3) y+=count-2;

    
        return x>y;
    
    }
}