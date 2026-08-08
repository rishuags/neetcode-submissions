class Solution {
    public int maxArea(int[] heights) {

        // find max height (min of two pillars) * width 
        // option 1: brute force check every combo (horrible O(n^2))
        // option 2: sort + store height / index in map  and then check

        // option 3: use two pointers at opposite ends for max width & shift smaller one 

        int left =0;
        int right = heights.length-1;
        int answer=0;
        int area;

        while (left<right){
            area=Math.min(heights[left], heights[right]) * (right-left);
            answer = Math.max(answer, area);
            if(heights[right] >= heights[left]){
                left++;
            }else{
                right--;
            }


        }



        
        return answer;


        
    }
}
