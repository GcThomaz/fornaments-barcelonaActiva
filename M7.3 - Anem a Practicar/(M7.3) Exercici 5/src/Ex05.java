import java.util.Scanner;

public class Ex05 {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite uma frase: ");
        String frase = scanner.nextLine();

        verificarTipoFrase(frase);
    }

    public static void verificarTipoFrase(String frase) {
        boolean possuiMinusculas = false;
        boolean possuiMaiusculas = false;

        for (int i = 0; i < frase.length(); i++) {
            char caractere = frase.charAt(i);

            if (Character.isLowerCase(caractere)) {
                possuiMinusculas = true;
            } else if (Character.isUpperCase(caractere)) {
                possuiMaiusculas = true;
            }
        }

        if (possuiMinusculas && possuiMaiusculas) {
            System.out.println("A frase contém letras minúsculas e maiúsculas.");
        } else if (possuiMinusculas) {
            System.out.println("A frase contém apenas letras minúsculas.");
        } else if (possuiMaiusculas) {
            System.out.println("A frase contém apenas letras maiúsculas.");
        }
    }
}
