package org.example;

import java.util.InputMismatchException;
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

        //INICIO

        Scanner entrada = new Scanner(System.in); //Definimos Scanner con el nombre entrada
        boolean repetir = true; //Repetidor para try-catch
        boolean repetir2 = true; //Repetidor para bucle si números negativos
        int resultado = 0;
        int multiplicando = 0;
        int multiplicador = 0;
        int multiplicador1 = 0;
        int multiplicador2 = 0;
        int multiplicador3 = 0;           //Definimos todas las variables fuera de catch para que no nos de problemas
        int resultado1 = 0;               //A medida que vayamos escribiendo líneas de código se irán actualizando
        int resultado2 = 0;
        int resultado3 = 0;
        String multiplicadorC = "a";
        String multiplicadorC_1 = "a";
        String multiplicadorC_2 = "a";
        String multiplicadorC_3 = "a";
        while (repetir) { //INICIO WHILE DE TRY-CATCH
            try { //INICIO TRY-CATCH
                while (repetir2) { //INICIO WHILE DEL CÓDIGO
                    System.out.println("Introduce el multiplicando (3 cifras): "); //Mostrar en pantalla "Introduce el multiplicando (3 cifras): "
                    multiplicando = entrada.nextInt(); //Leer el valor introducido y guardarlo en la variable numérica entera [multiplicando]
                    System.out.println("Introduce el multiplicador (3 cifras): "); //Mostrar en pantalla "Introduce el multiplicador (3 cifras): "
                    multiplicador = entrada.nextInt(); //Leer el valor introducido y guardarlo en la variable numérica entera [multiplicador]

                    repetir = false; //Try-catch no se vuelve a repetir. Llega al fin

                    if (multiplicando > 0 && multiplicador > 0) { //Si el multiplicando y el multiplicador son mayores que 0
                        repetir2 = false; //Entonces no nos vuelve a pedir que introduzcamos otra vez el multiplicando y el multiplicador
                        System.out.println(" ");
                        System.out.println(" "); //Introducimos 2 saltos de línea

                        resultado = multiplicando * multiplicador; //Actualizamos el resultado
                        System.out.println("El resultado de la multiplicación es: " + resultado); //Mostramos el resultado
                        System.out.println("El proceso es: "); // Mostramos "El proceso es: "

                        multiplicadorC = Integer.toString(multiplicador); //Convertimos el numerador de número entero a cadena de caracteres
                        multiplicadorC_1 = multiplicadorC.substring(0, 1); //Cogemos la primera cifra (desde la posión 0 hasta la 1)
                        multiplicadorC_2 = multiplicadorC.substring(1, 2); //Cogemos la segunda cifra (desde la posión 1 hasta la 2)
                        multiplicadorC_3 = multiplicadorC.substring(2, 3); //Cogemos la tercera cifra (desde la posión 2 hasta la 3)

                        multiplicador1 = Integer.parseInt(multiplicadorC_1); //Convertimos a entero el primer número del multiplicador
                        multiplicador2 = Integer.parseInt(multiplicadorC_2); //Convertimos a entero el segundo número del multiplicador
                        multiplicador3 = Integer.parseInt(multiplicadorC_3); //Convertimos a entero el tercer número del multiplicador

                        resultado1 = multiplicador3 * multiplicando; //Actualizamos el producto del numerando por el último multiplicador
                        resultado2 = multiplicador2 * multiplicando; //Actualizamos el producto del numerando por el segundo multiplicador
                        resultado3 = multiplicador1 * multiplicando; //Actualizamos el producto del numerando por el primer multiplicador

                        System.out.println("    " + multiplicando);
                        System.out.println("  X " + multiplicador);
                        System.out.println("--------");
                        System.out.println("   " + resultado1);
                        System.out.println("  " + resultado2 + "X"); //Se muestra en una forma visual, el resultado de todas las operaciones
                        System.out.println(" " + resultado3 + "XX");
                        System.out.println("--------");
                        System.out.println(" " + resultado);
                    } else { //Si multipicando y multiplicador son menores que 0, entonces nos mostrará el mensaje de abajo
                        System.out.println("ERROR, los números deben de ser positivos distintos de 0");
                        entrada.nextLine(); //Y nos vuelve a pedir multiplicando y multiplicador, por que aquí no se ha actualizado repetidor a false
                    }
                }
            } catch (InputMismatchException e) { //Si se introduce un valor de cadena de caracteres, nos devuelve el mensaje de abajo
                System.out.println("ERROR, el valor introducido tiene que ser un número positivo");
                repetir = true;
                entrada.nextLine(); //Nos vuelve a pedir multiplicando y multiplicador ya que la variable repetir se ha actualizado a true
            } //FIN TRY-CATCH
        }//FIN WHILE
    }//FIN
}

