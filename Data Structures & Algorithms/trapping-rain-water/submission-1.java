class Solution {
    public int trap(int[] height) {

        // finding space 
        // space found: 2-0-3 -> (i[3] - i[2]- 1)*(min (3,2))
        // space found: 3-1-0-1-3 ()
        // middle < left and right 
        // 


        // need wall on left + wall on right to trap water

        // check min of left right right boundary 
        // if gap b/w left & right, take min(maxleft,maxright), add to answer

        // when gng through array, find first pillar, then find next bigger/equal pillar/smaller 

        // min (maxL, maxR) - h[i]


    int left=0;
    int right=height.length-1;
    int maxLeft=height[left];
    int maxRight=height[right];
    int answer=0;
    while(left<right){
        if(maxLeft < maxRight){
            left++;
            
            maxLeft = Math.max(maxLeft, height[left]);

            answer = answer + maxLeft - height[left];
        } else{
            right--;

            maxRight=Math.max(maxRight, height[right]);

            answer = answer + maxRight - height[right];

        }

    }

    return answer;







        
    }
}
