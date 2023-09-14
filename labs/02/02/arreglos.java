import java.util.Arrays;
import java.util.Random;

public class arreglos {

    public static void main(String[] args) {
        int[] tamaños = {100, 500, 1000, 5000, 10000};
        String[] algoritmos = {"Burbuja", "Inserción", "Selección", "Mergesort"};
        System.out.println("Método\t\t100\t\t500\t\t1000\t\t5000\t\t10000");
   

        for (String algoritmo : algoritmos) {
            System.out.print(algoritmo + "\t\t");
            for (int tamaño : tamaños) {
                double[] arreglo = Aleatorio(tamaño);
                long tiempoInicio = System.nanoTime();
                switch (algoritmo) {
                    case "Burbuja":
                        burbuja(arreglo);
                        break;
                    case "Inserción":
                        insercion(arreglo);
                        break;
                    case "Selección":
                        seleccion(arreglo);
                        break;
                    case "Mergesort":
                        mergesort(arreglo);
                        break;
                }
                long tiempoFin = System.nanoTime();
                long tiempoTotal = tiempoFin - tiempoInicio;
                System.out.print(tiempoTotal + " ns\t");
            }
            System.out.println();
        }
    }

    public static void burbuja(double[] arreglo) {
        int n = arreglo.length;
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                if (arreglo[j] > arreglo[j + 1]) {
                    double temp = arreglo[j];
                    arreglo[j] = arreglo[j + 1];
                    arreglo[j + 1] = temp;
                }
            }
        }
    }

    public static void insercion(double[] arreglo) {
        int n = arreglo.length;
        for (int i = 1; i < n; i++) {
            double actual = arreglo[i];
            int j = i - 1;
            while (j >= 0 && arreglo[j] > actual) {
                arreglo[j + 1] = arreglo[j];
                j--;
            }
            arreglo[j + 1] = actual;
        }
    }

    public static void seleccion(double[] arreglo) {
        int n = arreglo.length;
        for (int i = 0; i < n - 1; i++) {
            int minimoIndice = i;
            for (int j = i + 1; j < n; j++) {
                if (arreglo[j] < arreglo[minimoIndice]) {
                    minimoIndice = j;
                }
            }
            double temp = arreglo[minimoIndice];
            arreglo[minimoIndice] = arreglo[i];
            arreglo[i] = temp;
        }
    }

    public static void mergesort(double[] arreglo) {
        if (arreglo.length <= 1) {
            return;
        }
        int medio = arreglo.length / 2;

    }

    public static void unir(double[] arreglo, double[] izquierda, double[] derecha) {
        int i = 0;
        int j = 0;
        int k = 0;
        while (i < izquierda.length && j < derecha.length) {
            if (izquierda[i] <= derecha[j]) {
                arreglo[k] = izquierda[i];
                i++;
            } else {
                arreglo[k] = derecha[j];
                j++;
            }
            k++;
        }
        while (i < izquierda.length) {
            arreglo[k] = izquierda[i];
            i++;
            k++;
        }
        while (j < derecha.length) {
            arreglo[k] = derecha[j];
            j++;
            k++;
        }
    }

    public static double[] Aleatorio(int tamaño) {
        double[] arreglo = new double[tamaño];
        Random random = new Random();
        for (int i = 0; i < tamaño; i++) {
            arreglo[i] = random.nextDouble();
        }
        return arreglo;
    }
}

