public class Vehicle implements Vehicles{
    
    //Atributs
    String color;
    String marca;
    String model;
    int velocitat;

    //Constructor
    public Vehicle (String color, String marca, String model){
        this.color = color;
        this.marca = marca;
        this.model = model;
        this.velocitat = 0;
    }

    //GETTERS
    public String getColor() {
        return color;
    }

    public String getMarca() {
        return marca;
    }

    public String getModel() {
        return model;
    }

    public int getVelocitat() {
        return velocitat;
    }

    
    //SETTERS
    public void setColor(String color) {
        this.color = color;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public void setVelocitat(int velocitat) {
        this.velocitat = velocitat;
    }    

    //Mèetod General

    public void arrancar() {
        this.velocitat += 10;
    }

    public void parar() {
        this.velocitat = 0;
    }

    public String claxon() {
        return "Mooooc";
    }

    //Mètodes propis
    public String toString(){
        return "Soc un vehicle de color " + this.color + " de la marca " + this.marca + " i del model " + this.model + ". Circulant a " + this.velocitat + " km/h.";
    }
}
