public class Ex01 {
    public static void main(String[] args) throws Exception {

        Computer computer01 = new Computer("Alienware", "51MR2-A30B", "I9", 64, 500);

        Computer computer02 = new Computer("Acer", "Nitro 5");

        System.out.println(computer01.descriptionComputer());
        System.out.println(computer01.returnProgram("(M8 - POO) Ejercicio 1"));

        System.out.println(computer02.descriptionComputer());
        System.out.println(computer02.returnProgram("(M8 - POO) Ejercicio 1"));
    }
}