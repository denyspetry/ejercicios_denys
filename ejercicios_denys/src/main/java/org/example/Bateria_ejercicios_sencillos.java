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
}
