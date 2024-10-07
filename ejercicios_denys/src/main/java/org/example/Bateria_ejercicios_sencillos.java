package org.example;

import java.util.Scanner;

public class Bateria_ejercicios_sencillos {
    public void ejercicio1(){
        System.out.println("Hola, Bienvenido, Introduce un número: "); //EL SISTEMA MUESTRA QUE INTRODUZCAMOS NÚMERO
        Scanner myScanner = new Scanner(System.in); //DEFINICIÓN VARIABLE SCANNER
        int numero = myScanner.nextInt(); //RECOGIDA DE DATO INTRODUCIDO POR EL USUARIO COMO UN NÚMERO ENTERO EN LA VARIABLE numero

        if (numero < 0){
            System.out.println("El número es menor que 0");
        }else if (numero > 0) {
            System.out.println("El número es mayor que 0");
        }else{
            System.out.println("El número es 0");
        }
    }

    public void ejercicio2(){
        Scanner entrada = new Scanner(System.in); //CREACIÓN Y DEFINICIÓN SCANNER CON NOMBRE entrada
        System.out.println("Hola, bienvenido, introduce 2 números distintos y te diré cuál es el mayor"); //CONSOLA MUESTRA BIENVENIDA
        System.out.println("Introduce el primer número: "); //CONSOLA MUESTRA INTRODUCIR PRIMER NÚMERO
        int numero1 = entrada.nextInt(); //GUARDAMOS VALOR INTRODUCIDO POR TECLADO EN VARIABLE numero1
        System.out.println("Introduce el segundo número: "); //CONSOLA MUESTRA INTRODUCIR SEGUNDO NÚMERO
        int numero2 = entrada.nextInt(); //GUARDAMOS VALOR INTRODUCIDO POR TECLADO EN VARIABLE numero2

        if (numero1 < numero2){
            System.out.println("El número " + numero2 + " es mayor que " + numero1);
        } else if (numero1 > numero2) {
            System.out.println("El número " + numero1 + " es mayor que " + numero2);
        } else {
            System.out.println("ERROR, los números introducidos son iguales");
        }
    }

    public void ejercicio3(){
        Scanner entrada = new Scanner(System.in);
        System.out.println("Hola,bienvenido, introduce 2 números y los dividiré por tí: ");
        System.out.println("Introduce el dividendo: ");
        double dividendo = entrada.nextInt();
        System.out.println("Introduce el divisor: ");
        double divisor = entrada.nextInt();

        if (divisor != 0){
            double resultado = dividendo/divisor;
            System.out.println("El resultado es " + resultado);
        }else{
            System.out.println("ERROR, no se puede dividir por 0");
        }
    }

    public void ejercicio4(){
        
    }
}
