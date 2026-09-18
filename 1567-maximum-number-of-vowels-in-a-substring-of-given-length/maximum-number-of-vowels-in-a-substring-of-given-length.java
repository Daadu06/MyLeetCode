class Solution {
    public int maxVowels(String s, int k) {
        Set<Character> list = new HashSet<>(Arrays.asList('a', 'e', 'i', 'o', 'u'));
        int count = 0;
        for(int i = 0;  i < k; i++){
            if(list.contains(s.charAt(i))) count++;
        }
        int max = count;
        for(int l = 0, r = k; r < s.length(); l++, r++){
            if(list.contains(s.charAt(l))) count--;
            if(list.contains(s.charAt(r))) count++;
            max = Math.max(count,max);
        }
        return max;
    }
}