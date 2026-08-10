class Solution {
    public int lengthOfLongestSubstring(String s) {

        HashSet <Character> set = new HashSet<>();
        int leftPointer=0;
        int maxLen=0;

        for(int rightPointer=0; rightPointer<s.length(); rightPointer++){
            
            while(set.contains(s.charAt(rightPointer))){

                set.remove(s.charAt(leftPointer));
                leftPointer++;
            }
            set.add(s.charAt(rightPointer));
            
            maxLen=Math.max(maxLen, rightPointer-leftPointer+1);
        }
        return maxLen;
    }

}
