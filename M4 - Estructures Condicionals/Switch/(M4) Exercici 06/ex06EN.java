import java.util.Scanner;

public class ex06EN {
    public static void main(String[] args) {

        /*Fer un programa que demani a l’usuari/ària quin dia i quin mes va néixer, amb
         * aquesta informació el programa mostra per pantalla, de quin signe del zodíac
         * és.
         * 
         * Àries-Aries (21.03 — 19.04)
         * Taure-Tauro (20.04 — 20.05)
         * Bessons-Géminis (21.05 — 20.06)
         * Cranc-Cáncer (21.06 — 22.07)
         * Lleó-Leo (23.07 — 22.08)
         * Verge-Virgo (23.08 — 22.09)
         * Balança-Libra (23.09 — 22.10)
         * Escorpí-Escorpión (23.10 — 21.11)
         * Sagitari-Sagitario (22.11 — 21.12)
         * Capricorn-Capricornio (22.12 — 19.01)
         * Aquari-Acuario (20.01 — 18.02)
         * Peixos-Piscis (19.02 — 20.03)*/

        byte day, month;

        Scanner in = new Scanner(System.in);

        System.out.println("Type your month of birth: ");
        month = in.nextByte();
        System.out.println("Type you day of birth: ");
        day = in.nextByte();
        in.close();
        switch (month) {
            case 1:
                if (day > 19 && day <= 31) {
                    System.out.println("Aquari");
                } else {
                    System.out.println("Capricorn");
                }
                break;
            case 2:
                if (day > 18 && day <= 28) {
                    System.out.println("Peixos");
                } else {
                    System.out.println("Acuari");
                }
                break;
            case 3:
                if (day > 20 && day <= 31) {
                    System.out.println("Aries");
                } else {
                    System.out.println("Peixos");
                }
                break;
            case 4:
                if (day > 19 && day <= 30) {
                    System.out.println("Taure");
                } else {
                    System.out.println("aries");
                }
                break;
            case 5:
                if (day > 20 && day <= 31) {
                    System.out.println("Bessons");
                } else {
                    System.out.println("Taure");
                }
                break;
            case 6:
                if (day > 20 && day <= 30) {
                    System.out.println("Cranc");
                } else {
                    System.out.println("Bessons");
                }
                break;
            case 7:
                if (day > 22 && day <= 31) {
                    System.out.println("Lleo");
                } else {
                    System.out.println("Cranc");
                }
                break;
            case 8:
                if (day > 22 && day <= 30) {
                    System.out.println("Verge");
                } else {
                    System.out.println("Lleo");
                }
                break;
                case 9:
                if (day > 22 && day <= 31) {
                    System.out.println("Balança");
                }else {
                    System.out.println("Verge");
                }
                break;
            case 10:
                if (day > 22 && day <= 31) {
                    System.out.println("Escorpi");
                } else {
                    System.out.println("Balança");
                }
                break;
                case 11:
                if (day > 21 && day <= 31) {
                    System.out.println("Sagitari");
                } else {
                    System.out.println("Escorpi");
                }
                break;
                case 12:
                if (day > 21 && day <= 31) {
                    System.out.println("Capricorn");
                } else {
                    System.out.println("Sagitari");
                }
                break;
        }
    }
}
