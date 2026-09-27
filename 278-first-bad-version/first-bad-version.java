/* The isBadVersion API is defined in the parent class VersionControl.
      boolean isBadVersion(int version); */

public class Solution extends VersionControl {
    public int firstBadVersion(int n) {
        int start = 1, end = n, mid = 0, ans = n;
        while(start <= end){
            mid = start + (end - start)/2;
            if(isBadVersion(mid)){
                ans = Math.min(ans,mid);
                end = mid - 1;
            }
            else{
                start = mid + 1;
            }
        }
        return ans;
    }
}