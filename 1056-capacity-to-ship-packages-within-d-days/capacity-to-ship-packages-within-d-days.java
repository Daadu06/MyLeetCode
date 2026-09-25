class Solution {
    public int shipWithinDays(int[] weights, int days) {
        int max = Integer.MIN_VALUE, sum = 0;
        for(int val : weights){
            max = Math.max(max,val);
            sum+=val;
        }
        int start = max, end = sum, mid = 0;

        while(start < end){
            mid = start + ( end - start ) / 2;
            int currweight = 0, reqdays = 1;
            for(int weight : weights){
                if(currweight+weight <= mid){
                    currweight+=weight;
                }
                else{
                    reqdays++;
                    currweight = weight;
                }
            }
            if(reqdays > days){
                start = mid + 1;
            }
            else{
                end = mid;
            }
        }
        return start;
    }
}