package org.example;

import java.util.Random;
import java.util.Scanner;

public class PrácticasUnidad3 {

    public void batallaSamurais(){

        //Importamos Random y Scanner
        Random random = new Random();
        Scanner entrada = new Scanner(System.in);

        //Mostramos Equipo 1 en pantalla y definimos array de 7 valores numéricos enteros
        System.out.println("> Equipo 1");
        int equipo1[] = new int[7];

        //Definición de bucle que recopile todas las condiciones a cumplir para que el programa funcione correctamente
        //Bucle definido para las condiciones del Equipo 1, se hará lo mismo con el Equipo 2
        while (true){

            //Recogemos información por teclado del usuario y la guardamos en un array de tipo String
            //Cada valor del array estará definido por un espacio
            System.out.print("> Introduce la potencia de los samurais (separada por espacios): ");
            String entradaEquipo1 = entrada.nextLine();
            String equipo1Texto[] = entradaEquipo1.split(" ");

            //Validación de la longitud del array, si es correcta pasamos a los siguientes validadores, si no repetirá la entrada de texto
            if (equipo1Texto.length != 7){
                System.out.println("> ERROR. Debes introducir exactamente 7 valores.");
                continue;
            }

            //Definición de un comprobador de potencia del Equipo 1 así como un booleano que defina si la entrada es válida o no
            int comprobadorPotenciaE1 = 0;
            boolean entradaValida = true;

            //Validación de formato numérico así como de los valores de cada potencia (entre 1 y 24)
            for (int i = 0; i < equipo1Texto.length; i++) {
                try {
                    equipo1[i] = Integer.parseInt(equipo1Texto[i]);
                    if (equipo1[i] < 1 || equipo1[i] > 24){
                        System.out.println("> ERROR. debes introducir valores entre 1 y 24.");
                        entradaValida = false;
                        break;
                    }
                    comprobadorPotenciaE1 += equipo1[i];
                } catch (NumberFormatException e) {
                    System.out.println("> ERROR. No vale introducir caracteres." + e.getMessage());
                    entradaValida = false;
                    break;
                }
            }

            //Si no se cumple alguno de los anteriores requisitos (entradaValida = false)
            //!entradaValida será true así que nos volverá a repetir el bucle desde la entrada de texto
            if (!entradaValida){
                continue;
            }

            //Si lo demás está correcto comprobamos por último que la potencia sea exactamente 30
            if (comprobadorPotenciaE1 != 30){
                System.out.println("> ERROR. La potencia total no suma 30.");
                continue;
            }

            System.out.println("> Equipo 1 completo");
            break;
        }

        //Lo mismo que arriba pero para el equipo 2
        System.out.println("\n> Equipo 2");
        int equipo2[] = new int[7];

        while (true){

            System.out.print("> Introduce la potencia de los samurais (separada por espacios): ");

            String entradaEquipo2 = entrada.nextLine();
            String equipo2Texto[] = entradaEquipo2.split(" ");

            if (equipo2Texto.length != 7){
                System.out.println("> ERROR. Debes introducir exactamente 7 valores.");
                continue;
            }

            int comprobadorPotenciaE2 = 0;
            boolean entradaValida = true;

            for (int i = 0; i < equipo2Texto.length; i++) {
                try {
                    equipo2[i] = Integer.parseInt(equipo2Texto[i]);
                    if (equipo2[i] < 1 || equipo2[i] > 24){
                        System.out.println("> ERROR. debes introducir valores entre 1 y 24.");
                        entradaValida = false;
                        break;
                    }
                    comprobadorPotenciaE2 += equipo2[i];
                } catch (NumberFormatException e) {
                    System.out.println("> ERROR. No vale introducir caracteres." + e.getMessage());
                    entradaValida = false;
                    break;
                }
            }

            if (!entradaValida){
                continue;
            }

            if (comprobadorPotenciaE2 != 30){
                System.out.println("> ERROR. La potencia total no suma 30.");
                continue;
            }

            System.out.println("> Equipo 2 completo");
            break;
        }

        //Si esta correcto, damos comienzo a la batalla
        System.out.println("\n> ¡Empieza la batalla!");

        //Definimos qué samurai comenzará con random desde 1 hasta 7
        int numeroInicioSamurai = random.nextInt(8) + 1;
        System.out.println("> La batalla inicia con el samurai " + numeroInicioSamurai);

        //Definimos un contador de bajas para cada equipo
        int bajasEquipo1 = 0;
        int bajasEquipo2 = 0;

        //Comenzamos el bucle desde el samurai que haya salido aleatorio hasta el final
        //Actualizamos las bajas de cada equipo en función de si ganen, pierdan o empaten
        //Ganará el samurai con mayor valor de potencia y se contabilizará una baja al equipo contrario
        for (int i = numeroInicioSamurai - 1; i < equipo1.length; i++){
            if (equipo1[i] > equipo2[i]){
                System.out.println("> Samurai " + (i+1) + ". Gana equipo 1. " + equipo1[i] + " vs " + equipo2[i]);
                bajasEquipo2++;
            } else if (equipo2[i] > equipo1[i]) {
                System.out.println("> Samurai " + (i+1) + ". Gana equipo 2. " + equipo2[i] + " vs " + equipo1[i]);
                bajasEquipo1++;
            } else {
                System.out.println("> Samurai " + (i+1) + ". EMPATE.");
                bajasEquipo1++;
                bajasEquipo2++;
            }
        }

        //Acabamos de recorrer el bucle desde la posición 0 hasta el número de samurai que haya salido con la misma lógica anterior
        for (int i = 0; i < numeroInicioSamurai -1; i++){
            if (equipo1[i] > equipo2[i]){
                System.out.println("> Samurai " + (i+1) + ". Gana equipo 1. " + equipo1[i] + " vs " + equipo2[i]);
                bajasEquipo2++;
            } else if (equipo2[i] > equipo1[i]) {
                System.out.println("> Samurai " + (i+1) + ". Gana equipo 2. " + equipo2[i] + " vs " + equipo1[i]);
                bajasEquipo1++;
            } else {
                System.out.println("> Samurai " + (i+1) + ". EMPATE.");
                bajasEquipo1++;
                bajasEquipo2++;
            }
        }

        //Comparamos al final las bajas y definimos al equipo ganador y mostramos el número de bajas del otro equipo
        if (bajasEquipo2 > bajasEquipo1){
            System.out.println("> ¡Equipo 1 GANA! Equipo 2 ha tenido " + bajasEquipo2 + " bajas.");
        } else if (bajasEquipo1 > bajasEquipo2) {
            System.out.println("> ¡Equipo 2 GANA! Equipo 1 ha tenido " + bajasEquipo1 + " bajas.");
        }else {
            System.out.println("> EMPATE");
        }
    }
}
