public class Fabrica {
    public static void main(String[] args) throws Exception {
        
        Vehicle[] tren = new Vehicle[3];
        tren[0] = new Cotxe("Black", "Mercedes", "G63S", true);
        tren[1] = new Moto("Groc", "Yamaha", "R1", 2);
        tren[2] = new Camion("Gris", "Scannia", "Wild", 12000);
        
        for (Vehicle vehicle : tren) {
            System.out.println(vehicle.toString());
        }
    }
}
