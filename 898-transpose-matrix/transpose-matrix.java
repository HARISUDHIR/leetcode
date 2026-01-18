class Solution {
    public int[][] transpose(int[][] matrix) {
        int rows = matrix.length;
        int columns = matrix[0].length;

        int[][] transpose = new int[columns][rows];

        for(int j = 0; j < rows; j++)
        {
            for(int e = 0; e < columns; e++)
            {
                transpose[e][j] = matrix[j][e];
            }
        }

        return transpose;
    }
}