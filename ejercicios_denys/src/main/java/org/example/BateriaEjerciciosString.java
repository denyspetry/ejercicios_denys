package org.example;

import java.util.Scanner;

public class BateriaEjerciciosString {

    public void ejercicio1() {

        Scanner entrada = new Scanner(System.in);
        System.out.println("INTRODUCE UNA PALABRA O FRASE:");

        String palabra = entrada.nextLine();
        System.out.println("TEXTO ORIGINAL: " + palabra);

        int longitud = palabra.length();
        System.out.println("LA LONGITUD DEL TEXTO ES: " + longitud);

        String sinEspacios = palabra.replace(" ", "");
        System.out.println("EL TEXTO SIN ESPACIOS ES: " + sinEspacios);

        String mitad1 = palabra.substring(0, longitud / 2);
        String mitad2 = palabra.substring(longitud / 2, longitud);
        System.out.println("LA PRIMERA MITAD DEL TEXTO ES: " + mitad1 + " LA SEGUNDA MITAD DEL TEXTO ES: " + mitad2);

        System.out.println("EL TEXTO CONCATENADA ES: " + mitad1.concat(mitad2));

        System.out.println("EL TEXTO EN MAYÚSCULAS ES: " + palabra.toUpperCase());

    }

    public void ejercicio2() {

        Scanner entrada = new Scanner(System.in);
        System.out.println("Introduce 2 cadenas de caracteres distintas y te diré cuál es la mayor: ");

        System.out.println("Introduce la primera cadena: ");
        String cadena1 = entrada.nextLine();
        System.out.println("Introduce la segunda cadena: ");
        String cadena2 = entrada.nextLine();

        int longitud1 = cadena1.length();
        int longitud2 = cadena2.length();

        if (longitud1 > longitud2) {
            System.out.println("La primera cadena es la mayor");
        } else {
            System.out.println("La segunda cadena es la mayor");
        }
    }

    public void ejercicio3() {



    }

    public void ejecicio4() {

        Scanner teclado = new Scanner(System.in);

        System.out.println("Introduce una frase: ");
        String frase = teclado.nextLine();
        frase = " " + frase + " ";
        frase = frase.replaceAll()

    }
}