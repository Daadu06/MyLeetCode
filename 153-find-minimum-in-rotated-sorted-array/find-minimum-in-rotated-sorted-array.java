class Solution {
    public int findMin(int[] nums) {
        int start = 0, end = nums.length - 1, mid = 0;
        int right = nums.length - 1;
        while(start < end){
            mid = start + ( end - start ) / 2;
            if(nums[mid] > nums[right]){
                start = mid + 1;
            }
            else{
                end = mid;
            }
        }
        return nums[start];
    }
}