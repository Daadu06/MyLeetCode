class Solution {
    public int characterReplacement(String s, int k) {
        Map <Character, Integer> map = new HashMap<>();
        int left = 0, right = 0, max = 0, maxFreq = 0;
        while(right < s.length()){
            char c = s.charAt(right);
            map.put(c, map.getOrDefault(c,0)+1);
            maxFreq = Collections.max(map.values());
            while((right - left + 1) - maxFreq > k){
                char a = s.charAt(left);
                map.put(a, map.get(a) - 1);
                if(map.get(a) == 0){
                    map.remove(a);
                }
                left++;
            }
            max = Math.max(max, right - left + 1);
            right++;
        }
        return max;
    }
}