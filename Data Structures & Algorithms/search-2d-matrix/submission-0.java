class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {

        // essentially it is sorted
        // you could just store it in an array through simple traversal and then binary search that

        // but if you don't wanna use additional storage space

        // just traverse through matrix i guess 

        // middle row, middle column, start at center

        // if target > center, discard rows before 
        // target < center, discard rows after

        // search space manipulation in a matrixx

        // if target > row[]

        // do binary search twice


        int r = matrix.length;
        int c = matrix[0].length;

        int first = 0;
        int last = r-1;

        while(first<=last){
            int row = (first + last)/2;
            if(target>matrix[row][c-1]){
                first=row+1;
            } else if(target<matrix[row][0]){
                last=row-1;
            } else {
                break;
            }


        }


        if (!(first <= last)) {
            return false;
        }


        int row = (first+last)/2;

        int left=0;
        int right = c-1;

        while (left <= right) {
            int m = (left + right) / 2;

            if (target > matrix[row][m]) {

                left = m + 1;
            } 
            else if (target < matrix[row][m]) {

                right = m - 1;
            } 
            else {
                return true;
            }
        }

        return false;









        
    }
}
