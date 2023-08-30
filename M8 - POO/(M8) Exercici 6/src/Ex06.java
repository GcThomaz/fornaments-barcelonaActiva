public class Ex06 {
    public static void main(String[] args) throws Exception {
        
        // Criação dos carros
        Carro carro1 = new Carro(500.0, 300.0, "Vermelho", 100000.0);
        Carro carro2 = new Carro(450.0, 280.0, "Azul", 90000.0);

        // Criação das equipes
        Equipe equipe1 = new Equipe("Equipe 1", 1000000.0, "Brasil");
        equipe1.adicionarCarro(carro1);

        Equipe equipe2 = new Equipe("Equipe 2", 800000.0, "Espanha");
        equipe2.adicionarCarro(carro2);

        // Criação das pessoas
        Piloto piloto1 = new Piloto("João", "Silva", 30, 5, 1.8, 70.0);
        Mecanico mecanico1 = new Mecanico("Pedro", "Santos", 35, 3, true);

        Piloto piloto2 = new Piloto("Carlos", "Fernandes", 28, 2, 1.75, 68.0);
        Mecanico mecanico2 = new Mecanico("Rafael", "Oliveira", 32, 4, false);

        equipe1.adicionarPessoa(piloto1);
        equipe1.adicionarPessoa(mecanico1);

        equipe2.adicionarPessoa(piloto2);
        equipe2.adicionarPessoa(mecanico2);

        // Listar carros e pessoas das equipes
        equipe1.listarCarros();
        equipe1.listarPessoas();

        equipe2.listarCarros();
        equipe2.listarPessoas();
    }
}
