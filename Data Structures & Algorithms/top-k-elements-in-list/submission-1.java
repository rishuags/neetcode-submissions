class Solution {
    public int[] topKFrequent(int[] nums, int k) {

        // frequency count map
        
        // HashMap<Integer, Integer> map

        // key = integer, value = freq


        // if map doesn't already contain it
        // map.put(integer, 1)

        // if map contains it 
        // map.put(integer, map.get(integer)+1) 
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

        List<Integer>[] list = new List[nums.length + 1];

        for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
            int number = entry.getKey();
            int freq = entry.getValue();

            if (list[freq] == null) {
                list[freq] = new ArrayList<>();
            }

            list[freq].add(number);
        }

        int[] ans = new int[k];
        int index = 0;

        for (int freq = list.length - 1; freq >= 1; freq--) {
            if (list[freq] == null) {
                continue;
            }

            for (int number : list[freq]) {
                ans[index] = number;
                index++;

                if (index == k) {
                    return ans;
                }
            }
        }

         return ans;
        
    }
}
