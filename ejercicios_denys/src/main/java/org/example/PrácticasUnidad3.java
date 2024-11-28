package org.example;

import java.util.Arrays;
import java.util.InputMismatchException;
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

    public void sorteoPrimitiva(){

        // Definición de Random y Scanner
        Random random = new Random();
        Scanner entrada = new Scanner(System.in);

        //Enseñar en consola mensajes de bienvenida y de instrucciones de funcionamiento del programa
        System.out.println("BIENVENIDO AL SORTEO DE LA PRIMITIVA");
        System.out.println("Los 6 primeros números tienen que ser valores entre 1 y 49 y el reintegro entre 0 y 9");
        System.out.println("Introduce tu boleto siguiendo el siguiente formato 'N-N-N-N-N-N/R': ");
        String entradaUsuario = entrada.nextLine();
        //Almacenamiento en variable de la entrada que le hemos pedido al usuario



        // VALIDACIÓN ENTRADA USUARIO


        // Comprobamos que la entrada del usuario se adecua a lo que pedimos, si no es así nos mada mensaje ERROR y se sale del programa
        // Usamos un if para controlar que: "Si la entrada del usuario no es como te digo, no concuerda con lo que pedimos", es decir 11-11-11-11-11-11/1,
        // siendo 1 de momento cualquier número o dígito, muestre un mensaje de ERROR y salgamos del programa con return;
        if (!entradaUsuario.matches("\\d{1,2}-\\d{1,2}-\\d{1,2}-\\d{1,2}-\\d{1,2}-\\d{1,2}/\\d")){
            System.out.println("ERROR. Formato no válido.");
            return;
        }


        // Como la entrada es correcta, guardamos la entrada del usuario como vector de tipo String separando guiones y barras con .split("[-/]")
        String entradaUsuarioVector[] = entradaUsuario.split("[-/]");


        // Convertimos vector de tipo String a tipo numérico para poder operar con él, para ello definimos un nuevo vector de tipo numérico
        // de longitud 7 (los 6 primeros números + el reintegro). Luego usamos un bucle for para recorrer todos los valores del nuevo vector creado
        // y en cada uno de esos valores cambiamos el valor de su homólogo en String (entradaUsuarioVector) para que queden en formato numérico con
        // Integer.parseInt()
        int numerosUsuario[] = new int[7];
        for (int i = 0; i < entradaUsuarioVector.length; i++){
            numerosUsuario[i] = Integer.parseInt(entradaUsuarioVector[i]);
        }


        // Comprobación de que los 6 primeros números esten entre 1 y 49
        // El reintegro no hace falta comprobarlo, pues ya el métod .matches asegura que sea un dígito entre 0 y 9
        // Para ello usamos un bucle for que recorra el vector menos la última posición (la del reintegro) por eso i < numerosUsuario.length-1
        // Si al recorrer estas 6 primeras posiciones detectamos con if que alguno de los números es menor que 1 o mayor que 49 (||), mostramos
        // mensaje de ERROR y salimos del programa con return;
        for (int i = 0; i < numerosUsuario.length-1; i++){
            if (numerosUsuario[i] < 1 || numerosUsuario[i] > 49){
                System.out.println("ERROR. El valor de cada número tiene que estar entre 1 y 49");
                return;
            }
        }


        // Comprobamos que no hayan números repetidos
        // Usamos 2 bucles for que recorren los 6 primeros números, a excepción del segundo bucle (j) que empieza desde la siguiente posición
        // ya que si no, nos mostraría constantemente que hay números repetidos aunque no los haya. Comprobamos si los números en la poición i son
        // iguales que los de la posición j. Si se detecta que hay algún duplicado, mostramos mensaje de ERROR y salimos del programa con return;
        for (int i = 0; i < numerosUsuario.length-1; i++){
            for (int j = i+1; j < numerosUsuario.length-1; j++){
                if (numerosUsuario[i] == numerosUsuario[j]){
                    System.out.println("ERROR. Los números no pueden estar repetidos");
                    return;
                }
            }
        }

        // Mostramos el boleto del usuario
        System.out.println("\nBoleto Usuario:");
        System.out.println(Arrays.toString(numerosUsuario));
        //FIN DE LAS COMPROBACIONES DE ENTRADA



        // BOLETO DE LA MÁQUINA


        // Definimos la longitud del boleto de la máquina como un vector de longitud 6 (los 6 primeros números). El reintegro y el
        // complementario los calcularemos a parte.
        int boletoMaquina[] = new int[6];
        boolean duplicado = true;
        // Definimos variable duplicado para conmutar entre true/false dependiendo si encontramos duplicados o no en el bucle while
        // inmediatamente siguiente.


        // Damos a cada posición del boleto de la máquina, un número aleatorio entre 1 y 49 y controlamos que no sea un
        // valor que ya se encuentre repetido en el vector. En caso de que ya se encuentre repetido, volveremos a recalcularlo conmutando el booleano "duplicado".
        // Para ello usamos un bucle for que recorra todas las posiciones del vector boletoMaquina. Que nos calcule un número aleatorio, al menos una vez, al que por
        // defecto daremos como válido (duplicado = false;). Necesitamos un segundo bucle for con el que poder recorrer las posiciones de los valores ya creados y
        // poder comparar los numeros aleatorios, por ello j empezará desde 0 pero se ejecutará cuando i sea 1 y llegará hasta la posición j = 5 como máximo.
        // Si se detecta algún número duplicado conmutamos duplicado a true para que el bucle while vuelva a recalcular un nuevo número aleatorio para la posición en i.
        for (int i = 0; i < boletoMaquina.length; i++){
            do {
                boletoMaquina[i] = random.nextInt(49)+1;
                duplicado = false;
                for (int j = 0; j < i; j++){
                    if (boletoMaquina[i] == boletoMaquina[j]){
                        duplicado = true;
                        break;
                    }
                }
            }while (duplicado);
        }


        // Actualizamos duplicado a true para poder entrar en el siguiente bucle while
        duplicado = true;
        int complementario = 0;
        // Definición de la variable numérica complementario


        // Cálculo del número complementario con un bucle while que se ejecutará, al menos, 1 vez (duplicado = true;)
        // Calculamos el número complementario aleatorio y, dentro del bucle for (que lo usamos para recorrer las posiciones
        // del vector boletoMaquina), comprobamos si contiene un numero que sea igual, que será duplicado, en cuyo caso se actualizará
        // duplicado a true, se sale del bucle for con break; y volverá a recalcular otro número aleatorio con while.
        // En caso contrario duplicado será false y se dará el complementario como válido.
        while (duplicado){
            complementario = random.nextInt(49)+1;
            for (int i = 0; i < boletoMaquina.length; i++){
                if (complementario == boletoMaquina[i]){
                    duplicado = true;
                    break;
                }else {
                    duplicado = false;
                }
            }
        }


        // Definición de Reintegro (número aleatorio entre 0 y 9)
        int reintegro = random.nextInt(10);


        //Muestra de mensajes en consola
        System.out.println("\nSORTEO:");
        System.out.println(Arrays.toString(boletoMaquina));
        System.out.println("Número Complementario:");
        System.out.println(complementario);
        System.out.println("Reintegro:");
        System.out.println(reintegro);



        // PREMIOS


        // Para distribuir los premios, definiremos la lógica en función del número de aciertos y de qué tipo sea
        // (el acierto del complementario y del reintegro hay que tenerlos en cuenta)
        // Definimos variable contador aciertos desde el número 0 (posteriormente se actualizará)
        int aciertos = 0;


        // Necesitamos comprobar 2 boletos: el nuestro y el de la máquina, por ello nos hace falta 2 búcles for, cada uno para su
        // respectivo vector (numerosUsuario y boletoMaquina). Por cada posición de los números del usuario, comprobaremos cada valor
        // del boleto de la máquina. Hay que matizar que el bucle del numeroUsuario llega hasta i < numerosUsuario.length-1; ya que no
        // tenemos en cuenta el reintegro. Si encontramos en alguna posición que los números de los boletos coincides, sumaremos 1 acierto
        // a la variable aciertos definida anteriormente.
        for (int i = 0; i < numerosUsuario.length-1; i++){
            for (int j = 0; j < boletoMaquina.length; j++){
                if (numerosUsuario[i] == boletoMaquina[j]) {
                    aciertos++;
                }
            }
        }


        // Comprobamos que este el reintegro acertado. Para ello definimos un booleano reintegroAcertado y un contador específico
        // aciertoReintegro que se actualizarán a true y a 1 respectivamente si (if) el valor del boleto del usuario en la posición 6 (reintegro) es
        // igual que el reintegro del boleto de la máquina
        boolean reintegroAcertado = false;
        int aciertoReintegro = 0;
        if (numerosUsuario[6] == reintegro){
            aciertoReintegro = 1;
            reintegroAcertado = true;
        }


        // Comprobamos que este el complementario acertado. Para ello definimos un booleano complementarioAcertado y un contador específico
        // aciertoComplementario que se actualizarán a true y a 1 respectivamente si (if) alguno de los valores del boleto del usuario recorridos
        // con el bucle for hasta la posición que no incluye el reintegro (i < numerosUsuario.length-1;) coincide con el complementario que ha salido
        // en el boleto de la máquina
        int aciertoComplementario = 0;
        boolean complementarioAcertado = false;
        for (int i = 0; i < numerosUsuario.length-1; i++){
            if (numerosUsuario[i] == complementario){
                aciertoComplementario = 1;
                complementarioAcertado = true;
                break;
            }
        }

        System.out.println("\nRESULTADOS:");


        // Definimos la lógica de los premios, con if-else-if para decidir qué mensaje de premio mostrar
        // Para ello nos hacen falta los booleanos y contadores individuales del reintegro y del complementario.
        // En función de los aciertos que hayamos tenido y de, si alguno de esos aciertos es de un número complementario
        // o del reintegro, mostraremos en pantalla la categoría de premio a mostrar con el número de aciertos en caso de
        // haber acertado algo. Si no hemos acertado nada el programa mostrará: "No premiado. No ha habido suerte..."
        if (aciertos == 6 && reintegroAcertado){
            System.out.println((aciertos+aciertoReintegro) + " Aciertos.");
            System.out.println("¡Categoría Especial!");
        } else if (aciertos == 6) {
            System.out.println(aciertos + " Aciertos.");
            System.out.println("¡1ª Categoría!");
        } else if (aciertos == 5 && complementarioAcertado) {
            System.out.println((aciertos + aciertoComplementario) + " Aciertos.");
            System.out.println("¡2ª Categoría!");
        } else if (aciertos == 5) {
            System.out.println(aciertos + " Aciertos.");
            System.out.println("¡3ª Categoría!");
        } else if (aciertos == 4) {
            System.out.println(aciertos + " Aciertos.");
            System.out.println("¡4ª Categoría!");
        } else if (aciertos == 3) {
            System.out.println(aciertos + " Aciertos.");
            System.out.println("¡5ª Categoría!");
        } else if (reintegroAcertado) {
            System.out.println(aciertoReintegro + " Aciertos.");
            System.out.println("Reintegro");
        } else {
            System.out.println("No premiado. No ha habido suerte...");
        }
    }

    public void practicaSopaDeLetras(){

        Scanner entrada = new Scanner(System.in);
        boolean comprobador = true;
        int nFilas = 0;
        int nColumnas = 0;

        while (comprobador) {
            try {
                System.out.print("Introduce el número de filas: ");
                nFilas = entrada.nextInt();

                System.out.print("Introduce el número de columnas: ");
                nColumnas = entrada.nextInt();

                if (nFilas > 0 && nColumnas > 0){
                    comprobador = false;
                }else {
                    System.out.println("ERROR. debes introducir un número positivo mayor que 0");
                }

            } catch (InputMismatchException e) {
                System.out.println("ERROR. Debes introducir un número" + e.getMessage());
                entrada.next();
            }
        }

        String matriz[][] = new String[nFilas][nColumnas];
        String[] filaLetras;

        for (int i = 0; i < matriz.length; i++) {
            System.out.print("Ingresa las letras de la fila " + (i + 1) + ": ");
            filaLetras = entrada.next().split("");

            for (int j = 0; j < nColumnas; j++) {
                if (filaLetras.length < nColumnas || filaLetras.length > nColumnas) {
                    System.out.println("ERROR. Debes de introducir " + nColumnas + " letras por fila sin espacios ni separadores");
                    return;
                }else if (!filaLetras[j].matches("[a-zA-Z]+")){
                    System.out.println("ERROR. Debes de introducir caracteres, NO NUMEROS.");
                    return;
                }else {
                    matriz[i][j] = filaLetras[j];
                }
            }
        }

        for (String fila[] : matriz){
            for (String columna : fila){
                System.out.print(columna + " ");
            }
            System.out.println();
        }

        String palabraBuscar = "";
        comprobador = true;

        while (comprobador) {
            System.out.print("Introduce una palabra a buscar: ");
            palabraBuscar = entrada.next();

            if (palabraBuscar.matches("[a-zA-Z]+") && palabraBuscar.length() <= nColumnas && palabraBuscar.length() > 0) {
                comprobador = false;
            } else {
                System.out.println("ERROR. La palabra sólo puede contener letras mayúsculas y minúsculas, sin separadores y con una longitud menor o igual a " + nColumnas);
            }
        }

        String palabraBuscarVector[] = new String [palabraBuscar.length()];
        for (int i = 0; i < palabraBuscar.length(); i++) {
            palabraBuscarVector[i] = palabraBuscar.substring(i, i+1);
        }

        System.out.println(Arrays.toString(palabraBuscarVector));

        int posicionFila = 0;
        int posicionColumna = 0;
        boolean palabraEncontrada = false;

        bucle1:
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {

                // Comprobar horizontalmente
                if (j <= matriz[i].length - palabraBuscarVector.length) {
                    boolean coincide = true;
                    for (int k = 0; k < palabraBuscarVector.length; k++) {
                        if (matriz[i][j + k] != palabraBuscarVector[k]) {
                            coincide = false;
                            break;
                        }
                    }
                    if (coincide) {
                        posicionFila = i;
                        posicionColumna = j;
                        palabraEncontrada = true;
                        break bucle1;
                    }
                }

                // Comprobar verticalmente
                if (i <= matriz.length - palabraBuscarVector.length) {
                    boolean coincide = true;
                    for (int k = 0; k < palabraBuscarVector.length; k++) {
                        if (matriz[i + k][j] != palabraBuscarVector[k]) {
                            coincide = false;
                            break;
                        }
                    }
                    if (coincide) {
                        posicionFila = i;
                        posicionColumna = j;
                        palabraEncontrada = true;
                        break bucle1;
                    }
                }
            }
        }

        // Mostrar resultado
        if (palabraEncontrada) {
            System.out.println("La palabra comienza en la posición: " + posicionFila + " " + posicionColumna);
        } else {
            System.out.println("La palabra no se encontró.");
        }
    }
}
