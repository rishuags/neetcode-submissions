class Solution {
    public int[] twoSum(int[] nums, int target) {
        // store in map
        
        // traverse arr, check if target minus current in map, 
        // get index of that 

        HashMap<Integer, Integer> map = new HashMap<>();

        for(int i = 0; i < nums.length; i++){
            map.put(nums[i], i);
        }
        int otherIndex;
        for(int i = 0; i < nums.length; i++){
            if(map.containsKey(target-nums[i]) && map.get(target-nums[i])!=i ){
                otherIndex=map.get(target-nums[i]);
                return new int[]{i, otherIndex};
            }
        }
        return new int[0];
    }
}
