import javax.swing.*;

public class TimeTableMain {
    public static void main(String args[])
    {
        TimeTable timetable = new TimeTable();
        timetable.set(0, 0, new ClassDetails("3D", "R300"));
        timetable.set(0, 3, new ClassDetails("Routing", "R200"));
        timetable.set(0, 4, new ClassDetails("Testing", "T300"));
        timetable.set(1, 2, new ClassDetails("Algorithms", "R206"));
        timetable.set(1, 5, new ClassDetails("Software", "R302"));
        timetable.set(1, 8, new ClassDetails("Gaming", "R204"));
        timetable.set(2, 1, new ClassDetails("3D", "R300"));
        timetable.set(2, 4, new ClassDetails("Software", "R302"));
        timetable.set(2, 7, new ClassDetails("Algorithms", "T304"));
        timetable.set(3, 2, new ClassDetails("Routing", "T304"));
        timetable.set(3, 5, new ClassDetails("Testing", "R304"));
        timetable.set(3, 8, new ClassDetails("3D", "R304"));
        timetable.set(4, 0, new ClassDetails("Gaming", "T300"));
        timetable.set(4, 3, new ClassDetails("Software", "R204"));
        timetable.set(4, 6, new ClassDetails("3D", "T206"));

        timetable.display();

        String searchDay = JOptionPane.showInputDialog("Enter Day (Monday - Friday)");
        String searchHour = JOptionPane.showInputDialog("Enter Hour (9:00 - 17:00)");

        int i, j;

        if(searchDay.equals("Monday"))
        {
            i = 0;
        }

        else if(searchDay.equals("Tuesday"))
        {
            i = 1;
        }

        else if(searchDay.equals("Wednesday"))
        {
            i = 2;
        }

        else if(searchDay.equals("Thursday"))
        {
            i = 3;
        }

        else if (searchDay.equals("Friday"))
        {
            i = 4;
        }

        else
        {
            i = -1;
        }

        if(searchHour.equals("9:00"))
        {
            j = 0;
        }

        else if(searchHour.equals("10:00"))
        {
            j = 1;
        }

        else if(searchHour.equals("11:00"))
        {
            j = 2;
        }

        else if(searchHour.equals("12:00"))
        {
            j = 3;
        }

        else if(searchHour.equals("13:00"))
        {
            j = 4;
        }

        else if(searchHour.equals("14:00"))
        {
            j = 5;
        }

        else if(searchHour.equals("15:00"))
        {
            j = 6;
        }

        else if(searchHour.equals("16:00"))
        {
            j = 7;
        }

        else if(searchHour.equals("17:00"))
        {
            j = 8;
        }

        else
        {
            j = -1;
        }

        if(i == -1 || j == -1)
        {
            System.out.println("Not a valid day or time");
        }

        else if(timetable.get(i,j) != null)
        {
            ClassDetails searchClass = new ClassDetails(timetable.get(i,j).getName(), timetable.get(i,j).getRoomNumber());
            System.out.println(searchClass.toString());
        }

        String searchClass = JOptionPane.showInputDialog("Enter A Class");
        int numSearchClasses = timetable.getNumberOfClassesFor(searchClass);

        System.out.println("Number of " + searchClass + " classes: " + numSearchClasses);

        System.out.println("Number of free slots: " + timetable.getNumberOfFreeSlots());

    }

}
