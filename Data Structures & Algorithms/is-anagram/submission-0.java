class Solution {
    public boolean isAnagram(String s, String t) {
        // valid anagram if their key matches matches

        int[] count = new int[26];

        if (s.length() != t.length()) {
            return false;
        }

        for(char c: s.toCharArray()){
            count[c-'a']++;
        }

        int[] count2 = new int[26];

        for(char c: t.toCharArray()){
            count2[c-'a']++;
        }

        return Arrays.toString(count).equals(Arrays.toString(count2));
    }
}
