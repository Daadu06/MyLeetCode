class Solution {
    public long countCommas(long n) {
        long ans = 0;
        long group = 1000; // First comma appears at 1,0000

        // Each group of numbers starting from 1,000, 1,000,000, etc.
        while (group <= n) {
            ans += (n - group + 1); // All numbers from 'group' to 'n' get an extra comma
            group *= 1000; // Move to next comma group
        }

        return ans;
    }

    public static void main(String[] args) {
        Solution sol = new Solution();
        System.out.println(sol.countCommas(999));        // 0
        System.out.println(sol.countCommas(1000));       // 1
        System.out.println(sol.countCommas(1234));       // 235
        System.out.println(sol.countCommas(1000000));    // 1999
    }
}
