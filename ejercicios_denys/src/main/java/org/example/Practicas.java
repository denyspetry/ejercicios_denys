package org.example;

import java.util.Scanner;

public class Practicas {

    public void PRÁCTICA_3(){
    //INICIO
        System.out.println("Introduce tu nombre: "); //Mostrar "Introduce tu nombre"
        Scanner entrada = new Scanner(System.in); //Definir Scanner con el nombre entrada
        String nombre = entrada.next(); //Leer el valor de nombre introducido por entrada y guardarlo en una variable de tipo texto [nombre]
        System.out.println("Hola " + nombre + ", introduce tu edad: "); //Mostrar "Hola [nombre], introduce tu edad"

        boolean comprobador = true; //Entrada al bucle mientras
        //INICIO MIENTRAS
        while(comprobador){
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
}
