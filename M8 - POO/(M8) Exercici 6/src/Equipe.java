import java.util.ArrayList;
import java.util.List;

public class Equipe {

    // Atributos
    private String nome;
    private double orcamento;
    private String paisOrigem;
    private List<Carro> carros = new ArrayList<>();
    private List<Pessoa> pessoas = new ArrayList<>();

    // Construtor
    public Equipe(String nome, double orcamento, String paisOrigem) {
        this.nome = nome;
        this.orcamento = orcamento;
        this.paisOrigem = paisOrigem;
    }

    public void adicionarCarro(Carro carro) {
        carros.add(carro);
    }

    public void adicionarPessoa(Pessoa pessoa) {
        pessoas.add(pessoa);
    }

    public void listarCarros() {
        System.out.println("Carros da equipe " + nome + ":");
        for (Carro carro : carros) {
            System.out.println("Potência: " + carro.getPotencia());
            System.out.println("Velocidade Máxima: " + carro.getVelocidadeMaxima());
            System.out.println("Cor: " + carro.getCor());
            System.out.println("Preço de Mercado: " + carro.getPrecoMercado());
            System.out.println();
        }
    }

    public void listarPessoas() {
        System.out.println("Pessoas da equipe " + nome + ":");
        for (Pessoa pessoa : pessoas) {
            System.out.println("Nome: " + pessoa.nome + " " + pessoa.sobrenome);
            System.out.println("Idade: " + pessoa.idade);
            System.out.println("Tempo na equipe: " + pessoa.tempoEquipe + " anos");
            System.out.println("Salário: " + pessoa.calcularSalario());
            System.out.println();
        }
    }

}
