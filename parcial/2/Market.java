import java.util.LinkedList;
import java.util.Queue;
import java.util.Timer;
import java.util.TimerTask;

// Definición de la clase Mercado
class Market {
    private Queue<Integer> estructura = new LinkedList<>(); // la utilizamos para ver la lista compartida
    private int capacidadMax; // definimos la cap. maxima

    // Constructor
    public Market(int capacidadMax) {
        this.capacidadMax = capacidadMax;
    }

    //  productor agregue elementos a la estructura
    public synchronized void producir(int elemento) {
        while (estructura.size() == capacidadMax) { 
            try {
                wait(); // Esperar a que haya espacio disponible
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        estructura.add(elemento); // Agregar el elemento 
        System.out.println("Productor produce: " + elemento); // muestra el mensaje
        mostrarEstado(); // Mostrar el estado actual 
        notifyAll(); // Notifica
    }

    // el consumidor retire elementos de la estructura
    public synchronized int consumir() {
        while (estructura.isEmpty()) { 
            try {
                wait(); // Esperar a que haya elementos disponibles
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        int elemento = estructura.poll(); // Retirar el elemento de la estructura
        System.out.println("Consumidor consume: " + elemento); 
        mostrarEstado(); 
        notifyAll(); 
        return elemento; 
    }
}
