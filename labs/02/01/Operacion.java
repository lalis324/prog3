public class Operacion {
public static double[][] suma(double [][]matA, double [][] matB) {
    
    int f = matA.length;
    int c = matA[0].length;
    
    double[][] matR = new double[f][c];
    
    int f1=matB.length;
    int c1=matB[0].length;
    
   
        for (int i = 0; i < f; i++) {
            for (int j = 0; j < c; j++){}; 
                }

  
        for (int i = 0; i < f1; i++) {
            for (int j = 0; j < c1; j++){};
                }

        for (int i = 0; i < f; i++) {
            for (int j = 0; j < c; j++) {
                matR[i][j] = matA[i][j] + matB[i][j];
            }}

     return matR;
}
public static double [][]producto(double [][]matA, double [][]matB) {
    double[][] matR;
   
    
}
