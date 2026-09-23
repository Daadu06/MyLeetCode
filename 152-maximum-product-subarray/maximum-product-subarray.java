class Solution {
    public int maxProduct(int[] nums) {
        int max = Integer.MIN_VALUE;
        int prefix = 1, suffix = 1;
        for(int i = 0; i < nums.length; i++){
            prefix*=nums[i];
            if(prefix > max){
                max = prefix;
            }
            if(prefix == 0){
                prefix = 1;
            }
        }
        for(int i = nums.length-1; i >= 0; i--){
            
            suffix*=nums[i];
            
            if(suffix > max){
                max = suffix;
            }
            if(suffix == 0){
                suffix = 1;
            }
        }
        return max;
    }
}