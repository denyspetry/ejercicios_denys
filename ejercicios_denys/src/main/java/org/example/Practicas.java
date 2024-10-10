package org.example;

import java.util.Scanner;

public class Practicas {

    public void PRÁCTICA_3() {
        //INICIO
        System.out.println("Introduce tu nombre: "); //Mostrar "Introduce tu nombre"
        Scanner entrada = new Scanner(System.in); //Definir Scanner con el nombre entrada
        String nombre = entrada.next(); //Leer el valor de nombre introducido por entrada y guardarlo en una variable de tipo texto [nombre]
        System.out.println("Hola " + nombre + ", introduce tu edad: "); //Mostrar "Hola [nombre], introduce tu edad"

        boolean comprobador = true; //Entrada al bucle mientras
        //INICIO MIENTRAS
        while (comprobador) {
            int edad = entrada.nextInt(); //Leer el valor de edad introducido por entrada y guardarlo en una variable de tipo número entero [edad]
            //INICIO SI
            if (edad >= 18) {
                System.out.println("Enhorabuena " + nombre + ", puedes votar"); //Si [edad] es mayor o igual que 18, mostrar mensaje "Enhorabuena [nombre], puedes votar"
                comprobador = false; //Finaliza el bucle mientras
            } else if (edad < 0) {
                System.out.println("Introduce de nuevo tu edad: "); //Si [edad] es menor que 0, mostrar "Introduce de nuevo tu edad: " CONTINUA EL BUCLE...
            } else {//SI NO
                int años = 18 - edad; //Si la edad no es mayor o igual que 18, guardamos los años que quedan por votar en una variable numérica entera [años]
                System.out.println("Lo siento " + nombre + ", no puedes votar"); //Y mostramos "Lo siento [nombre], no puedes votar"
                System.out.println("Te faltan " + años + " años para votar"); //Y mostramos "Te faltan [años] años para votar"
                comprobador = false; //Finaliza el bucle mientras
            }//FIN SI
        }//FIN MIENTRAS
    }//FIN

    public void PRÁCTICA_4(){

        Scanner entrada = new Scanner(System.in); //Definimos Scanner con el nombre entrada
        System.out.println("Introduce el multiplicando (3 cifras): "); //Mostrar en pantalla "Introduce el multiplicando (3 cifras): "
        int multiplicando = entrada.nextInt(); //Leer el valor introducido y guardarlo en la variable numérica entera [multiplicando]
        System.out.println("Introduce el multiplicador (3 cifras): "); //Mostrar en pantalla "Introduce el multiplicador (3 cifras): "
        int multiplicador = entrada.nextInt(); //Leer el valor introducido y guardarlo en la variable numérica entera [multiplicador]

        System.out.println(" ");
        System.out.println(" "); //Introducimos 2 saltos de línea

        int resultado = multiplicando * multiplicador;
        System.out.println("El resultado de la multiplicación es: " + resultado);
        System.out.println("El proceso es: ");

        String multiplicadorC = Integer.toString(multiplicador); //Convertimos el numerador de número entero a cadena de caracteres
        String multiplicadorC_1 = multiplicadorC.substring(0,1); //cogemos la primera cifra (desde la posión 0 hasta la 1)
        String multiplicadorC_2 = multiplicadorC.substring(1,2); //cogemos la primera cifra (desde la posión 1 hasta la 2)
        String multiplicadorC_3 = multiplicadorC.substring(2,3); //cogemos la primera cifra (desde la posión 2 hasta la 3)

        System.out.println("El primer número es " + multiplicadorC_1);
        System.out.println("El segundo número es: " + multiplicadorC_2);
        System.out.println("El tercer número es: " + multiplicadorC_3);



    }

}

