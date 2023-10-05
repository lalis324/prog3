
package com.mycompany.parcial;

import java.util.Scanner;
import java.util.Timer;


public class Parcial {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Timer timer = new Timer();

        // Obtener el número de temporizadores del usuario
        System.out.print("Ingrese el número de temporizadores: ");
        int numeroTemporizadores = scanner.nextInt();
        Temporizador[] temporizadores = new Temporizador[numeroTemporizadores];

        for (int i = 0; i < numeroTemporizadores; i++) {
            System.out.print("Ingrese el tiempo de espera para el temporizador " + (i + 1) + " en milisegundos: ");
            long tiempoEspera = scanner.nextLong();

            temporizadores[i] = new Temporizador("Mensaje del Temporizador " + (i + 1), timer);

            // Programar la ejecución del temporizador
            timer.schedule(temporizadores[i], tiempoEspera, tiempoEspera);
        }

        while (true) {
            System.out.println("\nSeleccione una opción:");
            System.out.println("1. Detener un temporizador");
            System.out.println("2. Reiniciar un temporizador");
            System.out.println("3. Salir");
            int opcion = scanner.nextInt();

            if (opcion == 1) {
                System.out.print("Ingrese el número del temporizador que desea detener: ");
                int numeroTemporizador = scanner.nextInt();
                if (numeroTemporizador >= 1 && numeroTemporizador <= numeroTemporizadores) {
                    temporizadores[numeroTemporizador - 1].detener();
                    System.out.println("Temporizador " + numeroTemporizador + " detenido.");
                } else {
                    System.out.println("Número de temporizador inválido.");
                }
            } else if (opcion == 2) {
                System.out.print("Ingrese el número del temporizador que desea reiniciar: ");
                int numeroTemporizador = scanner.nextInt();
                if (numeroTemporizador >= 1 && numeroTemporizador <= numeroTemporizadores) {
                    System.out.print("Ingrese el nuevo tiempo de espera en milisegundos: ");
                    long nuevoTiempoEspera = scanner.nextLong();
                    temporizadores[numeroTemporizador - 1].reiniciar(nuevoTiempoEspera);
                    System.out.println("Temporizador " + numeroTemporizador + " reiniciado.");
                } else {
                    System.out.println("Número de temporizador inválido.");
                }
            } else if (opcion == 3) {
                // Detener todos los temporizadores y salir del programa
                for (Temporizador temporizador : temporizadores) {
                    temporizador.detener();
                }
                timer.cancel();
                break;
            }
        }
    }
}
