class Solution {
    public int[][] transpose(int[][] matrix) {
        int rl=matrix.length;
        int cl=matrix[0].length;
        int[][] ans = new int[cl][rl];
        for(int i=0;i<cl;i++)
            for(int j=0;j<rl;j++)
            {
                ans[i][j]=matrix[j][i];
            }
        return ans;
    }
}