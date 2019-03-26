import java.util.Random;

public class TerrainAnalysis {

    private final int N = 5;

    private int[][] grid;

    public TerrainAnalysis()
    {
        grid = new int[N][N];
    }

    public void set(int row, int column, int elevation)
    {
        grid[row][column] = elevation;
    }

    public int getN()
    {
        return N;
    }

    public int getPeaks()
    {
        int peaks = 0;

        for(int i = 1; i < getN()-1; i++)
        {
            for(int j = 1; j < getN()-1; j++)
            {
                if(grid[i][j] > grid[i-1][j] &&
                    grid[i][j] > grid[i+1][j] &&
                    grid[i][j] > grid[i][j-1] &&
                    grid[i][j] > grid[i][j+1])
                {
                    peaks++;
                }
            }
        }

        return peaks;
    }

    public static void main(String[] args)
    {
        Random rand = new Random();

        TerrainAnalysis TA = new TerrainAnalysis();
        for(int i = 0; i < TA.getN(); i++)
        {
            for(int j = 0; j < TA.getN(); j++)
            {
                int e = rand.nextInt(101);
                TA.set(i,j,e);
                System.out.print(e + "\t");
            }
            System.out.println();
        }

        System.out.println("Peaks: " + TA.getPeaks());
    }

}
