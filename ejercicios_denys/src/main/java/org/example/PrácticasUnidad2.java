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

        Scanner entrada = new Scanner(System.in);
        int numero1 = 0;
        int numero2 = 0;
        String operador = "";
        float resultado = 0;
        boolean repetir = true;


        System.out.println("HOLA, BIENVENIDO A MI CALCULADORA");

        //Pedimos el primer número
        while (repetir) {
            System.out.println("Introduce el primer número: ");

            if (entrada.hasNextInt()) {
                numero1 = entrada.nextInt();
                entrada.nextLine(); //Necesario para que al pedir el operador no haya error
                repetir = false;
            } else {
                System.out.println("El valor introducido debe de ser un número entero");
                entrada.nextLine(); //Necesario para que no entre en bucle, ya que si no siempre mostraría los dos mensajes de arriba
            }
        }

        //Pedimos el operador
        repetir = true;
        while (repetir) {
            System.out.println("Introduce el operador (+,-,*,/,R): ");

            if (entrada.hasNextLine()) {
                operador = entrada.nextLine().toUpperCase();

                if (operador.equals("+") || operador.equals("-") || operador.equals("*") || operador.equals("/") || operador.equals("R")) {
                    repetir = false;
                }else{
                    System.out.println("Debes introducir un operador válido");
                }
            }
        }

        //Pedimos el segundo número excepto si el operador introducido es "R"
        if (!operador.equals("R")) {
            System.out.println("Introduce el segundo número: ");

            while (!entrada.hasNextInt()){
                System.out.println("El valor introducido tiene que ser un número entero");
            }
            numero2 = entrada.nextInt();
        }


        repetir = true;
        boolean repetir2 = true;
        while (repetir) {
            switch (operador) {

                case "+":
                    resultado = numero1 + numero2;
                    repetir = false;
                    break;

                case "-":
                    resultado = numero1 - numero2;
                    repetir = false;
                    break;

                case "*":
                    resultado = numero1 * numero2;
                    repetir = false;
                    break;

                case "/":
                    if (numero2 != 0) {
                        resultado = (float) numero1 / numero2;
                        repetir = true;
                    } else {
                        System.out.println("No se puede dividir por 0");
                        while (repetir2){
                            System.out.println("Introduce un segundo número válido");
                            if (entrada.hasNextInt()){
                                numero2 = entrada.nextInt();
                                entrada.nextLine();
                                repetir2 = false;
                            }

                        }
                    }
                    break;
                case "R":
                    if (numero1 > 0) {
                        //resultado = Math.sqrt(numero1);
                    }

            }
        }
        System.out.println("El resultado de la operación es: " + resultado);
    }
}
