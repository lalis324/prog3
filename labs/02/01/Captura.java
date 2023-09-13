
import java.util.Scanner;



public class Captura {
    
  private static Scanner leer = new Scanner(System.in);

  public static double nextDouble(String message) {
    System.out.print(message);
    return leer.nextDouble();
  }

  public static double[][] readMat(int filas, int cols) {
    double[][] matR = new double[filas][cols];

    for (int i = 0; i < filas; i++) {
      for (int j = 0; j < cols; j++) {
        matR[i][j] = nextDouble("Ingrese el valor que desea ");
      }
    }

    return matR;
  }
}

