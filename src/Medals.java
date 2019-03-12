public class Medals {

    private final int COUNTRIES = 7;
    private final int MEDALS = 3;

    private String[] countries =
            {
                    "Canada",
                    "China",
                    "Germany",
                    "Korea",
                    "Japan",
                    "Russia",
                    "United States"
            };

    private String[] medalTypes =
            {
                    "Gold",
                    "Silver",
                    "Bronze"
            };

    private int[][] counts;

    public Medals() {
        counts = new int[COUNTRIES][MEDALS];
    }

    public void set(int country, int medal, int count) {
        // store count at the specified position in the grid
        counts[country][medal] = count;
    }

    public void display() {
        //display the grid

        // Print headings
        System.out.printf("%15s", "");
        for (int i = 0; i < medalTypes.length; i++){
            System.out.printf("%8s", medalTypes[i]);
        }
        System.out.println();

        // Print countries, counts, and row totals
        for (int i = 0; i < COUNTRIES; i++)
        {
            // Process the ith row
            System.out.printf("%15s", countries[i]);

            int total = 0;

            // Print each row element and update the row total
            for (int j = 0; j < MEDALS; j++)
            {
                System.out.printf("%8d", counts[i][j]);
                total = total + counts[i][j];
            }

            // Display the row total and print a new line
            System.out.printf("%8d\n", total);
        }
    }

    public int total() {
        //compute total medals for all countries and all medal types
        int totalMedals = 0;
        for (int i = 0; i < COUNTRIES; i++) {
            for (int j = 0; j < MEDALS; j++) {
                totalMedals += counts[i][j];
            }
        }

        return totalMedals;
    }

    public int[] calculateRowTotals() {
        //compute row totals i.e. total number of medals for each country
        int []countryTotals = new int[COUNTRIES];
        for (int i = 0; i < COUNTRIES; i++)
        {
            // Total the ith row
            countryTotals[i] = 0;

            for (int j = 0; j < MEDALS; j++)
            {
                countryTotals[i] += counts[i][j];
            }
        }
        return countryTotals;
    }

    public int[] calculateColumnTotals() {
        //compute column totals i.e. total number of medals for each medal type

        int[] medalTotals = new int[MEDALS];
        for (int i = 0; i < MEDALS; i++)
        {
            medalTotals[i] = 0;

            for(int j = 0; j < COUNTRIES; j++)
            {
                medalTotals[i] += counts[j][i];
            }
        }

        return medalTotals;
    }
}
