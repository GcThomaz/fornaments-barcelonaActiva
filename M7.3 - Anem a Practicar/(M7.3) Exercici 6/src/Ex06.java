import java.util.ArrayList;
import java.util.HashSet;
import java.util.Scanner;

public class Ex06 {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        ArrayList<String> nomes = new ArrayList<>();

        // Solicitar nomes ao usuário
        System.out.println("Digite os nomes (digite 'fim' para encerrar):");
        String nome;
        while (true) {
            nome = scanner.nextLine();
            if (nome.equalsIgnoreCase("fim")) {
                break;
            }
            nomes.add(nome);
        }
        HashSet<String> nomesUnicos = new HashSet<>(nomes);
        int nomesRemovidos = nomes.size() - nomesUnicos.size();
        System.out.println("Nomes únicos:");
        for (String nomeUnico : nomesUnicos) {
            System.out.println(nomeUnico);
        }
        System.out.println("Nomes removidos: " + nomesRemovidos);
    }
}
