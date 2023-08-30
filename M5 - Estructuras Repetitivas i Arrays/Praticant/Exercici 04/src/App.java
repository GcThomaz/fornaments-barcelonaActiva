import java.util.ArrayList;

public class App {
    public static void main(String[] args) throws Exception {
        
        //Criando uma ArrayList

        ArrayList<Byte> numeros = new ArrayList<Byte>();

        //Adicionando numeros

        numeros.add((byte)10);
        numeros.add((byte)9);
        numeros.add((byte)8);
        numeros.add((byte)7);

        //Mostrando os numeros na tela

        for (Byte numero : numeros) {
            System.out.println(numero);
        }

    }
}
