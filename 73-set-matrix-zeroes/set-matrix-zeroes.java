class Solution 
{
    public void setZeroes(int[][] matrix) 
    {
        int r=matrix.length;
        int c=matrix[0].length;
        Stack<Integer> setRow=new Stack<>();
        Stack<Integer> setCol=new Stack<>();

        for(int i=0;i<r;i++)
        {
            for(int j=0;j<c;j++)
            {
                if(matrix[i][j]==0)
                {
                    setRow.push(i); // for storing rows
                    setCol.push(j); // for storing columns
                }
            }
        }
        // changing rows
        while(!setRow.isEmpty())
        {
            int rowNum=setRow.pop();
            for(int i=0;i<c;i++)
            {
                matrix[rowNum][i]=0;
            }
        }
        // changing colms
        while(!setCol.isEmpty())
        {
            int colNum=setCol.pop();
            for(int i=0;i<r;i++)
            {
                matrix[i][colNum]=0;
            }
        }
        
    }
}