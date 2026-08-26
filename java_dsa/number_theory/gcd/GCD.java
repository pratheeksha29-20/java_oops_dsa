public class GCD {

    // Euclidean Algorithm
    public static int gcd(int a, int b) {

        while (b != 0) {
            int temp = b;
            b = a % b;
            a = temp;
        }

        return a;
    }

    // GCD of an array
    public static int gcdArray(int[] nums) {

        int g = nums[0];

        for (int i = 1; i < nums.length; i++) {
            g = gcd(g, nums[i]);
        }

        return g;
    }

    // LCM using GCD
    public static long lcm(long a, long b) {

        return (a / gcd((int)a, (int)b)) * b;
    }

    public static void main(String[] args) {

        System.out.println(gcd(12, 18));       // 6
        System.out.println(gcd(48, 18));       // 6

        int[] nums = {12, 18, 24};
        System.out.println(gcdArray(nums));    // 6

        System.out.println(lcm(12, 18));       // 36
    }
}