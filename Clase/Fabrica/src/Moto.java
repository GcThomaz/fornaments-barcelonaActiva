public class Moto extends Vehicle implements Electric {

    // Atributs
    int maletes;

    // Constructor
    public Moto(String color, String marca, String model, int maletes) {
        super(color, marca, model);
        this.maletes = maletes;
    }

    //GETTER
    public int getMaletes() {
        return maletes;
    }

    //SETTER
    public void setMaletes(int maletes) {
        this.maletes = maletes;
    }   

   // Mètodes Generals
    public void arrancar() {
        this.velocitat += 6;
    }

    public void parar() {
        this.velocitat = 0;
    }

    public String claxon() {
        return "BI BI";
    }

    public String carregant() {
        return "Estic carregant la moto";
    }

    // Mètodes propis
    public String toString() {
        return "Soc una moto de color " + super.getColor() + " de la marca " + super.getMarca() + " i del model " + super.getModel()
                + ". Circulant a " + super.getVelocitat() + " km/h. Tinc " + this.maletes + " maletes.";
    }
}
