class Solution {
    public int totalFruit(int[] fruits) {

        Map<Integer, Integer> map = new HashMap<>();

        int left = 0;
        int right = 0;
        int max = 0;
        int dist = 0;

        while (right < fruits.length) {
            if (!map.containsKey(fruits[right])) {
                dist++;
            }
            map.put(fruits[right],
                    map.getOrDefault(fruits[right], 0) + 1);
            while (dist > 2) {
                int fruit = fruits[left];
                map.put(fruit, map.get(fruit) - 1);
                if (map.get(fruit) == 0) {
                    map.remove(fruit);
                    dist--;
                }
                left++;
            }
            max = Math.max(max, right - left + 1);
            right++;
        }
        return max;
    }
}