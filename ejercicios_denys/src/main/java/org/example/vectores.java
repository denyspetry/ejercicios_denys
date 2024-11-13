package org.example;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class vectores {

        public void navidad(){

            Scanner entrada = new Scanner(System.in);

            final String palabra = "NAVIDAD";

            System.out.println("introduce la cantidad de letras a mostrar:");
            String cantidad =entrada.nextLine();

            String cantidades[] = cantidad.split(" ");
            String letras[] = palabra.split("");

            String resultado = "";

            for (int i = 0; i < letras.length; i++){
                for (int j = 0; j < Integer.parseInt(cantidades[i]); j++){

                    resultado = resultado + letras[i];
                }
            }

            System.out.println(resultado);
        }

        public void ruleta(){

            Scanner teclado = new Scanner(System.in);
            Random aleatorio = new Random();

            String colores[] = {"rojo", "negro"};

            Integer numeros[] = new Integer[37];

            for (int i = 0; i < numeros.length; i++){
                numeros[i] = i;
            }

            String pares[] = { "par", "impar"};

            System.out.println("número (0-36): ");
            int numero = teclado.nextInt();

            boolean numero_existe = Arrays.asList(numeros).contains(numero);

            if (!numero_existe){
                System.out.println("ERROR. El número no es válido.");
                return;
            }else {
                if (numero != 0) {
                    System.out.println("Color (rojo-negro): ");
                    String color = teclado.next();

                    boolean color_existe = Arrays.asList(colores).contains(color);

                    if (!color_existe){
                        System.out.println("ERROR. El color no es válido");
                        return;
                    }else{
                        System.out.println("Introduce la opción par o impar:");
                        String par = teclado.next();
                        boolean par_existe = Arrays.asList(pares).contains(par);

                        if (!par_existe){
                            System.out.println("ERROR. La opción par/impar no es válida.");
                            return;
                        }
                    }
                }
            }

            int numero_sorteo = numeros[aleatorio.nextInt(37)];
            String color_sorteo = colores[aleatorio.nextInt(2)];
            String pares_sorteo = "";

            if (numero_sorteo % 2 == 0){
                pares_sorteo = "par";
            }else{
                pares_sorteo = "impar";
            }

            System.out.println("Ha tocado " + numero_sorteo + ", " + pares_sorteo +", "+ color_sorteo);
            //Falta dar premios

            if (numero != 0 && numero_sorteo == numero && color_sorteo.equals(colores) && pares_sorteo.equals(pares)){
                System.out.println("HAS GANADO!!");
            }else if (numero != 0 && color_sorteo.equals(colores)){
                System.out.println("Has acertado el color.");
            }else if (numero != 0 && pares_sorteo.equals(pares)){
                System.out.println("Has acertado la opción par/impar.");
            } else if (numero == numero_sorteo && numero != 0) {
                System.out.println("Has acertado el número");
            } else if (numero == 0 && numero_sorteo == 0) {
                System.out.println("Has ganado y los demas usuarios pierden");
            }else{
                System.out.println("Has perdido");
            }
        }
    }
