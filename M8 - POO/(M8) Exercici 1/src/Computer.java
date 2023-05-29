public class Computer {

    public String brand;
    public String model;
    public String processor;
    public Integer ram;
    public Integer hardDisk;

    // Getter
    public String getBrand() {
        return brand;
    }

    // Setter
    public void setBrand(String c) {
        this.brand = c;
    }

    // Getter
    public String getModel() {
        return model;
    }

    // Setter
    public void setModel(String c) {
        this.model = c;
    }

    // Getter
    public String getProcessor() {
        return processor;
    }

    // Setter
    public void setProcessor(String c) {
        this.processor = c;
    }

    // Getter
    public String getRam() {
        return ram.toString();
    }

    // Setter
    public void setRam(Integer c) {
        this.ram = c;
    }

    // Getter
    public String getHardDisk() {
        return hardDisk.toString();
    }

    // Setter
    public void setHardDisk(Integer c) {
        this.hardDisk = c;
    }

    public static String returnProgram(String x, Computer y) {
        return "Atualmente em execução: " + x + " in the computer " + y.brand + ".";
    }

    public static String descriptionComputer(Computer x) {
        if (x.brand != null && x.model != null && x.processor != null && x.ram != 0 && x.hardDisk != 0) {
           return "\nThe brand of the computer is: " + x.brand + ". \nThe processor is: " + x.processor + ". \nThe model is: " + x.model + ". \nThe memory RAM is: " + x.ram + ". \nThe hard disk is: " + x.hardDisk + "."; 
        } else {
            return "\nThe brand of the computer is: " + x.brand + ". \nThe model is: " + x.model + ".";
        }
        
    }


}
