package org.example;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.Scanner;

public class Excepciones {

    public void excepciones1(){

        Scanner teclado = new Scanner(System.in);
        boolean error = false;

        System.out.println("Dividendo: ");
        int dividendo = 0;

        if (teclado.hasNextInt()) {

            dividendo = teclado.nextInt();

            System.out.println("Número entero: " + dividendo);

        } else {

            System.out.println("No es un entero válido.");

        }
    }


    public void actividad1Excepciones(){

        LocalDateTime hoy = LocalDateTime.now();

        System.out.println("El día es: " + hoy.getDayOfMonth());
        System.out.println("El mes es: " + hoy.getMonthValue());
        System.out.println("El año es: " + hoy.getYear());
        System.out.println("Minutos: " + hoy.getMinute());
    }


    public void generaciones(){

        System.out.println("BIENVENIDO A LA CLASIFICACION DE GENERACIONES:");
        System.out.println("Elige un modo: ");
        System.out.println("1. Año nacimiento");
        System.out.println("2. Edad");

        Scanner teclado = new Scanner(System.in);

        String modo = teclado.next(); //Solo va a ser na palabra, no hace falta nextln

        LocalDateTime hoy = LocalDateTime.now();
        int añoActual = hoy.getYear();
        int añoNacimiento = 1800;
        boolean error = false;

        if (modo.equals("1")){

            System.out.println("Introduce tu año de nacimiento: ");

            String año = teclado.next();

            try{
                añoNacimiento = Integer.parseInt(año);
            }catch (NumberFormatException e1){
                System.out.println("El formato del año no es correcto" + e1.getMessage());
            }

            if (añoNacimiento < 1900 || añoNacimiento > añoActual){
                System.out.println("El año introducido no es correcto");
                error = true;
            }

        } else if (modo.equals("2")) {

            System.out.println("introduce tu edad: ");
            int edad = 0;

            if (teclado.hasNextInt()) {
                edad = teclado.nextInt();
            }else {
                System.out.println("El formato de la edad es incorrecto");
                error = true;
            }
            if (edad < 0){
                System.out.println("La edad introducida no es correcto");
                error = true;
            }else{
                añoNacimiento = añoActual - edad;
            }

        }else{
            System.out.println("El modo no existe");
            error = true;
        }
        if (!error) {
            if (añoNacimiento >= 1900 && añoNacimiento <= 1927) {
                System.out.println("Eres de la generacion sin bautizar");
            } else if (añoNacimiento >= 1928 && añoNacimiento <= 1944) {
                System.out.println("Eres de la generación Silent");
            } else if (añoNacimiento >= 1945 && añoNacimiento <= 1964) {
                System.out.println("Eres de la generación Baby Boomers");
            } else if (añoNacimiento >= 1965 && añoNacimiento <= 1981) {
                System.out.println("Eres de la generación X");
            } else if (añoNacimiento >= 1982 && añoNacimiento <= 1994) {
                System.out.println("Eres de la generación Millenial");
            } else if (añoNacimiento >= 1995 && añoNacimiento <= añoActual) {
                System.out.println("Eres de la generación Millenial");
            } else {
                System.out.println("No tienes generación");
            }
        }

        /* Sin Generación bautizada (nacidos entre 1900 y 1927).
           Generación Silent (nacidos entre 1928 y 1944).
           Baby Boomers (nacidos entre 1945 y 1964).
           Generación X (nacidos entre 1965 y 1981).
           Generación Y o Millennials (nacidos entre 1982 y 1994).
           Generación Z o Centennials (nacidos entre 1995 y 2009 en adelante).    */

    }
}
