class Solution {
    public double findMaxAverage(int[] nums, int k) {
        int currsum = 0;
        for (int i = 0; i < k; i++) {
            currsum += nums[i];
        }
        int maxsum = currsum; 
        for (int l = 0, r = k; r < nums.length; l++, r++) {
            currsum = currsum - nums[l] + nums[r];
            maxsum = Math.max(maxsum, currsum);
        }

        return (double) maxsum / k;
    }
}