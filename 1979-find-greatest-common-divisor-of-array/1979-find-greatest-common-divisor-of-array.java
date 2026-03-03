import java.math.BigInteger;
class Solution {
    public int findGCD(int[] nums) {
        Arrays.sort(nums);
        BigInteger a=BigInteger.valueOf(nums[0]);
        BigInteger b=BigInteger.valueOf(nums[nums.length-1]);
        BigInteger ans=a.gcd(b);
        int z=ans.intValue();
        return z;

    }
}