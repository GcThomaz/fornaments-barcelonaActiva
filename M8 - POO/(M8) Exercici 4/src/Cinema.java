public class Cinema extends Buildings {

    private int capacity;

    public Cinema(String buildingName, int buildingFloors, double buildingArea, int capacity) {
        super(buildingName, buildingFloors, buildingArea);
        this.capacity = capacity;
    }

    public int getCapacity() {
        return capacity;
    }

    public void setCapacity(int capacity) {
        this.capacity = capacity;
    }

    public void projectSession() {
        int participants = 0;
        double ticketPrice = 0;
        double revenue;

        participants = Math.min(participants, capacity);
        if (participants <= capacity) {
            revenue = participants * ticketPrice;   
            System.out.println(revenue + " euros were collected.");
        } else {
            System.out.println("The number of people cannot be greater than the capacity.");
        }
    }

    public double calculateSecurityCost() {
        int securityNeeded;
        double cost;

        securityNeeded = (int) Math.ceil(getBuildingArea() / 3000.0);
        cost = securityNeeded * 1300;
        return cost;
    }
}