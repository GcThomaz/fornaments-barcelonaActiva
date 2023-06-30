public class Carro {

    // Atributos
    private double potencia;
    private double velocidadeMaxima;
    private String cor;
    private double precoMercado;

    // Construtor
    public Carro(double potencia, double velocidadeMaxima, String cor, double precoMercado) {
        this.potencia = potencia;
        this.velocidadeMaxima = velocidadeMaxima;
        this.cor = cor;
        this.precoMercado = precoMercado;
    }

    //GETTERS & SETTERS
    public double getPotencia() {
        return potencia;
    }

    public void setPotencia(double potencia) {
        this.potencia = potencia;
    }

    public double getVelocidadeMaxima() {
        return velocidadeMaxima;
    }

    public void setVelocidadeMaxima(double velocidadeMaxima) {
        this.velocidadeMaxima = velocidadeMaxima;
    }

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public double getPrecoMercado() {
        return precoMercado;
    }

    public void setPrecoMercado(double precoMercado) {
        this.precoMercado = precoMercado;
    }    
}
