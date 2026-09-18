import java.util.Arrays;
class Solution {
    public List<Integer> findAnagrams(String s, String p) {
        if(p.length() > s.length()){
            return new ArrayList<>();
        }
        int first [] = new int[26];
        int sec [] = new int[26];
        int k = p.length();
        List<Integer> res = new ArrayList<>();
        for(int i = 0; i < k; i++){
            char c = p.charAt(i);
            first[c - 'a']++;
        }
        int l = 0, r = k;
        for(int i = l; i < k; i++){
            char c = s.charAt(i);
            sec[c-'a']++;
        }
        if(Arrays.equals(first,sec)){
                res.add(l);
            }
        while(r < s.length()){
            sec[s.charAt(l)-'a']--;
            sec[s.charAt(r)-'a']++;
            if(Arrays.equals(first,sec)){
                res.add(l+1);
            }
            l++;
            r++;
        }
        return res;
    }
}