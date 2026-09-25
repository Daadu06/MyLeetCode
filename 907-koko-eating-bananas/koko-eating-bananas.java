class Solution {
    public int minEatingSpeed(int[] piles, int h) {
        int max = Integer.MIN_VALUE;
        for(int pile : piles){
            if(pile > max){
                max = pile;
            }
        }
        int start = 1, end = max, mid = 0;
        while(start < end){
            mid = start + ( end - start ) / 2;
            int hours = 0;
            for(int pile : piles){
                hours += (pile + mid - 1)/mid;
            }
            if(hours <= h){
                end = mid;
            }
            else{
                start = mid+1;
            }
        }
        return start;
    }
}