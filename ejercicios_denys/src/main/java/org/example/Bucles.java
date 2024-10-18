package org.example;

import java.util.Scanner;

public class Bucles {

    public void ejercicios1() {

        Scanner entrada = new Scanner(System.in);

        String psw = "entornos";
        String psw_usuario;

        do {

            System.out.println("Introduce tu contraseña: ");
            psw_usuario = entrada.next();

        } while (!psw_usuario.equals(psw));
    }

    public void ejercicios2() {

        Scanner entrada = new Scanner(System.in);

        System.out.println("Introduce un número...");
        int num = entrada.nextInt();

        for (int i = num; i >= 1; i--) {

            if (i % 2 == 0) {
                System.out.println(i);
            }
        }
    }
}
