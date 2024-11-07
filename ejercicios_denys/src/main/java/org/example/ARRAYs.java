package org.example;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class ARRAYs {

    public void vectores(){

        int vector[];

        vector = new int[7];

        vector [2] = 7;
        vector [5] = vector [2] + 4;

         System.out.println(vector [2] + " " + vector[5]);


         for (int i=0; i < vector.length; i++){
             System.out.print(" " + vector[i] + " ");
         }

         String palabras [] = new String[3];

         for (int i = 0; i < palabras.length; i++){
             System.out.println(" " + palabras[i]+ " ");
         }


    }

    public void ejercicio1(){

        Random aleatorio = new Random();

        int numeros [] = new int[8];
        int suma = 0;

        for (int i = 0; i < numeros.length; i++){

            numeros [i] = aleatorio.nextInt(501);
            suma += numeros [i];

        }

        System.out.println("La suma de los elementos es: " + suma);
    }

    public void ejercicio2(){

        Scanner teclado = new Scanner(System.in);
        int numeros [] = new int [5];

        System.out.println("Introduce los numeros a invertir...");

        for (int i = 0; i < numeros.length; i++){
            numeros [i] = teclado.nextInt();
        }

    /*    for (int i = numeros.length - 1; i >= 0; i--){
            System.out.print(" " + numeros[i] + " ");
        } */

        int tam_mitad = numeros.length / 2;
        int aux = 0;

        for (int i = 0; i < tam_mitad; i++){

            aux = numeros[i];
            numeros[i] = numeros[tam_mitad + i];
            numeros[tam_mitad + i] = aux;
        }

    }

    public void ejercicio3() {

        Random aleatorio = new Random();
        Scanner teclado = new Scanner(System.in);

        int numeros[] = new int[25];

        for (int i = 0; i < numeros.length; i++) {

            numeros[i] = aleatorio.nextInt(101);

        }

        int numeroUsuario = 0;
        boolean entradaValida = false;
        while (!entradaValida) {
            System.out.println("Introduce un numero a buscar:");
            if (teclado.hasNextInt()) {
                numeroUsuario = teclado.nextInt();
                entradaValida = true;
            } else {
                System.out.println("Por favor, introduce un número entero válido.");
                teclado.next(); // Limpiar entrada no válida
            }
        }

        int contador = 0;

        for (int i = 0; i < numeros.length; i++) {
            if (numeroUsuario == numeros[i]) {
                contador++;
            }
        }

        System.out.println("El array tiene los siguientes numeros:");
        for (int i = 0; i < numeros.length; i++) {
            System.out.print(" " + numeros[i] + " ");
        }

        System.out.println("Tu numero aparece " + contador + " veces");

    }

    public void ejercicio4(){

        Scanner teclado = new Scanner(System.in);

        int antiguoVector [] = {1,3,5,7,9};
        int nuevoVector [] = new int[antiguoVector.length-1];

        System.out.println("El vector es:");
        System.out.println(Arrays.toString(antiguoVector));

        System.out.println("Introduce el índice a eliminar: ");
        int indiceEliminar = teclado.nextInt();

        for (int i = 0; i < antiguoVector.length-1; i++){

            if (i < indiceEliminar){
                nuevoVector[i] = antiguoVector[i];
            }else {
                nuevoVector[i] = antiguoVector[i+1];
            }
        }

        System.out.println("El vector nuevo es:");
        System.out.println(Arrays.toString(nuevoVector));
    }

    public void ejercicio5(){

        Scanner teclado = new Scanner(System.in);

        int vector [] = new int[5];

        for (int i = 0; i < vector.length; i++){
            System.out.println("Introduce un numero: ");
            vector[i] = teclado.nextInt();
        }

        System.out.println("El vector es: ");

        for (int i = 0; i < vector.length; i++){
            System.out.print(" " + vector[i] + " ");
        }

        System.out.println("");

        int ultimaPosicion = vector[vector.length-1];

        for (int i = vector.length-1; i >= 0; i--){

            if (i == 0){
                vector[i] = ultimaPosicion;
            }else {
                vector[i] = vector[i] - 1;
            }
        }

        System.out.println("El vector es ahora: ");
        for (int i = 0; i < vector.length; i++){
            System.out.print(" " + vector[i] + " ");
        }
    }

    public void ejercicio6(){

        Scanner teclado = new Scanner(System.in);

        int palindromos [] = {1,2,3,1,1};
        String esSimetrico = "Si";

        for (int i = 0; i < palindromos.length; i++){
            if (palindromos [i] == palindromos[palindromos.length -1 - i]){
                esSimetrico = "Si";
                continue;
            }else {
                esSimetrico = "No";
                break;
            }
        }
        System.out.println("El vector es simetrico: " + esSimetrico);
    }
}
