class Solution {
    public boolean checkInclusion(String s1, String s2) {


     // window length = s1 length
     // build freq sets or arrays 


        if (s1.length() > s2.length()) {
            return false;
        }

         int[] arr1 = new int[26];

         int[] arr2 = new int[26];
        
         
         for(int i=0; i < s1.length(); i++){
            arr1[s1.charAt(i)-'a']++;

            arr2[s2.charAt(i)-'a']++;
         }

         int matches=0; 


        for(int i=0; i<26; i++){
            if(arr1[i] == arr2[i]){
                matches++;
            }
        }

        int lp=0;
        for(int rp=s1.length(); rp<s2.length(); rp++){
            if(matches==26){
                return true;
            }

            int k = s2.charAt(rp)-'a';
            arr2[k]++;
            if(arr1[k]==arr2[k]){
                matches++;
            } else if(arr1[k] + 1 ==arr2[k]){
                matches--;
            }
            
            k = s2.charAt(lp)-'a';
            if(arr1[k]==arr2[k]){
                matches--;
            } 
            
            arr2[k]--;
            if(arr1[k] == arr2[k]){
                matches++;
            }

            lp++;
        }



        return matches==26;
        
    }
}