
public class Operacion {
    
public static double[][] suma(double [][]matA, double [][] matB) {
    
    int filasA = matA.length;
    int colsA = matA[0].length;
    
    double[][] matR = new double[filasA][colsA];
    
    int filasB=matB.length;
    int colsB=matB[0].length;
    
   
        for (int i = 0; i < filasA; i++) {
            for (int j = 0; j < colsA; j++){}; 
                }

  
        for (int i = 0; i < filasB; i++) {
            for (int j = 0; j < colsB; j++){};
                }

        for (int i = 0; i < filasA; i++) {
            for (int j = 0; j < colsA; j++) {
                matR[i][j] = matA[i][j] + matB[i][j];
            }}

     return matR;
}
 public static double[][] producto(double[][] matA, double[][] matB) {
    int filasA = matA.length;
    int colsA = matA[0].length;
    int filasB = matB.length;
    int colsB = matB[0].length;

    if (colsA != filasB) {
      throw new IllegalArgumentException("Error");
    }

    double[][] matR = new double[filasA][colsB];

    for (int i = 0; i < filasA; i++) {
      for (int j = 0; j < colsB; j++) {
        for (int k = 0; k < colsA; k++) {
          matR[i][j] += matA[i][k] * matB[k][j];
        }
      }
    }

    return matR;
  }
}

    
