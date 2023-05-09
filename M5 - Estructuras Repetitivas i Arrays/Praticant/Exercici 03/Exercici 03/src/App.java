import java.util.ArrayList;

public class App {
    public static void main(String[] args) throws Exception {
        /*Crie um método que receba um ArrayList de números inteiros e retorne a soma de todos os elementos da lista. */

        //Criando a ArrayList

        ArrayList<Integer>numero = new ArrayList<Integer>();

        //Adicionando itens a ArrayList

        numero.add(1);
        numero.add(2);
        numero.add(3);
        numero.add(4);

        //Retornando a soma dos itens

        int soma = 0;

        for (Integer numeros : numero) {
            soma += numeros;
        }
        System.out.println(soma);
    }
}
