class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {

        //  represent every string by char freq
        // 


        HashMap<String, List<String>> map = new HashMap<>();

        for(String s: strs){
            int[] count = new int[26];

            for(char c: s.toCharArray()){
                count[c-'a']++; // ascii >  26 | a=97, z=97+26
            }
            String key = Arrays.toString(count);
            map.putIfAbsent(key, new ArrayList<>());
            map.get(key).add(s);

        }
        return new ArrayList<>(map.values());

    }
}
