public class Hospital extends Buildings {
    
        private int patients;

        public Hospital(String buildingName, int buildingFloors, double buildingArea, int patients) {
            super(buildingName, buildingFloors, buildingArea);
            this.patients = patients;
        }
        
        public void distributeMeals() {
        int mealCount;

        mealCount = patients * 3;
        System.out.println(mealCount + " meals are being distributed.");
    }

    public double calculateSecurityCost() {
        int securityNeeded;
        double cost;
        
        securityNeeded = (int) Math.ceil(getBuildingArea() / 1000.0);
        cost = securityNeeded * 1300;
        return cost;
    }
}
