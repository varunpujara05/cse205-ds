class Solution {
    public int orangesRotting(int[][] grid) {
        if(grid == null || grid.length == 0) return -1;
        
        for(int i=0; i<grid.length; i++) 
        {
            for(int j=0; j<grid[0].length; j++) 
            {
                if(grid[i][j] == 2) adj(grid, i, j, 2);
            }
        }
        
        int mins = 2;
        for(int[] row : grid) {
            for(int i : row) {
                if(i == 1) return -1;
                mins = Math.max(mins, i);
            }
        }
        
        return mins - 2;
    }
    
    public void adj(int[][] grid, int i, int j, int mins) {
        if(i < 0 || i >= grid.length || j < 0 || j >= grid[0].length 
          || grid[i][j] == 0 || (1 < grid[i][j] && grid[i][j] < mins)
          ) return;
        else {
            grid[i][j] = mins;
            adj(grid, i - 1, j, mins + 1);
            adj(grid, i + 1, j, mins + 1);
            adj(grid, i, j - 1, mins + 1);
            adj(grid, i, j + 1, mins + 1);
        }
    }
}