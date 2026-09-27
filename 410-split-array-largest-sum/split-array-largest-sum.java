class Solution {
    public int splitArray(int[] nums, int k) {
        int max = 0, sum = 0;
        for(int val : nums){
            max = Math.max(max,val);
            sum+=val;
        }
        int start = max, end = sum, mid = 0, ans = 0;
        while(start <= end){
            mid = start + (end - start) / 2;
            int val = 0, groups = 1;
            for(int i = 0; i < nums.length; i++){
                if(val+nums[i] <= mid){
                    val+=nums[i];
                }
                else{
                    val = nums[i];
                    groups++;
                }
            }
            if(groups > k){
                start = mid + 1;
            }
            else{
                ans = mid;
                end = mid - 1;
            }
        }
        return ans;
    }
}