public class Buildings {
    
//ATRIBUTTES

    protected String buildingName;
    protected int buildingFloors;
    protected double buildingArea; //(m²)    

    public Buildings(String buildingName, int buildingFloors, double buildingArea) {
        this.buildingName = buildingName;
        this.buildingFloors = buildingFloors;
        this.buildingArea = buildingArea;
    }

    public String getBuildingName() {
        return buildingName;
    }

    public void setBuildingName(String buildingName) {
        this.buildingName = buildingName;
    }

    public int getBuildingFloors() {
        return buildingFloors;
    }

    public void setBuildingFloors(int buildingFloors) {
        this.buildingFloors = buildingFloors;
    }

    public double getBuildingArea() {
        return buildingArea;
    }

    public void setBuildingArea(double buildingArea) {
        this.buildingArea = buildingArea;
    }

    public void buildingClean() {
        final int area = 5;
        double floorsTime;

        if (buildingFloors > 1) {
            floorsTime = buildingFloors * 30;
            floorsTime = floorsTime / 60;
        }
    }
}
