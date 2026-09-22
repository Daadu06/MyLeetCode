class Solution {
    public String frequencySort(String s) {
        Map<Character, Integer> map = new HashMap<>();
        for(int i = 0 ;  i < s.length(); i++){
            char c = s.charAt(i);
            map.put(c, map.getOrDefault(c,0)+1);
        }
        List<Map.Entry<Character,Integer>> list = new ArrayList<>(map.entrySet());
        list.sort((x,y) -> y.getValue() - x.getValue());
        StringBuilder ans = new StringBuilder();
        for(int i = 0; i < list.size(); i++){
            Map.Entry<Character, Integer> entry = list.get(i);
            char c = entry.getKey();
            int freq = entry.getValue();
            while(freq > 0){
                ans.append(c);
                freq--;
            }
        }
        return ans.toString();
    }
}