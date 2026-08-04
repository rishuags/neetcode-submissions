class Solution {
    public int[] productExceptSelf(int[] nums) {
        // multiply all elements of the array
        // then divide by index and return

        // if zero don't divide by zero
        int realProduct=1;
        int zeroCount=0;
        

        for (int i: nums){
            if (i!=0){
                realProduct=realProduct*i;
            } else{
                zeroCount++;
            }
        }

        int [] answer = new int [nums.length];
        for(int i=0; i < nums.length; i++){
            if(nums[i]==0 && zeroCount == 1){
                answer[i] = realProduct;
            } else if(zeroCount >= 1){
                if (nums[i] == 0 && zeroCount > 1) answer[i] = 0;
                else answer[i] = 0;
            } else { 
                answer[i] = realProduct/nums[i];
            }
        }

        return answer;
    }
}