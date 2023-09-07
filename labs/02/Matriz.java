
package matriz;

import java.util.Scanner;


public class Matriz {

   
    public static void main(String[] args) {
        
                 Scanner input = new Scanner(System.in);
                 System.out.println("1. Suma de matrices:");
                 System.out.println("2. Producto de matrices:");

          int op = input.nextInt();

        switch (op) {
            case 1:
                Suma(input);
                break;
                
            case 2:
                Producto(input);
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
        
    public static void Producto(Scanner input) {
              
        System.out.print("Ingrese el número de filas : ");
        int f1 = input.nextInt();
        System.out.print("Ingrese el número de columnas : ");
        int c1 = input.nextInt();
       
        int[][] m1 = new int[f1][c1];
        int[][] m2 = new int[f1][c1];
        int[][] resultado = new int[f1][c1];

        System.out.println("Ingrese la primera matriz:");
        for (int i = 0; i < f1; i++) {
            for (int j = 0; j < c1; j++);
        }

        System.out.println("Ingrese la segunda matriz:");
        for (int i = 0; i < c1; i++) {
            for (int j = 0; j < c1; j++);
        }

            }

    }





