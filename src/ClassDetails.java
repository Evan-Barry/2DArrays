public class ClassDetails {

    private String name;  //e.g. Algorithms
    private String roomNumber;   //e.g. R203

    public ClassDetails()
    {
        setName("Unknown");
        setRoomNumber("Unknown");
    }

    public ClassDetails(String name, String roomNumber)
    {
        setName(name);
        setRoomNumber(roomNumber);
    }

    public void setName(String name)
    {
        this.name = name;
    }

    public void setRoomNumber(String roomNumber)
    {
        this.roomNumber = roomNumber;
    }

    public String getName()
    {
        return name;
    }

    public String getRoomNumber()
    {
        return roomNumber;
    }

    public String toString()
    {
        return getName() + " " + getRoomNumber();
    }
}
