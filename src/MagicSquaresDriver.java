import javax.swing.*;

public class MagicSquaresDriver {
    public static void main(String[] args) {

        String out = "";
        int rows = Integer.parseInt(JOptionPane.showInputDialog("Enter number of rows in matrix"));
        int columns = Integer.parseInt(JOptionPane.showInputDialog("Enter number of columns in matrix"));

        MagicSquares MS = new MagicSquares(rows, columns);

        boolean isSquare = MS.isSquareMatrix();

//        if(isSquare)
//        {
//            JOptionPane.showMessageDialog(null, "The matrix is square");
//        }
//
//        else
//        {
//            JOptionPane.showMessageDialog(null, "The matrix is not square");
//        }

        for(int i = 0; i < rows; i++)
        {
            for(int j = 0; j < columns; j++)
            {
                int value = Integer.parseInt(JOptionPane.showInputDialog("Enter value for grid[" + i + "][" + j + "]"));
                MS.set(i,j,value);
                out += value + "\t";
            }
            out += "\n";
        }

        System.out.println(out);

        boolean containsAllNumbers = MS.containsAllNumbers();

//        if(containsAllNumbers)
//        {
//            JOptionPane.showMessageDialog(null, "Matrix contains all number from 1 to N Squared");
//        }
//
//        else
//        {
//            JOptionPane.showMessageDialog(null, "Matrix does not contain all number from 1 to N Squared");
//        }

        boolean sumsEqual = MS.sumsEqual();

//        if(sumsEqual)
//        {
//            JOptionPane.showMessageDialog(null, "Matrix contains numbers where all rows, columns and diagonals add up to the magic constant");
//        }
//
//        else
//        {
//            JOptionPane.showMessageDialog(null, "Matrix does not contain numbers where all rows, columns and diagonals add up to the magic constant");
//        }

        if(isSquare && containsAllNumbers && sumsEqual)
        {
            JOptionPane.showMessageDialog(null, "This is a magic square");
        }

        else
        {
            JOptionPane.showMessageDialog(null, "This is not a magic square");
        }

    }
}
