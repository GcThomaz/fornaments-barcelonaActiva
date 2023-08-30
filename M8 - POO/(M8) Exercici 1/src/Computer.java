public class Computer {

    /******************************************************************************************************************************
     * [Attibutes]
     ***************************************************************************************************************************/
    private String brand;
    private String model;
    private String processor;
    private int ram;
    private int hardDisk;

    /******************************************************************************************************************************
     * [Method Computer 1 (All Attributes)]
     ***************************************************************************************************************************/
    public Computer(String brand, String model, String processor, int ram, int hardDisk) {
        this.brand = brand;
        this.model = model;
        this.processor = processor;
        this.ram = ram;
        this.hardDisk = hardDisk;
    }

    /******************************************************************************************************************************
     * [Method Computer 2 (Attributes: brand and model)]
     ***************************************************************************************************************************/
     public Computer(String brand, String model) {
         this.brand = brand;
         this.model = model;    
         processor = "Intel I9";
         ram = 256;
         hardDisk = 500; 
     }

    /******************************************************************************************************************************
     * [Method Getters: ACCESS the private attribute information]
     ***************************************************************************************************************************/
    public String getBrand() {
        return brand;
    }

    public String getModel() {
        return model;
    }

    public String getProcessor() {
        return processor;
    }

    public int getRam() {
        return ram;
    }

    public int getHardDisk() {
        return hardDisk;
    }

    /******************************************************************************************************************************
     * [Method Setters: MODIFY the private attribute information]
     ***************************************************************************************************************************/
    public String setProcessor() {
        return processor;
    }

    public int setRam() {
        return ram;
    }

    public int setHardDisk() {
        return hardDisk;
    }

    /******************************************************************************************************************************
     * [Method returnProgram: return the message "Currently running: " with the String entered by user]
     ***************************************************************************************************************************/
    public String returnProgram(String x) {
        return "Currently running: " + x + ".";
    }

    /******************************************************************************************************************************
     * [Method descriptionComputer: return the computer's description]
     ***************************************************************************************************************************/
    public String descriptionComputer() {

        if (brand != null && model != null && processor != null && ram != 0 && hardDisk != 0) {
            return "\nThe brand of the computer is: " + brand + ". \nThe processor is: " + processor + ". \nThe model is: " + model + ". \nThe memory RAM is: " + ram + ". \nThe hard disk is: " + hardDisk + "."; 
         } else {
             return "\nThe brand of the computer is: " + brand + ". \nThe model is: " + model + ".";
         }
    }
}
