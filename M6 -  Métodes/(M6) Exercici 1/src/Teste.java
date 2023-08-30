import java.util.Scanner;

public class Teste {

    public static void main(String[] args) {
        char operador;
        int numA, numB;
        Scanner in = new Scanner(System.in);

        System.out.println("Digite um operador: (+, -, *, /)");
        operador = in.next().charAt(0);
        System.out.println("Digite o primeiro número: ");
        numA = in.nextInt();
        System.out.println("Digite o segundo número: ");
        numB = in.nextInt();
        in.close();

        switch (operador) {
            case '+':
                System.out.println("A soma é: " + Operacoes.adicao (numA,numB));
                break;
            case '-':
                System.out.println("A subtração é: " + Operacoes.subtracao(numA,numB));
                break;
            case '*':
                System.out.println("A multiplicação é: " + Operacoes.multiplicacao(numA, numB));
                break;
            case '/':
                System.out.println("A divisão é: " + Operacoes.divisao(numA, numB));
                break;
            default:
                System.out.println("Operador inválido.");
                break;
        }
    }
}
