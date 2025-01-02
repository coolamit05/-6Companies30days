class Solution 
{
    int dir[][]={{-1,-1},{-1,0},{-1,1},
                   {0,-1},{0,0},{0,1},  
                   {1,-1},{1,0},{1,1}};

    public int[][] imageSmoother(int[][] img) 
    {
        int rows = img.length;
        int cols = img[0].length;

        // Apply the average function to each pixel in the image matrix
        int[][] result = new int[rows][cols];
        for (int r = 0; r < rows; r++) {
            for (int c = 0; c < cols; c++) {
                result[r][c] = calculateAverage(img, r, c, rows, cols);
            }
        }

        return result;        
    }

    private int calculateAverage(int[][] img, int r, int c, int rows, int cols) 
    {
        int total = 0;
        int count = 0;

        for(int i=0;i<dir.length;i++)
        {
            int newRow=r+dir[i][0];
            int newCol=c+dir[i][1];

            if(newRow>=0 && newRow<rows && newCol>=0 && newCol<cols)
            {
                count++;
                total+=img[newRow][newCol];
            }
        }

        // Calculate and return the average value for the pixel
        return total / count;
    }
}