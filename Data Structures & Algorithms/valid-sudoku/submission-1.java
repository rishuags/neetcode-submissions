class Solution {
    public boolean isValidSudoku(char[][] board) {

        // check horizontally while adding to set
        // check vertically while adding to set 

        // check cubically 


        for(int i=0; i<9; i++){

            Set<Character> set = new HashSet<>();

            for (int j = 0; j < 9; j++) {
                if (board[i][j] == '.') {
                    continue;
                }
                    
                if (set.contains(board[i][j])){
                    return false;   
                }
                 
                set.add(board[i][j]);
            }
        }

        for(int i=0; i<9; i++){

            Set<Character> set = new HashSet<>();

            for (int j = 0; j < 9; j++) {
                if (board[j][i] == '.') {
                    continue;
                }
                    
                if (set.contains(board[j][i])){
                    return false;   
                }
                 
                set.add(board[j][i]);
            }
        }


        for (int cube = 0; cube < 9; cube++) {
            Set<Character> set = new HashSet<>();

            for(int i=0; i<3; i++){

                for (int j = 0; j < 3; j++) {

                    int r = (cube/3)*3+i;

                    int c = (cube%3)*3+j;
                    if (board[r][c] == '.') {
                        continue;
                    }
                    
                    if (set.contains(board[r][c])){
                        return false;   
                    }
                 
                    set.add(board[r][c]);
                }
            }

        }

         




        return true;
    }
}
