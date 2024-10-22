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

        repetir = true;
        //Pedimos el segundo número excepto si el operador introducido es "R"
        if (!operador.equals("R")) {
            while (repetir){
                System.out.println("Introduce el segundo número: ");

                if(entrada.hasNextInt()){
                    numero2 = entrada.nextInt();
                    entrada.nextLine(); //Lo introducimos para limpiar el buffer
                    repetir = false;
                }else {
                System.out.println("No puedes introducir un caracter");
                entrada.nextLine(); //Si no introducimos una nueva entrada de texto, se queda en bucle entre los dos System.out.println
                }
            }
        }

        switch (operador) {

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
                    while (numero2 == 0){
                        System.out.println("Introduce un número distinto de 0");
                        numero2 = entrada.nextInt();
                        entrada.nextLine(); //Limpiamos el Buffer
                    }
                    resultado = (float) numero1 / numero2;
                    break;

                case "R":
                    while (numero1<0) {
                        System.out.println("ERROR, no se puede calcular la raíz cuadrada de un número negativo");
                        System.out.println("Introduce otro número: ");
                        numero1 = entrada.nextInt();
                        entrada.nextLine();
                    }
                    resultado = (float) Math.sqrt(numero1);
                    break;
        }
        System.out.println("El resultado de la operación es: " + resultado);
    }


    public void Practica3ISBN(){

        //Definición de variables de tipo entero
        int n1 = 0, n2 = 0, n3 = 0, n4 = 0, n5 = 0, n6 = 0, n7 = 0, n8 = 0, n9 = 0, n10 = 0;
        int resultado = 0;
        int comprobador = 0;

        Scanner entrada = new Scanner(System.in); //Definición de Scanner como entrada

        System.out.println("HOLA, BIENVENIDO AL COMPROBADOR DE ISBN");
        System.out.println("Introduzca un ISBN: ");
        String isbn = entrada.nextLine();

        while (isbn.length() != 10){
            System.out.println("Introduzca un ISBN de 10 números: ");
            isbn = entrada.nextLine();
        }

        //Guardamos cada uno de los caracteres de la cadena de texto como entero
        /* n1 = Integer.parseInt(String.valueOf(isbn.charAt(0)));
        n2 = Integer.parseInt(String.valueOf(isbn.charAt(1)));
        n3 = Integer.parseInt(String.valueOf(isbn.charAt(2)));
        n4 = Integer.parseInt(String.valueOf(isbn.charAt(3)));
        n5 = Integer.parseInt(String.valueOf(isbn.charAt(4)));
        n6 = Integer.parseInt(String.valueOf(isbn.charAt(5)));
        n7 = Integer.parseInt(String.valueOf(isbn.charAt(6)));
        n8 = Integer.parseInt(String.valueOf(isbn.charAt(7)));
        n9 = Integer.parseInt(String.valueOf(isbn.charAt(8)));
        n10 = Integer.parseInt(String.valueOf(isbn.charAt(9))); */

        /* resultado = (n1*10) + (n2*9) + (n3*8) + (n4*7) + (n5*6) + (n6*5) + (n7*4) + (n8*3) + (n9*2) + (n10);
        System.out.println("El resultado es: " + resultado); */

        String caracterFinal = String.valueOf(isbn.toUpperCase().charAt(9));
        int numero = 0;
        int multiplicion = 0;
        int i = 0;
        int j = 0;
        int sumaFinal = 0;
        int suma = 0;

        switch (caracterFinal){

            case "X":
                for (i = 10 ; i >= 2 ; i--) {

                    numero = Integer.parseInt(String.valueOf(isbn.charAt(j)));
                    j++;
                    multiplicion = i * numero;
                    System.out.println(numero + " * " + i );
                    suma += multiplicion;
                }
                sumaFinal = suma + 10;
                System.out.println(sumaFinal);
                break;

            default:
                for (i = 10 ; i >= 1 ; i--) {

                    numero = Integer.parseInt(String.valueOf(isbn.charAt(j)));
                    j++;
                    multiplicion = i * numero;
                    System.out.println(numero + " * " + i );
                    sumaFinal += multiplicion;

                }
                System.out.println(sumaFinal);
                break;
        }

        comprobador = sumaFinal % 11;
        System.out.println("El resto de dividir entre 11 el resultado es: " + comprobador);

        switch (comprobador) {

            case 0:
                System.out.println("El ISBN es válido");
                break;

            default:
                System.out.println("El ISBN no es válido");
                break;
        }
    }
}
