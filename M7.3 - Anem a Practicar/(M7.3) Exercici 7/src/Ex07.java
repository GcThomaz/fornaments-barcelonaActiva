import java.util.Scanner;

public class Ex07 {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        int opcao;
        boolean sair = false;

        while (!sair) {
            System.out.println("\n----- Menu -----");
            System.out.println("1. Calcular material taula");
            System.out.println("2. Imprimir forecast");
            System.out.println("3. Calcular cost per reserva");
            System.out.println("4. Sortir del programa");
            System.out.print("Selecciona una opció: ");
            opcao = scanner.nextInt();

            switch (opcao) {
                case 1:
                    System.out.print("Té experiència? (S/N): ");
                    String respostaExperiencia = scanner.next().toUpperCase();
                    boolean experiencia = respostaExperiencia.equals("S");
                    calcularMaterialTaula(experiencia);
                    break;
                case 2:
                    System.out.print("Introduïu l'alçada de les onades en metres: ");
                    double alturaOndas = scanner.nextDouble();
                    imprimirForecast(alturaOndas);
                    break;
                case 3:
                    System.out.print("Introduïu els minuts de reserva: ");
                    int minutos = scanner.nextInt();
                    System.out.print("Introduïu el tipus de taula (iniciació / intermig): ");
                    String tipoTaula = scanner.next();
                    double cost = calcularCostReserva(minutos, tipoTaula);
                    System.out.println("Cost de la reserva: " + cost + "€");
                    break;
                case 4:
                    sair = true;
                    break;
                default:
                    System.out.println("Opció invàlida. Si us plau, seleccioneu una opció vàlida.");
                    break;
            }
        }

        System.out.println("Fins a la pròxima!");
    }

    public static void calcularMaterialTaula(boolean experiencia) {
        if (experiencia) {
            System.out.println("Taula de fibra");
        } else {
            System.out.println("Taula d'espuma");
        }
    }

    public static void imprimirForecast(double alturaOndas) {
        if (alturaOndas > 2) {
            System.out.println("Onades grans");
        } else {
            System.out.println("Onades petites");
        }
    }

    public static double calcularCostReserva(int minutos, String tipoTaula) {
        double costPerHora;
        if (tipoTaula.equalsIgnoreCase("iniciació")) {
            costPerHora = 20;
        } else if (tipoTaula.equalsIgnoreCase("intermig")) {
            costPerHora = 35;
        } else {
            System.out.println("Tipo de taula inválido");
            return 0;
        }

        double horas = minutos / 60.0;
        return costPerHora * horas;
    }
}
