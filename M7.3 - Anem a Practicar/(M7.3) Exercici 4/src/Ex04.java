import java.util.Scanner;

public class Ex04 {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o número de DNI (sem a letra): ");
        int numeroDNI = scanner.nextInt();

        System.out.print("Digite a letra de DNI: ");
        char letraDNI = scanner.next().toUpperCase().charAt(0);

        char letraCalculada = calcularLetraDNI(numeroDNI);

        if (letraDNI == letraCalculada) {
            System.out.println("A letra de DNI está correta.");
        } else {
            System.out.println("A letra de DNI está incorreta. A letra correta é: " + letraCalculada);
        }
    }

    public static char calcularLetraDNI(int numeroDNI) {
        String letrasDNI = "TRWAGMYFPDXBNJZSQVHLCKE";
        int indiceLetra = numeroDNI % 23;
        return letrasDNI.charAt(indiceLetra);
    }
}
