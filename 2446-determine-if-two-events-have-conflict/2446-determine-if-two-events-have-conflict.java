class Solution {
    public boolean haveConflict(String[] event1, String[] event2) {
        int a1=convert(event1[0]);
        int a2=convert(event1[1]);
        int b1=convert(event2[0]);
        int b2=convert(event2[1]);

        return a1<=b2 && b1<=a2;
    }
        private int convert(String t){
            int h=Integer.parseInt(t.substring(0,2));
            int m=Integer.parseInt(t.substring(3,5));
            return h*60+m;
        }
    
}