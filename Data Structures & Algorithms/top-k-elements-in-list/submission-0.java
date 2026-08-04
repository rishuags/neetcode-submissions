class Solution {
    public int[] topKFrequent(int[] nums, int k) {

        // frequency count map
        
        // HashMap<Integer, Integer> map

        // key = integer, value = freq


        // if map doesn't already contain it
        // map.put(integer, 1)

        // if map contains it 
        // map.put(integer, map.getValue(integer)+1) 
        // (not put, more edit, freq)

        // turn hashmap into hashset, and get K highest keys

        HashMap<Integer, Integer> map = new HashMap<>();
        for(int i: nums){
            if(!map.containsKey(i)){
                map.put(i, 1);
            } else {
                map.put(i, map.get(i)+1);
            }
        }

        HashSet<Integer> set = new HashSet<>(map.keySet());

        


        
    }
}
