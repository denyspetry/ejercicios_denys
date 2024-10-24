package org.example;

import java.util.Random;
import java.util.Scanner;

public class Aleatorios {

    public void aleatorios (){

        Random aleatorio = new Random();

        int numeroAleatorio = aleatorio.nextInt();
        System.out.println(numeroAleatorio);

        numeroAleatorio = aleatorio.nextInt(999);
        System.out.println(numeroAleatorio);

        double numeroDecimal = aleatorio.nextDouble();
        System.out.println(numeroDecimal);

    }


    public void randomEjercicio1(){

        //Random random = new Random(7);
        Random random = new Random();

        int dado1 = random.nextInt(6) + 1;
        int dado2 = random.nextInt(6) + 1;

        System.out.println("El primer dado ha salido: " + dado1);
        System.out.println("El segundo dado ha salido: " + dado2);

        System.out.println("La suma de ambos dados es: " + (dado1 + dado2));
    }


    public void randomEjercicio2(){

        Random random = new Random();

        String caracteres = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789";

        int longitud = 10;

        String contrasenya = "";

        int posicion;

        for(int i = 0; i<longitud; i++){

            posicion = random.nextInt(caracteres.length());
            contrasenya += caracteres.charAt(posicion);

        }

        System.out.println("La contraseña generada es: " + contrasenya);

    }


    public void randomEjercicio3(){

        Scanner entrada = new Scanner(System.in);
        Random aleatorio = new Random();

        int minimo = 1;
        int maximo = 0;

        while (minimo > maximo) {
            System.out.println("Introduce el rango mínimo: ");
            minimo = entrada.nextInt();

            System.out.println("Introduce el rango máximo: ");
            maximo = entrada.nextInt();
        }

        int cantidadAleatorios = 0;
        System.out.println("¿Cuántos números aleatorios quieres?: ");
        cantidadAleatorios = entrada.nextInt();

        for (int i = 0; i < cantidadAleatorios; i++){

            int numero = aleatorio.nextInt(maximo - minimo + 1) + minimo;
            System.out.println(numero);
        }
    }


    public void randomEjercicio4(){

        Random random = new Random();

        String caracteres = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789";

        int longitudAleatoria = random.nextInt(3) + 6;

        //int longitud = 10;

        String contrasenya = "";

        int posicion;

        for(int i = 0; i<longitudAleatoria; i++){

            posicion = random.nextInt(caracteres.length());
            contrasenya += caracteres.charAt(posicion);

        }

        System.out.println("La contraseña generada es: " + contrasenya);

    }
}
