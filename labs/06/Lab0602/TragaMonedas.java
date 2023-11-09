
package tragamonedas;


public class TragaMonedas {


    public static void main(String[] args) {

 class imagenes extends javax.swing.JFrame {

    imagen1 ima1;
    imagen2 ima2;
    imagen3 ima3;

    boolean respuesta1 = false;
    boolean respuesta2 = false;
    boolean respuesta3 = false;

  
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">                          
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        lblPersona2 = new javax.swing.JLabel();
        lblPersona3 = new javax.swing.JLabel();
        lblPersona1 = new javax.swing.JLabel();
        btnDetenerPersona1 = new javax.swing.JButton();
        btnDetenerPersona2 = new javax.swing.JButton();
        btnDetenerPersona3 = new javax.swing.JButton();
        cbDificultad = new javax.swing.JComboBox<String>();
        btnIniciar = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        filler1 = new javax.swing.Box.Filler(new java.awt.Dimension(0, 3), new java.awt.Dimension(0, 3), new java.awt.Dimension(32767, 3));

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Juego de frutas");
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lblPersona2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ImagenesFrutas/1.png"))); // NOI18N
        jPanel1.add(lblPersona2, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 70, 140, -1));

        lblPersona3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ImagenesFrutas/1.png"))); // NOI18N
        jPanel1.add(lblPersona3, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 70, 140, -1));

        lblPersona1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ImagenesFrutas/1.png"))); // NOI18N
        jPanel1.add(lblPersona1, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 70, 145, 150));

        btnDetenerPersona1.setBackground(new java.awt.Color(0, 255, 153));
        btnDetenerPersona1.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        btnDetenerPersona1.setText("Detener");
        btnDetenerPersona1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDetenerPersona1ActionPerformed(evt);
            }
        });
        jPanel1.add(btnDetenerPersona1, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 250, -1, 50));

        btnDetenerPersona2.setBackground(new java.awt.Color(0, 255, 153));
        btnDetenerPersona2.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        btnDetenerPersona2.setText("Detener");
        btnDetenerPersona2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDetenerPersona2ActionPerformed(evt);
            }
        });
        jPanel1.add(btnDetenerPersona2, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 250, -1, 50));

        btnDetenerPersona3.setBackground(new java.awt.Color(0, 255, 153));
        btnDetenerPersona3.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        btnDetenerPersona3.setText("Detener");
        btnDetenerPersona3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDetenerPersona3ActionPerformed(evt);
            }
        });
        jPanel1.add(btnDetenerPersona3, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 250, -1, 50));

        cbDificultad.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        cbDificultad.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Difícil", "Normal", "Fácil" }));
        cbDificultad.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbDificultadActionPerformed(evt);
            }
        });
        jPanel1.add(cbDificultad, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 260, 100, 40));

        btnIniciar.setBackground(new java.awt.Color(204, 0, 204));
        btnIniciar.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        btnIniciar.setText("Iniciar");
        btnIniciar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnIniciarActionPerformed(evt);
            }
        });
        jPanel1.add(btnIniciar, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 200, 120, 50));

        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ImagenesFrutas/Francisco.jpeg"))); // NOI18N
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 60, 110, 130));

        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ImagenesFrutas/DS.png"))); // NOI18N
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 10, -1, 40));

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ImagenesFrutas/bgt.jpg"))); // NOI18N
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 660, 350));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, 350));
        getContentPane().add(filler1, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 340, 20, -1));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>                        

    private void btnIniciarActionPerformed(java.awt.event.ActionEvent evt) {                                           
      
        int tiempoSegundos = 0;
        switch (cbDificultad.getSelectedIndex()) {
            case 0:
                tiempoSegundos = 0;
                break;
            case 1:
                tiempoSegundos = 300;
                break;
            case 2:
                tiempoSegundos = 600;
                break;
            default:
                tiempoSegundos = 0;
        }
        ima1 = new imagen1(tiempoSegundos);
        ima2 = new imagen2(tiempoSegundos);
        ima3 = new imagen3(tiempoSegundos);
        respuesta1 = false;
        respuesta2 = false;
        respuesta3 = false;
        btnIniciar.setEnabled(false);
        ima1.start();
        ima2.start();
        ima3.start();
    }                                          

  