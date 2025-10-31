package org.example;

import java.util.Random;

public class SumaDescendente {

    static void main() {
        Random aleatorio = new Random();

        int num_entero = aleatorio.nextInt(1000001)+500;
        String num1 = Integer.toString(num_entero);
        int tamanyo = num1.length();

        String num2 = num1.substring(tamanyo-2);
        int num_entero2 = Integer.parseInt(num2);

        String num3 = num1.substring(tamanyo-3);
        int num_entero3 = Integer.parseInt(num3);

        String num4 = num1.substring(tamanyo-4);
        int num_entero4 = Integer.parseInt(num4);


        System.out.println("Suma descendente del número generado: " + num_entero);

        if (tamanyo >= 5) {
            String num5 = num1.substring(tamanyo-5);
            int num_entero5 = Integer.parseInt(num5);
            int resultado = num_entero + num_entero5 + num_entero4 + num_entero3 + num_entero2;
            System.out.println(num_entero + " + " + num_entero5 + " + " + num_entero4 + " + " + num_entero3 + " + " + num_entero2 + " = " + resultado);
        } else {
            int resultado = num_entero + num_entero4 + num_entero3 + num_entero2;
            System.out.println(num_entero + " + " + num_entero4 + " + " + num_entero3 + " + " + num_entero2 + " + " + " = " + resultado);
        }




    }
}
