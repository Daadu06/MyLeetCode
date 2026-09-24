class Solution {
    public int search(int[] nums, int target) {
        int s = 0, end = nums.length - 1,mid = 0;
        int left = 0, right = nums.length - 1;
        while( s<=end){
            mid = s + (end-s) / 2;
            if(target == nums[mid]){return mid;}
            if(nums[left]<=nums[mid]){
                if(nums[left]<=target && target<=nums[mid]){
                    end = mid - 1;
                }
                else{
                    s = mid+1;
                }
            }
            else{
                if(nums[mid]<=target && target<=nums[right]){
                    s = mid + 1;
                }
                else{
                    end = mid - 1;
                }
            }
        }
        return -1;
    }
}