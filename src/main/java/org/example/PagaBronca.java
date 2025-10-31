package org.example;

import java.util.Scanner;

public class PagaBronca {

    static void main() {

        Scanner teclado = new Scanner(System.in);
        final int PUNTUACION = 50;
        int multiplicador = 0;
        int contador = 1;
        int total = 0;
        String bronca = "";
        char bronca2 = 's';

        do {
            System.out.println("*** BIENVENIDO A LA APP DE BRONCAS ***");
            System.out.println("-------------------------------------------");
            System.out.println("Datos de la bronca " + contador + ":");
            System.out.println("Selecciona la persona encargada de la bronca:");
            System.out.println("     [-]. Profes");
            System.out.println("     [-]. Padre");
            System.out.println("     [-]. Madre");
            System.out.println("     [-]. Monitor (extraescolares)");
            System.out.println("     [-]. Suegra");
            System.out.println("     Otros");
            System.out.println("-------------------------------------------");
            System.out.println("Elige una opción --> ");
            String opcion = teclado.next();

            switch (opcion) {
                case "profes":
                    multiplicador = PUNTUACION * 10;
                    break;
                case "padre":
                    multiplicador = PUNTUACION * 100;
                    break;
                case "madre":
                    multiplicador = PUNTUACION * 100;
                    break;
                case "monitor":
                    multiplicador = PUNTUACION * 5;
                    break;
                case "suegra":
                    multiplicador = PUNTUACION * 1000;
                    break;
                default:
                    multiplicador = PUNTUACION;
                    break;
            }

            total += multiplicador;
            System.out.println("Puntuación de la bronca " + contador + ": " + total);
            System.out.println("¿Quieres añadir otra bronca? (S/N): ");
            bronca = teclado.next().toLowerCase();
            bronca2 = bronca.charAt(0);
            System.out.println("-------------------------------------------");
            contador++;
        } while (bronca2 == 's');
            if (total >= 10000 && total <= 100000) {
                System.out.println("ESTA SEMANA MEDIA PAGA");
            } else if (total > 100000) {
                System.out.println("ESTA SEMANA SIN PAGA");
            }else {
                System.out.println("ESTA SEMANA TE LIBRAS.");
            }


        }

    }
