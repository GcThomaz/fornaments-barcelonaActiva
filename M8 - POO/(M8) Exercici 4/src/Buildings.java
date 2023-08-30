public class Buildings {

    // ATRIBUTTES

    protected String buildingName;
    protected int buildingFloors;
    protected double buildingArea; // (m²)

    public Buildings(String buildingName, int buildingFloors, double buildingArea) {
        this.buildingName = buildingName;
        this.buildingFloors = buildingFloors;
        this.buildingArea = buildingArea;
    }

    public String getBuildingName() {
        return buildingName;
    }

    public int getBuildingFloors() {
        return buildingFloors;
    }

    public double getBuildingArea() {
        return buildingArea;
    }

    public void buildingClean() {
        double minutes, cleaningCost, monthlyCost;

        minutes = buildingArea / 5;
        minutes += (buildingFloors - 1) * 0.5;
        cleaningCost = minutes * 30;
        monthlyCost = cleaningCost * 30;
        System.out.println("\nThe building took " + minutes + " minutes to clean.");
        System.out.println("The cleaning cost per month is " + monthlyCost + " euros.\n");
    }
}
