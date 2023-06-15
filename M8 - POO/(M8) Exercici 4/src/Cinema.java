public class Cinema extends Buildings {
    
    private int capacity;

    public Cinema(String buildingName, int buildingFloors, double buildingArea, int capacity) {
        super(buildingName, buildingFloors, buildingArea);
        this.capacity = capacity;
    }

     public void projectSession(int participants, double ticketPrice) {
        int actualParticipants;
        double revenue;

        actualParticipants = Math.min(participants, capacity);
        revenue = actualParticipants * ticketPrice;
        System.out.println(revenue + " euros were collected.");
    }

    public double calculateSecurityCost() {
        int securityNeeded;
        double cost;
        
        securityNeeded = (int) Math.ceil(getBuildingArea() / 3000.0);
        cost = securityNeeded * 1300;
        return cost;
    }
}
