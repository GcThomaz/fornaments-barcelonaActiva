public class Camion extends Vehicle {
    // Atributs
    String color;
    String marca;
    String model;
    int carrega;

    // Constructor
    public Camion(String color, String marca, String model, int carrega) {
        super(color, marca, model);
        this.carrega = carrega;
    }

    //GETTER
    public int getCarrega() {
        return carrega;
    }

    //SETTER
    public void setCarrega(int carrega) {
        this.carrega = carrega;
    }

    // Mètodes Generals
    public void arrancar() {
        this.velocitat += 10;
    }

    public void parar() {
        this.velocitat = 0;
    }

    public String claxon() {
        return "Pown Pown";
    }

    // Mètodes propis
    public String toString() {
        return "Soc un camio de color " + super.getColor() + " de la marca " + super.getMarca() + " i del model " + super.getModel()
                + ". Circulant a " + super.getVelocitat() + " km/h. Tinc una carrega de " + this.getCarrega() + " kg.";
    }
}
