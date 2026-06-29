class Solution {
    public boolean doesValidArrayExist(int[] derived) {
        int a=derived[0];
        for(int i=1;i<derived.length;i++){
            a^=derived[i];
        }

        if(a==0) return true;
        return false;
    }
}