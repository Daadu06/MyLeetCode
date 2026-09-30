class TimeMap {
    HashMap <String, ArrayList<pair>> map;
    class pair{
        int timestamp;
        String value;
        pair(String value, int timestamp){
            this.timestamp = timestamp;
            this.value = value;
        }
    }

    public TimeMap() {
        map = new HashMap<>();
    }
    
    public void set(String key, String value, int timestamp) {
        ArrayList<pair> list;
        if(!map.containsKey(key)){
            list = new ArrayList<>();
            map.put(key,list);
        }
        list = map.get(key);
        list.add(new pair(value, timestamp));
    }
    
    public String get(String key, int timestamp) {
        ArrayList<pair> list = map.get(key);
        if(!map.containsKey(key)){
            return "";
        }
        int start = 0, end = list.size()-1, mid = 0;
        String ans = "";
        while(start <= end){
            mid = start + ( end - start ) / 2;
            if(list.get(mid).timestamp<=timestamp){
                ans = list.get(mid).value;
                start = mid + 1;
            }
            else{
                end = mid - 1;
            }
        }
        return ans;
    }
}

/**
 * Your TimeMap object will be instantiated and called as such:
 * TimeMap obj = new TimeMap();
 * obj.set(key,value,timestamp);
 * String param_2 = obj.get(key,timestamp);
 */