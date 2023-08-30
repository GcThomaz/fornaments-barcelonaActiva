import java.util.ArrayList;

public class App {
    public static void main(String[] args) throws Exception {
        /*Crie um ArrayList de Strings e adicione alguns nomes de frutas. Em seguida, use um loop for para imprimir cada nome de fruta em uma linha separada.*/

        //Criando a ArrayList

        ArrayList<String> frutas = new ArrayList<>();

        //Adicionando frutas a minha lista

        frutas.add("Morango");
        frutas.add("Banana");
        frutas.add("Melancia");
        frutas.add("Melao");

        //Percorrendo a lista e imprimindo o nome de cada fruta

        for (String fruta: frutas) {
            System.out.println(fruta);
        }
    }
}
