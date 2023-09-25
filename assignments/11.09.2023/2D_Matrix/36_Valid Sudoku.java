class Solution {
    public boolean isValidSudoku(char[][] board) {
      HashSet h = new HashSet();
      for(int i=0;i<9;i++)
            for(int j=0;j<9;j++)
            {
                if(board[i][j]!='.')
                {
                    if(!h.add("row "+i+board[i][j]) || 
                        !h.add("column "+j+board[i][j]) || 
                        !h.add("sub-box "+(i /3)*3+j/3+board[i][j])){
                            return false;
                        }
                }
            }
        return true;
    }
}