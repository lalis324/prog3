 import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class semaforo extends JFrame {
     
    private int botonPrioritario=0;
    private int estadoActual = 0;
    private int Verde = 10;
    private int Amarillo = 10;
    private int Rojo = 10;
    private int tRestante = Verde;
    private int tAdicionalRojo = 0;
    private boolean peatonCruzando = false;

    public semaforo() {

        semaforo= new JLabel(new );
        tRestante = new JLabel();
        Verde = new JLabel();
        Amarillo = new JLabel();
        Rojo = new JLabel();
        botonPrioritario = new JButton();

        peatonPanel = new JPanel();
        peatonPanel.setLayout(new FlowLayout());
        peatonPanel.add(peatonLabel);
        peatonPanel.setVisible(false);

        

        timer = new Timer(1000, new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                tRestante--;

                if (tRestante <= 0) {
                    if (estadoActual == 0) {
                        estadoActual = 1;
                        tRestante = Amarillo;
                    } else if (estadoActual == 1) {
                        estadoActual = 2;
                        tRestante = Rojo + tAdicionalRojo;
                        peatonCruzando = true;
                        peatonPanel.setVisible(true);
                    } else {
                        estadoActual = 0;
                        tRestante = Verde;
                        peatonCruzando = false;
                        peatonPanel.setVisible(false);
                    }
                }


            }
        });

        botonPrioritario.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                if (estadoActual == 2 && tRestante > Rojo) {
                    tAdicionalRojo += 5;
                    tRestante += 5;
                   
                }
            }
        });

        timer.start();
    }

    private String obtenerImagenSemaforo(int estado) {
        switch (estado) {
            case 0:
                return "verde.png";
            case 1:
                return "amarillo.png";
            case 2:
                return "rojo.png";
            default:
                return "";
        }
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                semaforo semaforo = new semaforo();
                semaforo.setVisible(true);
            }
        });
    }
}

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 400, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 300, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    /**
     * @param args the command line arguments
     */
   

    // Variables declaration - do not modify//GEN-BEGIN:variables
    // End of variables declaration//GEN-END:variables
}
