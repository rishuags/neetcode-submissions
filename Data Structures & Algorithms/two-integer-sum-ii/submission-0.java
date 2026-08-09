class Solution {
    public int[] twoSum(int[] numbers, int target) {

        // use two pointers

        //Input: numbers = [1, 3, 4, 5, 7, 10, 11], target = 9
        //Output: [3, 4]

        // if num[left] + num[right] = target keep its index + 1 in those positions? then left++, right--
        // if num[left] >= target, return empty array (nope negative numbers)
        // if num[right] >= target, right-- (nope negative numbers)
        // if num[left]+num[right] > target -> right--; 
        // if num[left]+num[right] < target -> left++;

        int left =0;
        int right=numbers.length-1;
        while (left<right){
            int sum = numbers[left] + numbers[right];
            if (sum == target){
                return new int[]{left+1, right+1};
            }
            else if (sum > target){
                right--;
            }
            else {left++;}
        }


        return new int[]{};
    }
}


