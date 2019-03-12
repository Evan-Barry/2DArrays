public class TimeTable {
    private final int DAYS = 5;
    private final int HOURS = 9 ;  // 9 hours per day

    private String[] days =
            {
                    "Monday",
                    "Tuesday",
                    "Wednesday",
                    "Thursday",
                    "Friday"
            };

    private String[] hours =
            {
                    "9:00",
                    "10:00",
                    "11:00",
                    "12:00",
                    "13:00",
                    "14:00",
                    "15:00",
                    "16:00",
                    "17:00"
            };

    private ClassDetails[][] grid;

    public TimeTable(){
        grid = new ClassDetails[DAYS][HOURS];
        // the grid will have null values
    }

    public void set(int day, int hour, ClassDetails details) {
        // store details at the specified position in the grid

        grid[day][hour] = details;

    }

    public void display() {
        // display the grid

        //print the headings
        System.out.printf("%20s", "");
        for (int i = 0; i < hours.length; i++){
            System.out.printf("%20s", hours[i]);
        }
        System.out.println();

        for(int i = 0; i < DAYS; i++)
        {
            // Process the ith row
            System.out.printf("%20s", days[i]);

            int total = 0;

            for(int j = 0; j < HOURS; j++)
            {
                if(grid[i][j] != null)
                {
                    System.out.printf("%20s", grid[i][j].toString());
                    total++;
                }

                else
                {
                    System.out.printf("%20s", "-");
                }
            }

            System.out.printf("%8d\n", total);
        }
    }

    public ClassDetails get(int day, int hour)
    {
        // returns the object at the specified position in the grid

        ClassDetails newClass = new ClassDetails();

        if(grid[day][hour] == null)
        {
            System.out.println("No Class in this hour");
        }

        else
        {
            newClass.setName(grid[day][hour].getName());
            newClass.setRoomNumber(grid[day][hour].getRoomNumber());

            return newClass;
        }


        return null;
    }

    public int getNumberOfClassesFor(String name)
    {
        //e.g. get number of Algorithms classes
        int classCount = 0;

        for(int i = 0; i < DAYS; i++)
        {
            for(int j = 0; j < HOURS; j++)
            {
                if(grid[i][j] != null)
                {
                    if(grid[i][j].getName().equals(name))
                    {
                        classCount++;
                    }
                }

            }
        }

        return classCount;
    }

    public int getNumberOfFreeSlots()
    {
        int freeSlots = 0;

        for(int i = 0; i < DAYS; i++)
        {
            for(int j = 0; j < HOURS; j++)
            {
                if(grid[i][j] == null)
                {
                    freeSlots++;
                }
            }
        }

        return freeSlots;
    }
}
