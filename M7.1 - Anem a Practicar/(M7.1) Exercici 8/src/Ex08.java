import java.util.Scanner;

public class Ex08 {
    public static void main(String[] args) throws Exception {
        /*Crea un programa on l’usuari/ària introdueixi una temperatura en °C i es mostri per pantalla la conversió en ºFahrenheit

K = 32;

Fórmula
(0 °C × 9 / 5) + K = 32 °F
 */

        Scanner in = new Scanner(System.in);
        System.out.println("Type a temperature: ");
        float temperature = in.nextFloat();
        in.close();

        conversion(temperature);

        
    }

    static void conversion(float temperature) {
        final byte k = 32;
        float result;

        result = (temperature * 9 / 5) + k;

        System.out.println("The temperature in Farenheit is: " + result + ".");
    }
}
