public class Hotel extends Buildings{

    private int rooms;

        public Hotel(String buildingName, int buildingFloors, double buildingArea, int rooms) {
        super(buildingName, buildingFloors, buildingArea);
        this.rooms = rooms;
    }   

        public int getRooms() {
            return rooms;
        }

        public void setRooms(int rooms) {
            this.rooms = rooms;
        }

        public void calculateRoomService() {
        int staffNeeded;
        double totalSalary;

        staffNeeded = (int) Math.ceil(rooms / 20.0);
        totalSalary = staffNeeded * 1000;
        System.out.println("Number of staff needed for room service: " + staffNeeded);
        System.out.println("Total salary required for room service: " + totalSalary + " euros per month.");
    }

    public double calculateSecurityCost() {
        int securityNeeded;
        double cost;
        securityNeeded = (int) Math.ceil(super.getBuildingArea() / 1000.0);
        cost = securityNeeded * 1300;
        cost += 500 * securityNeeded; // Additional cost for hotel security
        return cost;
    }
}