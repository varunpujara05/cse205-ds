class Solution {
    public List<Integer> spiralOrder(int[][] matrix) {
        List<Integer> lst = new ArrayList<>();

        int n = matrix.length;
        int m = matrix[0].length;

        int s_row = 0;
        int e_row = n - 1;
        int s_col = 0;
        int e_col = m - 1;

        while (s_row <= e_row && s_col <= e_col) {
            for (int j = s_col; j <= e_col; j++) {
                lst.add(matrix[s_row][j]);
            }

            for (int i = s_row + 1; i <= e_row; i++) {
                lst.add(matrix[i][e_col]);
            }

            if (s_row < e_row) {
                for (int j = e_col - 1; j >= s_col; j--) {
                    lst.add(matrix[e_row][j]);
                }
            }

            if (s_col < e_col) {
                for (int i = e_row - 1; i >= s_row + 1; i--) {
                    lst.add(matrix[i][s_col]);
                }
            }

            s_col++;
            s_row++;
            e_col--;
            e_row--;
        }

        return lst;
    }
}