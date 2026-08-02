class Solution {
    public int longestConsecutive(int[] nums) {

        //initial thoughts, sorting, O(nlog n) XXXX


        //put everything into a map
        //start at index 0, does map contain arr[0] + 1, if yes, maxCount++
        //while map contains arr[0]+1 ++ maxCount++
        //


        // or just do with sets to avoid duplicates

        HashSet<Integer> set = new HashSet<>();

        //put into set
        for(int i=0; i<nums.length; i++){
            set.add(nums[i]);
        } 
   
        //     int a=1;
        //     int maxCount=1;
        //     int fmc=0;
        //     for(int i=0; i<nums.length; i++){
        //         while(map.containsKey(nums[i]+a)){
        //             a++;
        //             maxCount++;
        //         }
        //         if(maxCount>fmc){
        //             fmc=maxCount;
        //         }
        //         maxCount=1;
        //         a=1;    
        //     }
        //    return fmc; 

        int maxSeqLen=0;

        for(int i: set){
            if(!set.contains(i-1)){
                int currSeqLen=1;
                while(set.contains(i+currSeqLen)){
                    currSeqLen++;
                }
                maxSeqLen = Math.max(currSeqLen, maxSeqLen);
            }
        }



       return maxSeqLen;
    }



}
