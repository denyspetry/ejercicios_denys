package org.example;

import java.util.*;

public class EjerciciosDePruebaVarios {

    public void fobonacci() {

        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingresa la cantidad de números de Fibonacci a mostrar: ");
        int n = scanner.nextInt();
        int a = 0, b = 1, c;
        System.out.print("Serie de Fibonacci: " + a + " " + b);

        for (int i = 2; i < n; i++) {
            c = a + b;
            System.out.print(" " + c);
            a = b;
            b = c;
        }
        System.out.println();

    }

    public void Pares1N() {

        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingresa un número: ");
        int n = scanner.nextInt();
        System.out.println("Números pares de 1 a " + n + ":");
        for (int i = 1; i <= n; i++) {
            if (i % 2 == 0) {
                System.out.println(i);

            }
        }
    }

    public void multiplos() {

        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingresa un número: ");
        int n = scanner.nextInt();
        int suma = 0;

        for (int i = 1; i <= n; i++) {
            if (i % 3 == 0 || i % 5 == 0) {
                suma += i;
            }
        }

        System.out.println("La suma de todos los múltiplos de 3 y 5 hasta " + n + " es: " + suma);

    }

    public void conteodigitos() {

        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingresa un número: ");
        int numero = scanner.nextInt();
        int contador = 0;

        for (int temp = Math.abs(numero); temp > 0; temp /= 10) {
            contador++;
        }

        System.out.println("El número tiene " + contador + " dígitos.");

    }

    public void numeroprimo() {

        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingresa un número: ");
        int numero = scanner.nextInt();
        boolean esPrimo = true;

        if (numero <= 1) {
            esPrimo = false;
        } else {
            for (int i = 2; i <= Math.sqrt(numero); i++) {
                if (numero % i == 0) {
                    esPrimo = false;
                    break;
                }
            }
        }

        if (esPrimo) {
            System.out.println(numero + " es un número primo.");
        } else {
            System.out.println(numero + " no es un número primo.");
        }

    }

