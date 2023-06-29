import java.util.Arrays;

public class MainTreballador {
    public static void main(String[] args) throws Exception {
        
        Treballador[] treballador = new Treballador[3];
        treballador[0] = new Treballador("Gustavo", 100000, 2024, 12, 3);
        treballador[1] = new Treballador("Francesc", 27000, 2018, 7, 5);
        treballador[2] = new Treballador("Ludmila", 200000, 2025, 7, 7);

        Arrays.sort(treballador);

        for (Treballador treballadors : treballador) {
            System.out.println();
            System.out.println(treballadors);
        }
    }
}
