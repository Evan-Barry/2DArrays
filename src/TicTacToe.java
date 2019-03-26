public class TicTacToe
{

   private String[][] board;
   private static final int ROWS = 3;
   private static final int COLUMNS = 3; 

   /**
      Constructs an empty board.
   */
   public TicTacToe()
   {
      board = new String[ROWS][COLUMNS];
      // Fill with spaces
      for (int i = 0; i < ROWS; i++)
         for (int j = 0; j < COLUMNS; j++)
            board[i][j] = " ";
   }

   /**
      Sets a field in the board. The field must be unoccupied.
      @param i the row index 
      @param j the column index 
      @param player the player ("x" or "o")
   */
   public void set(int i, int j, String player)
   {
      if (board[i][j].equals(" "))
         board[i][j] = player;
   }

   /**
      Creates a string representation of the board, such as
      |x  o|
      |  x |
      |   o|
      @return the string representation
   */
   public String toString()
   {
      String r = "";
      for (int i = 0; i < ROWS; i++)
      {
         r = r + "|";
         for (int j = 0; j < COLUMNS; j++)         
            r = r + board[i][j];
         r = r + "|\n";
      }
      return r;
   }

   public String getWinner()
   {
       String row = "";
       String col = "";
       String diag = "";

       for(int i = 0; i < board.length; i++)//check row
       {
           row += board[0][i];
           col += board[i][0];
           diag += board[i][i];
       }

       if(row.equals("ooo") || col.equals("ooo"))
       {
           return "o";
       }

       else if(row.equals("xxx") || col.equals("xxx"))
       {
           return "x";
       }

       else if(diag.equals("ooo"))
       {
           return "o";
       }

       else if(diag.equals("xxx"))
       {
           return "x";
       }

       else
       {
           for(int i = 0; i < board.length; i++)//check row
           {
               diag += board[i][board.length-i-1];
           }

           if(diag.equals("ooo"))
           {
               return "o";
           }

           else if(diag.equals("xxx"))
           {
               return "x";
           }

           else
           {
               return " ";
           }
       }
   }
}

