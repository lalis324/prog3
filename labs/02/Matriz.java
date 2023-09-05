
package matriz;

import java.util.Scanner;


public class Matriz {

   
    public static void main(String[] args) {
        
                 Scanner input = new Scanner(System.in);
                 System.out.println("1. Suma de matrices:");
          int op = input.nextInt();

        switch (op) {
            case 1:
                Suma(input);
                break;
         }
    }
    public static void Suma( Scanner input) {
        
        System.out.print("Ingrese numero de filas: ");
        int f = input.nextInt();
        
        System.out.print("Ingrese numero de columnas: ");
        int c = input.nextInt();

        int[][] matriz1 = new int[f][c];
        int[][] matriz2 = new int[f][c];
        int[][] sum = new int[f][c];
        
                System.out.println("Ingrese la primera matriz:");
        for (int i = 0; i < f; i++) {
            for (int j = 0; j < c; j++); 
                }

        System.out.println("Ingrese la segunda matriz:");
        for (int i = 0; i < f; i++) {
            for (int j = 0; j < c; j++);
                }

        for (int i = 0; i < f; i++) {
            for (int j = 0; j < c; j++) {
                sum[i][j] = matriz1[i][j] + matriz2[i][j];
            }
        }
    }
}




