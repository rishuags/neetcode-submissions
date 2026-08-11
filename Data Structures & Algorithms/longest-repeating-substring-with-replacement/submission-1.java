class Solution {
    public int characterReplacement(String s, int k) {

        // assign target character "alph"

        // how long can window be, using k replace

        // use set to add s to set O(1) lookup


        int maxLen=0;

        HashSet<Character> set = new HashSet<>();

        for(char ch: s.toCharArray()){
            set.add(ch);
        }

        for(char ch: set){
            int count = 0; 
            int lp=0;

            for(int rp=0; rp<s.length(); rp++){
                if(s.charAt(rp)==ch){
                    count++;
                }

                while ((rp-lp+1)-count>k){
                    if(s.charAt(lp)==ch){
                        count--;
                    }
                    lp++;
                }
                maxLen= Math.max(maxLen, rp-lp+1);

            }
        }


        return maxLen;
        
    }
}
