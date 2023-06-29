public class Cotxe extends Vehicle implements Electric {

    // Atributs
    String color;
    String marca;
    String model;
    boolean ac;

    // Constructor
    public Cotxe(String color, String marca, String model, boolean ac) {
        super(color, marca, model);
        this.ac = ac;
    }

    // GETTER
    public boolean isAc() {
        return ac;
    }

    // SETTER
    public void setAc(boolean ac) {
        this.ac = ac;
    }

    // Mètodes Generals
    public void arrancar() {
        this.velocitat += 15;
    }

    public void parar() {
        this.velocitat = 0;
    }

    public String claxon() {
        return "Mic Mic";
    }

    public String carregant() {
        return "Estic carregant el vehicle";
    }

    // Mètodes propis
    public String toString() {
        return "Soc un vehicle de color " + super.getColor() + " de la marca " + super.getMarca() + " i del model " + super.getModel()
                + ". Circulant a " + super.getVelocitat() + " km/h. Amb aire acondicionat " + this.ac;
    }
}
