import javax.swing.SwingUtilities;

public class Lab {
    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                semaforo semaforo = new semaforo();
                semaforo.setVisible(true);
            }
        });
    }
}
  