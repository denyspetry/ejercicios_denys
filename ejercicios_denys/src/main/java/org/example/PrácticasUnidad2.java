package org.example;

import java.util.Scanner;

public class PrácticasUnidad2 {

    public void Practica1NumSuerte(){

        Scanner teclado = new Scanner(System.in); //Definimos Scanner con el nombre teclado
        boolean repetidor = true;
        int fechaDia = 0;
        int fechaMes = 0; //Definimos estas variables al principio por que si no nos da error al salir del if
        int fechaAño = 0;

        while (repetidor){ //Repetimos hasta que la fecha sea válida

            System.out.println("Introduce tu fecha de nacimiento (dd/mm/aaaa): "); //Mostramos el mensaje "Introduce tu fecha de nacimiento"
            String fechaNac = teclado.nextLine(); //Guardamos la fecha de nacimiento como String

            if (fechaNac.matches("\\d{1,2}/\\d{1,2}/\\d{4}")){ //Si el formato de la fecha es correcto, extraemos el día, mes y año
                fechaDia = Integer.parseInt(fechaNac.substring(0,2));
                fechaMes = Integer.parseInt(fechaNac.substring(3,5)); //Convertimos directamente los subíndices de la fecha de cumpleaños correspondientes a día, mes y año a número entero y los guardamos en variables
                fechaAño = Integer.parseInt(fechaNac.substring(6,10));

                if (fechaDia >= 1 && fechaDia <= 31 && fechaMes >=1 && fechaMes <= 12 && fechaAño >=1900){
                    repetidor = false; //Si se cumplen las condiciones el bucle deja de repetirse
                } else {
                    System.out.println("Los valores introducidos están fuera de rango, introduce unos valores correctos: ");
                } //Si se introducen números negativos o 0 nos muestra el mensaje de arriba

            } else {
                System.out.println("Introduce un formato de fecha válido");
            } //Si se introduce un formato de fecha aaaa/mm/dd o cualquier otro nos mostrará el mensaje de arriba
        }

        int resultado = fechaDia + fechaMes + fechaAño; // Variable resultado de sumar dia + mes + año

        System.out.println(fechaDia + " + " + fechaMes + " + " + fechaAño + " = " + resultado); //Mostramos la operación realizada dia + mes + año = resultado

        String resultadoC = Integer.toString(resultado); //El resultado lo convertimos a cadena de caracteres, pasamos de int a string
        int resultadoCnum1 = Integer.parseInt(String.valueOf(resultadoC.charAt(0)));
        int resultadoCnum2 = Integer.parseInt(String.valueOf(resultadoC.charAt(1))); //De los 4 números del resultado, sacamos el primero, segundo, tercero y cuarto
        int resultadoCnum3 = Integer.parseInt(String.valueOf(resultadoC.charAt(2))); //Y los guardamos como números enteros, pero antes hemos transformado cada caracter a cadena de caracteres, y la cadena de caracteres a número entero
        int resultadoCnum4 = Integer.parseInt(String.valueOf(resultadoC.charAt(3))); //Sin [String.valueOf()] no nos permite hacer esta operacion, debido a que no es lo mismo un caracter "char" que una cadena de caracteres "string"
        int numSuerte = resultadoCnum1 + resultadoCnum2 + resultadoCnum3 + resultadoCnum4; //Guardamos la suma de todos estos 4 números como nuestro número de la suerte (int)

        System.out.println(resultadoCnum1 + " + " + resultadoCnum2 + " + " + resultadoCnum3 + " + " + resultadoCnum4 + " = " + numSuerte); //Mostramos toda la operación realizada
        System.out.println("Tu número de la suerte es: " + numSuerte); //Mostramos mensaje "Tu número de la suerte es: [numero_de_la_suerte]"
    }


    public void Practica2Calculadora(){

        int numero1 = 0;
        int numero2 = 0;
        float resultado = 0;
        Scanner entrada = new Scanner(System.in);

        System.out.println("HOLA, BIEVENIDO A MI CALCULADORA");

        System.out.println("Introduce el primer número: ");
        numero1 = entrada.nextInt();

        System.out.println("Introduce el operador (+,-,*,/,R): ");
        String operador = entrada.nextLine();
        entrada.nextLine();

        System.out.println("Introduce el segundo número: ");
        numero2 = entrada.nextInt();

        switch (operador){

            case "+":
                resultado = numero1 + numero2;
                break;
            case "-":
                resultado = numero1 - numero2;
                break;
            case "*":
                resultado = numero1 * numero2;
                break;
            case "/":
                resultado = (float) numero1 / numero2;
                break;
            case "R":
                if (numero1 > 0) {
                    resultado = Math.sqrt(numero1);
                }

        }






    }
}
