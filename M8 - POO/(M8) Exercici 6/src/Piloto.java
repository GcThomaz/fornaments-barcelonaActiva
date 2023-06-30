public class Piloto extends Pessoa {

    // Atributos
    private double altura;
    private double peso;
    private double periculosidade = 50000.0;

    // Construtor
    public Piloto(String nome, String sobrenome, int idade, int tempoEquipe, double altura, double peso) {
        super(nome, sobrenome, idade, tempoEquipe);
        this.altura = altura;
        this.peso = peso;
    }

    public double calcularSalario() {
        return super.calcularSalario() + (tempoEquipe * 10000) + periculosidade;
    }
}
