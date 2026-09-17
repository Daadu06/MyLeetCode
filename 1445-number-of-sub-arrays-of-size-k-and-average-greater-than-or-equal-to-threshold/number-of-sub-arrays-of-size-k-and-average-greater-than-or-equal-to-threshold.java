class Solution {
    public int numOfSubarrays(int[] arr, int k, int threshold) {
        int count = 0, sum = 0;
        for(int i = 0; i < k; i++){
            sum+=arr[i];
        }
        if(sum >= k*threshold) count++;
        for(int l = 0, r = k; r < arr.length; l++, r++){
            sum = sum - arr[l] + arr[r];
            if(sum >= k*threshold){
                count++;
            }
        }
        return count;
    }
}