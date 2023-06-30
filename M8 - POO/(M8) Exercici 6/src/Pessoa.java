public class Pessoa {

    // Atributos
    protected String nome;
    protected String sobrenome;
    protected int idade;
    protected int tempoEquipe;
    protected double salarioBase = 50000.0;

    // Construtor
    public Pessoa(String nome, String sobrenome, int idade, int tempoEquipe) {
        this.nome = nome;
        this.sobrenome = sobrenome;
        this.idade = idade;
        this.tempoEquipe = tempoEquipe;
    }

    public double calcularSalario() {
        return salarioBase + (tempoEquipe * 10000);
    }
}
