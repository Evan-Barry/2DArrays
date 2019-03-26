public class MagicSquares {

    private int[][] grid;

    public MagicSquares(int R, int C)
    {
        grid = new int[R][C];
    }

    public void set(int r, int c, int v)
    {
        grid[r][c] = v;
    }

    public boolean isSquareMatrix()
    {
        //System.out.println("grid.length = " + grid.length);
        if(grid[0].length == grid.length)
        {
            return true;
        }

        else
        {
            return false;
        }
    }

    public boolean containsAllNumbers()
    {
        boolean[] values = new boolean[grid.length * grid.length];
        //System.out.println("values length - " + values.length);
        int nSquared = grid.length * grid.length;

        for(int i = 0; i < grid.length; i++)
        {
            for(int j = 0; j < grid.length; j++)
            {
                if(grid[i][j] > 0 && grid[i][j] <= nSquared)
                {
                    int val = grid[i][j];
                    values[val-1] = true;
                }
                else
                {
                    return false;//return false as number in matrix was less than 1 or greater than N squared
                }
            }
        }

        for(int i = 0; i < values.length; i++)
        {
            if(values[i])
            {
                //do nothing
            }

            else
            {
                return false;//return false as a number from 1 to N squared is not present
            }
        }

        return true;
    }

    public boolean sumsEqual()
    {
        int rowSum = 0;
        int colSum = 0;
        int diagSum = 0;
        //magic constant = n(nSquared+1)/2
        int constant = grid.length*((grid.length*grid.length) +1)/2;

        for(int i = 0; i < grid.length; i++)
        {
            rowSum = 0;
            colSum = 0;

            for(int j = 0; j < grid.length; j++)
            {
                rowSum += grid[i][j];
                colSum += grid[j][i];
            }

            if (rowSum == constant)
            {
                //do nothing
            }

            else
            {
                return false;
            }

            if(colSum == constant)
            {
                //do nothing
            }

            else
            {
                return false;
            }
        }

        //top left to bottom right diagonal
        for(int i = 0; i < grid.length; i++)
        {
            diagSum += grid[i][i];
        }

        if(diagSum == constant)
        {
            diagSum = 0;

            for(int j = 0; j < grid.length; j++)
            {
                diagSum += grid[j][grid.length-j-1];
            }

            if(diagSum == constant)
            {
                //do nothing
            }

            else
            {
                return false;
            }
        }

        else
        {
            return false;
        }

        return true;
    }

}
