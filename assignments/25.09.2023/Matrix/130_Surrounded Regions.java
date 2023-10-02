class Solution {
    public void solve(char[][] board) {
        if (board.length == 0 || board[0].length == 0) return;
        if (board.length < 3 || board[0].length < 3) return;
        int r = board.length;
        int c = board[0].length;
        for(int i=0;i<=r-1;i++)
        {
        if (board[i][0] == 'O')
			capture(board, i, 0);
		if (board[i][c-1] == 'O')
			capture(board, i, c-1);
        }
        for (int j = 0; j <= c-2; j++) 
        {
		if (board[0][j] == 'O')
			capture(board, 0, j);
		if (board[r-1][j] == 'O')
			capture(board, r-1, j);
	    }
        for (int i = 0; i < r; i++) 
        {
		    for (int j = 0; j < c; j++) 
            {
			    if (board[i][j] == 'O')
				    board[i][j] = 'X';
			    else if (board[i][j] == 'T')
				    board[i][j] = 'O';
		    }
        }
    }
    public void capture(char[][] board, int rows, int cols)
    {
        if (rows < 0 || cols < 0 || rows > board.length - 1 || 
        cols > board[0].length - 1 || board[rows][cols] != 'O') return;
        board[rows][cols] = 'T';
        capture(board, rows + 1, cols);
        capture(board, rows - 1, cols);
        capture(board, rows, cols + 1);
        capture(board, rows, cols - 1);
    }
}