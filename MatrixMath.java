
/**
 * Write a description of class MatrixMath here.
 *
 * @author ( Mr. Kim)
 * @version ((October 28. 1029)
 */
public class MatrixMath
{
    // instance variables - replace the example below with your own
    private int[][] data;

    /**
     * Constructor for objects of class MatrixMath
     */
    public MatrixMath(int[][] data)
    {
        // initialise instance variables
       this.data=data;
       int[][]matA = {{3,6,8},{5,-1,2},{7,8,9}};
       int[][] matB = {{2,3,5},{1,-1,4},{2,1,4}};
    }

    /**
     * Find the sum of all the elements in each row.
     * 
     *
     * @return    int[]
     */
    public int[] rowSum()
    {
       return null;
    }
    
        /**
     * Find the average of all the values in each row
     *
     * @return    int[] 
     */
    public double[] rowAve()
    {
     return null; 
    }
    
        /**
     * Find the sum of all the numbers in column
     * 
     *
     * @return    int[] 
     */
    public int[] colSum()
    {
        int[] sumRow = new int[data.length];
        
        for(int i = 0; i < data.length; i ++)
        {
            int sum = 0;
            for(int j = 0; j < data[i].length; j ++)
            {
                sum+=data[i][j];
            }
            sumRow[i]=sum;
        }
        return sumRow;
    }
    
     /**
     * Find the average of all the values in each row
     *
     * @return    int[] 
     */
    public double[] colAve()
    {
        double[] aveRow = new double[data.length];
        int[] sums = rowSum();
        for(int i = 0; i<data.length;i++)
        {
            aveRow[i]=(sums[i]*1.0)/data[i].length;
        }
        return aveRow;
    }
    
}
