import java.util.Scanner;

public class Ex08 {
    public static void main(String[] args) throws Exception {
        
        int number = askInt("Type a number: ");
        fibonacci(number);
    }

    public static void fibonacci(int n) {
        int anterior = 0;
        int atual = 1;
        
        System.out.print("Sequência de Fibonacci até o " + n + ": ");
        
        for (int i = 1; i <= n; i++) {
            System.out.print(anterior + " ");
            
            int proximo = anterior + atual;
            anterior = atual;
            atual = proximo;
        }
        
        System.out.println();
    }

        static int askInt(String message) {
        Scanner in = new Scanner(System.in);
        System.out.println(message);
        // in.close();
        return in.nextInt();
    }       
    
    }
