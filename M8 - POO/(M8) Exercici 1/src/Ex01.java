public class Ex01 {
    public static void main(String[] args) throws Exception {
        
        Computer ex01 = new Computer();
        ex01.setBrand("Alienware");
        ex01.setModel("G2U6");
        ex01.setProcessor("I9 ");
        ex01.setRam(64);
        ex01.setHardDisk(500);

        Computer ex02 = new Computer();
        ex02.setBrand("Dell");
        ex02.setModel("Series");

        System.out.println(Computer.descriptionComputer(ex01));
        System.out.println(Computer.returnProgram("Ejercicio1", ex01));
        System.out.println(Computer.descriptionComputer(ex02));
        System.out.println(Computer.returnProgram("Ejercicio1", ex02));

    }
}
