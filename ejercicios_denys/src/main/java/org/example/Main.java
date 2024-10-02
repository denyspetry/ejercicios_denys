package org.example;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner entradaEscaner = new Scanner(System.in);
        System.out.println("¿Cómo te llamas?: ");
        String nombre = entradaEscaner.next();

        System.out.println("¿A qué curso vas: ");
        String curso = entradaEscaner.next();

        System.out.println("Hola " + nombre + ", bienvenido a " + curso + ".");

        System.out.println("Introduce un número: ");
        int num1 = entradaEscaner.nextInt();

        System.out.println("Introduce un número distinto: ");
        int num2 = entradaEscaner.nextInt();

        int resultado = num1 + num2;

        System.out.println("El resultado de sumar los dos números es: " + resultado);

    }
}