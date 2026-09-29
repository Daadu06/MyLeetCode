class Solution {
    public int peakIndexInMountainArray(int[] arr) {
        int s = 0, e = arr.length-1, mid = 0;
        while(s < e){
            mid = s + ( e - s )/2;
            if(arr[mid] < arr[mid+1]){
                s = mid + 1;
            }
            else{
                e = mid;
            }
        }
        return s;
    }
}