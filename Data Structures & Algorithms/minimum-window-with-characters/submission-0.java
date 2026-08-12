class Solution {
    public String minWindow(String s, String t) {

        // need to check smallest window of s that has all of t

        // use sliding window
        // frequency map for t's character counts
        // map for window of s char frequency

        //  t = empty, return ""
        // 

        
        if ( t.isEmpty() ){
            return "";
        } 

        HashMap<Character, Integer> charFreq = new HashMap<>();
        HashMap<Character, Integer> windowFreq = new HashMap<>();

        for(char ch: t.toCharArray()){
            charFreq.put(ch, charFreq.getOrDefault(ch,0)+1);
        }
        int count =0;
        int total = charFreq.size();

        int [] answer = {-1, -1};

        int length = Integer.MAX_VALUE;

        int lp = 0;

        for(int rp=0; rp<s.length(); rp++){
            char ch= s.charAt(rp);

            windowFreq.put(ch, windowFreq.getOrDefault(ch,0)+1);

            if(charFreq.containsKey(ch) && windowFreq.get(ch).equals(charFreq.get(ch))){

               count++; 
            }

            while(count == total){
                if((rp-lp+1) <length){

                    length = rp-lp+1;
                    answer[0]=lp;
                    answer[1]=rp;
                }

                char left = s.charAt(lp);
                windowFreq.put(left, windowFreq.get(left)-1);
                if(charFreq.containsKey(left) && windowFreq.get(left) < (charFreq.get(left))){
                   count--; 
                }
                lp++;
            }

        }

        if (length == Integer.MAX_VALUE) {

            return "";
        }

        return s.substring( answer[0] , answer[1] + 1 );
    }
}
