public class Mecanico extends Pessoa {

    // Atributo
    private boolean possuiDiplomaAvancado;

    // Construtor
    public Mecanico(String nome, String sobrenome, int idade, int tempoEquipe, boolean possuiDiplomaAvancado) {
        super(nome, sobrenome, idade, tempoEquipe);
        this.possuiDiplomaAvancado = possuiDiplomaAvancado;
    }
}