    public void trianguloasteriscos() {

        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingresa el número de filas: ");
        int n = scanner.nextInt();

        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }

    }

    public void numeropalindromo() {

        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingresa un número: ");
        int numero = scanner.nextInt();
        int original = numero;
        int invertido = 0;

        while (numero > 0) {
            invertido = invertido * 10 + numero % 10;
            numero /= 10;
        }

        if (original == invertido) {
            System.out.println(original + " es un número palíndromo.");
        } else {
            System.out.println(original + " no es un número palíndromo.");
        }

    }

    public void adivinanza() {

        Random random = new Random();
        Scanner scanner = new Scanner(System.in);

        int numeroAleatorio = random.nextInt(50) + 1; // Número entre 1 y 50
        int intento;

        System.out.println("¡Adivina el número entre 1 y 50!");

        do {
            System.out.print("Ingresa tu intento: ");
            intento = scanner.nextInt();

            if (intento < numeroAleatorio) {
                System.out.println("El número es mayor.");
            } else if (intento > numeroAleatorio) {
                System.out.println("El número es menor.");
            } else {
                System.out.println("¡Correcto! Has adivinado el número.");
            }
        } while (intento != numeroAleatorio);

    }

    public void sorteonombres() {

        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        ArrayList<String> nombres = new ArrayList<>();

        System.out.println("Introduce nombres para el sorteo. Escribe 'fin' para terminar.");
        while (true) {
            System.out.print("Nombre: ");
            String nombre = scanner.nextLine();
            if (nombre.equalsIgnoreCase("fin")) {
                break;
            }
            nombres.add(nombre);
        }

        if (!nombres.isEmpty()) {
            int indiceGanador = random.nextInt(nombres.size());
            System.out.println("El ganador del sorteo es: " + nombres.get(indiceGanador));
        } else {
            System.out.println("No se introdujeron nombres para el sorteo.");
        }

    }

    public void adivinanzaintentos() {

        Random random = new Random();
        Scanner scanner = new Scanner(System.in);

        int numeroObjetivo = random.nextInt(1000) + 1;
        int intentosRestantes = 7;
        boolean adivinado = false;

        System.out.println("¡Adivina el número entre 1 y 1000! Tienes 7 intentos.");

        while (intentosRestantes > 0 && !adivinado) {
            System.out.print("Ingresa tu intento: ");
            int intento = scanner.nextInt();

            if (intento == numeroObjetivo) {
                System.out.println("¡Correcto! Has adivinado el número.");
                adivinado = true;
            } else if (intento < numeroObjetivo) {
                System.out.println("El número es mayor.");
            } else {
                System.out.println("El número es menor.");
            }
            intentosRestantes--;

            if (intentosRestantes > 0 && !adivinado) {
                System.out.println("Te quedan " + intentosRestantes + " intentos.");
            }
        }

        if (!adivinado) {
            System.out.println("Lo siento, has perdido. El número era " + numeroObjetivo + ".");
        }

    }

    public void contraseñasseguras() {

        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        String mayusculas = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
        String minusculas = "abcdefghijklmnopqrstuvwxyz";
        String numeros = "0123456789";
        String simbolos = "!@#$%^&*()-_=+";
        String todosCaracteres = mayusculas + minusculas + numeros + simbolos;

        System.out.print("Ingresa la longitud de la contraseña (entre 8 y 16): ");
        int longitud = scanner.nextInt();

        if (longitud < 8 || longitud > 16) {
            System.out.println("Longitud inválida. Debe estar entre 8 y 16.");
            return;
        }

        StringBuilder contrasena = new StringBuilder(longitud);

        contrasena.append(mayusculas.charAt(random.nextInt(mayusculas.length())));
        contrasena.append(minusculas.charAt(random.nextInt(minusculas.length())));
        contrasena.append(numeros.charAt(random.nextInt(numeros.length())));
        contrasena.append(simbolos.charAt(random.nextInt(simbolos.length())));

        for (int i = 4; i < longitud; i++) {
            contrasena.append(todosCaracteres.charAt(random.nextInt(todosCaracteres.length())));
        }

        System.out.println("Contraseña generada: " + contrasena);

    }

    public void piedrapapeltijera() {

        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        int victorias = 0;
        int derrotas = 0;
        int empates = 0;
        boolean continuar = true;

        while (continuar) {
            System.out.print("Elige Piedra (1), Papel (2) o Tijeras (3): ");
            int eleccionUsuario = scanner.nextInt();
            int eleccionComputadora = random.nextInt(3) + 1;

            if (eleccionUsuario == eleccionComputadora) {
                empates++;
                System.out.println("Empate!");
            } else if ((eleccionUsuario == 1 && eleccionComputadora == 3) ||
                    (eleccionUsuario == 2 && eleccionComputadora == 1) ||
                    (eleccionUsuario == 3 && eleccionComputadora == 2)) {
                victorias++;
                System.out.println("Ganaste esta ronda!");
            } else {
                derrotas++;
                System.out.println("Perdiste esta ronda.");
            }

            System.out.print("¿Quieres jugar otra ronda? (s/n): ");
            continuar = scanner.next().equalsIgnoreCase("s");
        }

        System.out.println("Resumen del juego:");
        System.out.println("Victorias: " + victorias);
        System.out.println("Derrotas: " + derrotas);
        System.out.println("Empates: " + empates);

    }

    public void piramidenumeros() {

        Scanner scanner = new Scanner(System.in);
        System.out.print("Introduce el número de niveles para la pirámide: ");
        int n = scanner.nextInt();

        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(j + " ");
            }
            System.out.println();
        }

    }

    public void numeromedio() {

        Scanner scanner = new Scanner(System.in);
        System.out.print("Introduce el primer número: ");
        int num1 = scanner.nextInt();
        System.out.print("Introduce el segundo número: ");
        int num2 = scanner.nextInt();
        System.out.print("Introduce el tercer número: ");
        int num3 = scanner.nextInt();

        int medio = (num1 > num2 && num1 < num3) || (num1 < num2 && num1 > num3) ? num1 :
                (num2 > num1 && num2 < num3) || (num2 < num1 && num2 > num3) ? num2 : num3;

        System.out.println("El número medio es: " + medio);

    }

    public void iva() {

        Scanner scanner = new Scanner(System.in);
        System.out.print("Introduce el precio del producto: ");
        double precio = scanner.nextDouble();
        System.out.print("Introduce el tipo de IVA (1 para 4%, 2 para 21%): ");
        int tipoIVA = scanner.nextInt();

        double precioFinal = tipoIVA == 1 ? precio * 1.04 : precio * 1.21;
        System.out.printf("El precio final con IVA es: %.2f%n", precioFinal);

    }

    public void gestionnotas() {

        Scanner scanner = new Scanner(System.in);
        System.out.print("¿Cuántas asignaturas tiene el estudiante? ");
        int cantidadAsignaturas = scanner.nextInt();
        double[] notas = new double[cantidadAsignaturas];
        double suma = 0;

        for (int i = 0; i < cantidadAsignaturas; i++) {
            System.out.print("Introduce la nota de la asignatura " + (i + 1) + ": ");
            notas[i] = scanner.nextDouble();
            suma += notas[i];
        }

        double promedio = suma / cantidadAsignaturas;
        String calificacion;

        if (promedio >= 90) {
            calificacion = "A";
        } else if (promedio >= 80) {
            calificacion = "B";
        } else if (promedio >= 70) {
            calificacion = "C";
        } else if (promedio >= 60) {
            calificacion = "D";
        } else {
            calificacion = "F";
        }

        System.out.printf("Promedio: %.2f%n", promedio);
        System.out.println("Calificación final: " + calificacion);
        System.out.println(promedio >= 60 ? "El estudiante ha aprobado." : "El estudiante no ha aprobado.");

    }

    public void calculasalario() {

        Scanner scanner = new Scanner(System.in);
        System.out.print("Introduce el salario bruto: ");
        double salarioBruto = scanner.nextDouble();
        System.out.print("Introduce el estado civil (soltero/casado): ");
        String estadoCivil = scanner.next();

        double impuestos;
        if (estadoCivil.equalsIgnoreCase("soltero")) {
            impuestos = 0.20;
        } else if (estadoCivil.equalsIgnoreCase("casado")) {
            impuestos = 0.15;
        } else {
            System.out.println("Estado civil no válido.");
            return;
        }

        if (salarioBruto > 50000) {
            impuestos += 0.05; // Aumentar el impuesto en 5% adicional
        }

        double salarioNeto = salarioBruto * (1 - impuestos);
        System.out.printf("El salario neto es: %.2f%n", salarioNeto);

    }

    public void recomendadorlibros() {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Selecciona un género:");
        System.out.println("1. Ficción");
        System.out.println("2. No Ficción");
        System.out.println("3. Ciencia");
        System.out.println("4. Fantasía");
        int genero = scanner.nextInt();

        System.out.print("¿Cuántas páginas deseas? (1: menos de 100, 2: entre 100 y 300, 3: más de 300): ");
        int paginas = scanner.nextInt();

        String libro = "";

        if (genero == 1) { // Ficción
            if (paginas == 1) {
                libro = "El Principito";
            } else if (paginas == 2) {
                libro = "Cien Años de Soledad";
            } else {
                libro = "La sombra del viento";
            }
        } else if (genero == 2) { // No Ficción
            if (paginas == 1) {
                libro = "El arte de la guerra";
            } else if (paginas == 2) {
                libro = "Sapiens: De animales a dioses";
            } else {
                libro = "El capital en el siglo XXI";
            }
        } else if (genero == 3) { // Ciencia
            if (paginas == 1) {
                libro = "Breves respuestas a las grandes preguntas";
            } else if (paginas == 2) {
                libro = "La teoría del todo";
            } else {
                libro = "Cosmos";
            }
        } else if (genero == 4) { // Fantasía
            if (paginas == 1) {
                libro = "Harry Potter y la piedra filosofal";
            } else if (paginas == 2) {
                libro = "El Hobbit";
            } else {
                libro = "El nombre del viento";
            }
        } else {
            System.out.println("Género no válido.");
            return;
        }

        System.out.println("Te recomendamos: " + libro);

    }

    public void conversorunidades() {

        Scanner scanner = new Scanner(System.in);
        boolean continuar = true;

        while (continuar) {
            System.out.println("Elige la conversión:");
            System.out.println("1. Longitud (metros a kilómetros / kilómetros a metros)");
            System.out.println("2. Peso (kilogramos a libras / libras a kilogramos)");
            System.out.println("3. Temperatura (Celsius a Fahrenheit / Fahrenheit a Celsius)");
            System.out.println("4. Salir");
            int opcion = scanner.nextInt();

            switch (opcion) {
                case 1: // Longitud
                    System.out.print("¿Quieres convertir de metros a kilómetros (1) o de kilómetros a metros (2)? ");
                    int tipoLongitud = scanner.nextInt();
                    if (tipoLongitud == 1) {
                        System.out.print("Introduce los metros: ");
                        double metros = scanner.nextDouble();
                        double kilometros = metros / 1000;
                        System.out.printf("%.2f metros son %.2f kilómetros.%n", metros, kilometros);
                    } else if (tipoLongitud == 2) {
                        System.out.print("Introduce los kilómetros: ");
                        double kilometros = scanner.nextDouble();
                        double metros = kilometros * 1000;
                        System.out.printf("%.2f kilómetros son %.2f metros.%n", kilometros, metros);
                    } else {
                        System.out.println("Opción no válida.");
                    }
                    break;

                case 2: // Peso
                    System.out.print("¿Quieres convertir de kilogramos a libras (1) o de libras a kilogramos (2)? ");
                    int tipoPeso = scanner.nextInt();
                    if (tipoPeso == 1) {
                        System.out.print("Introduce los kilogramos: ");
                        double kilogramos = scanner.nextDouble();
                        double libras = kilogramos * 2.20462;
                        System.out.printf("%.2f kilogramos son %.2f libras.%n", kilogramos, libras);
                    } else if (tipoPeso == 2) {
                        System.out.print("Introduce las libras: ");
                        double libras = scanner.nextDouble();
                        double kilogramos = libras / 2.20462;
                        System.out.printf("%.2f libras son %.2f kilogramos.%n", libras, kilogramos);
                    }
                    break;

                case 3: // Temperatura
                    System.out.print("¿Quieres convertir de Celsius a Fahrenheit (1) o de Fahrenheit a Celsius (2)? ");
                    int tipoTemperatura = scanner.nextInt();
                    if (tipoTemperatura == 1) {
                        System.out.print("Introduce los grados Celsius: ");
                        double celsius = scanner.nextDouble();
                        double fahrenheit = (celsius * 9 / 5) + 32;
                        System.out.printf("%.2f grados Celsius son %.2f grados Fahrenheit.%n", celsius, fahrenheit);
                    } else if (tipoTemperatura == 2) {
                        System.out.print("Introduce los grados Fahrenheit: ");
                        double fahrenheit = scanner.nextDouble();
                        double celsius = (fahrenheit - 32) * 5 / 9;
                        System.out.printf("%.2f grados Fahrenheit son %.2f grados Celsius.%n", fahrenheit, celsius);
                    } else {
                        System.out.println("Opción no válida.");
                    }
                    break;

                case 4:
                    continuar = false;
                    System.out.println("Saliendo del programa.");
                    break;

                default:
                    System.out.println("Opción no válida.");
            }
        }
    }

    public void contadorvocalesconsonantes() {

        Scanner scanner = new Scanner(System.in);
        System.out.print("Introduce una frase: ");
        String frase = scanner.nextLine();
        int contadorVocales = 0;
        int contadorConsonantes = 0;

        for (int i = 0; i < frase.length(); i++) {
            char caracter = Character.toLowerCase(frase.charAt(i));
            if (Character.isLetter(caracter)) {
                if ("aeiou".indexOf(caracter) != -1) {
                    contadorVocales++;
                } else {
                    contadorConsonantes++;
                }
            }
        }

        System.out.println("Número de vocales: " + contadorVocales);
        System.out.println("Número de consonantes: " + contadorConsonantes);

    }

    public void reemplazopalabras() {

        Scanner scanner = new Scanner(System.in);
        System.out.print("Introduce una frase: ");
        String frase = scanner.nextLine();
        System.out.print("Palabra a reemplazar: ");
        String palabraAntigua = scanner.nextLine();
        System.out.print("Nueva palabra: ");
        String palabraNueva = scanner.nextLine();

        String fraseModificada = frase.replace(palabraAntigua, palabraNueva);
        System.out.println("Frase modificada: " + fraseModificada);

    }

    public void inversioncadenas() {

        Scanner scanner = new Scanner(System.in);
        System.out.print("Introduce una cadena: ");
        String cadena = scanner.nextLine();
        String cadenaInvertida = "";

        for (int i = cadena.length() - 1; i >= 0; i--) {
            cadenaInvertida += cadena.charAt(i);
        }

        System.out.println("Cadena original: " + cadena);
        System.out.println("Cadena invertida: " + cadenaInvertida);

    }

    public void eliminarespacios() {

        Scanner scanner = new Scanner(System.in);
        System.out.print("Introduce una frase con espacios extra: ");
        String frase = scanner.nextLine();
        String fraseSinEspacios = frase.trim().replaceAll("\\s+", " ");

        System.out.println("Frase sin espacios extra: " + fraseSinEspacios);

    }
}

