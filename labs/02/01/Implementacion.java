
import java.util.Scanner;


public class Implementacion {
  
  public static void main(String args[]) {
    Scanner sc = new Scanner(System.in);
    int m;

    do {
      System.out.print("Seleccione una opción: ");
      System.out.println("1. Suma de matrices");
      System.out.println("2. Producto de matrices");
      System.out.println("3. Salir");
      
      m = sc.nextInt();

      switch (m) {
        case 1:
          int filas, cols;
          System.out.println("Ingrese el numero de filas y columnas :");
          filas = (int) Captura.nextDouble("Filas: ");
          cols = (int) Captura.nextDouble("Columnas: ");

          double[][] matA = Captura.readMat(filas, cols);
          double[][] matB = Captura.readMat(filas, cols);

          double[][] sumaResult = Operacion.suma(matA, matB);

          System.out.println("La suma de las matrices es:");
          for (int i = 0; i < filas; i++) {
            for (int j = 0; j < cols; j++) {
              System.out.print(sumaResult[i][j] + " ");
            }
            System.out.println();
          }
          break;

        case 2:
          System.out.println("Ingrese las dimensiones de las matrices:");
          int filasA, colsA, filasB, colsB;
          filasA = (int) Captura.nextDouble("Ingrese filas de la primera matriz: ");
          colsA = (int) Captura.nextDouble("Ingrese columnas de la primera matriz: ");
          filasB = (int) Captura.nextDouble("Ingrese filas de la segunda matriz: ");
          colsB = (int) Captura.nextDouble("Ingrese columnas de la segunda matriz: ");

          double [][]matA = Captura.readMat(filasA, colsA);
          double[][] matB = Captura.readMat(filasB, colsB);

          try {
            double[][] productoResult = Operacion.producto(matA, matB);

            System.out.println("El producto de las matrices es:");
            for (int i = 0; i < filasB; i++) {
              for (int j = 0; j < colsB; j++) {
                System.out.print(productoResult[i][j] + " ");
              }
              System.out.println();
            }
          } catch (IllegalArgumentException e) {
            System.out.println("Error: " + e.getMessage());
          }
          break;


      }
    } while (m!= 3);
  }
}
    

