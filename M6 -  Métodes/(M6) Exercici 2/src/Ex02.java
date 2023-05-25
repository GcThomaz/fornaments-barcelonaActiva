public class Ex02 {
    public static void main(String[] args) throws Exception {
        /*Aquest programa calcula l'edat mitjana d'un número de persones. Aquest número s'haurà de preguntar a l'usuari/ària.

S'ha de crear una funció que s'encarregui de demanar les edats a l'usuari/ària i de calcular l'edat mitjana.

La funció rebrà per paràmetre el núm. de persones a qui ha de demanar l'edat.
L'edat de les persones només serà vàlida si està compresa entre 0 i 120 anys.
La mitjana de les edats introduïdes s'ha de retornar per la funció (return). */
    

        int quantity = Methods02.askHowManyAges(0);

        double average = Methods02.askUserAges(quantity);

        System.out.printf("The average of the %d ages is: %.2f.", quantity, average);

    }
}
