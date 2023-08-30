public class Hotel {
    /*****************************************************************************************************
     * [Attributes]
     *****************************************************************************************************/
    private String name;
    private int numberOfRooms;
    private int numberOfFloors;
    private double totalHotelArea;

    /*****************************************************************************************************
     * [Constructor hotel]
     *****************************************************************************************************/
    public Hotel(String name, int numberOfRooms, int numberOfFloors, double areaHotel) {
        this.name = name;
        this.numberOfRooms = numberOfRooms;
        this.numberOfFloors = numberOfFloors;
        this.totalHotelArea = areaHotel;
    }

    /*****************************************************************************************************
     * [Méthods Getters and Setters]
     ******************************************************************************************************/
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getNumberOfRooms() {
        return numberOfRooms;
    }

    public void setNumberOfRooms(int numberOfRooms) {
        this.numberOfRooms = numberOfRooms;
    }

    public int getNumberOfFloors() {
        return numberOfFloors;
    }

    public void setNumberOfFloors(int numberOfFloors) {
        this.numberOfFloors = numberOfFloors;
    }

    public double getTotalHotelArea() {
        return totalHotelArea;
    }

    public void setTotalHotelArea(double totalHotelArea) {
        this.totalHotelArea = totalHotelArea;
    }

    /*****************************************************************************************************
     * [Méthods calculateMaintenence]
     ******************************************************************************************************/
    public void calculateMaintenance() {
        int totalEmployess;
        float salary = 1500f;
        float totalSalary;

        totalEmployess = this.getNumberOfRooms() / 20;
        totalSalary = totalEmployess * salary;

        System.out.printf("The hotel needs of %d employees and the total cost it will be of %.2f.\n", totalEmployess,
                totalSalary);
    }
}