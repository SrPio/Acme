package AdminPack.vista;

public class Regis_secre02 extends javax.swing.JFrame {

    public Regis_secre02() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panelRegisSecre02 = new javax.swing.JPanel();
        jLabel7 = new javax.swing.JLabel();
        fieldDi = new javax.swing.JTextField();
        fieldDi1 = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        B_Agre_cita = new javax.swing.JButton();
        jLabel11 = new javax.swing.JLabel();
        jComboBox1 = new javax.swing.JComboBox<>();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        panelRegisSecre02.setBackground(new java.awt.Color(255, 255, 255));
        panelRegisSecre02.setPreferredSize(new java.awt.Dimension(780, 570));

        jLabel7.setFont(new java.awt.Font("Bahnschrift", 0, 14)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(51, 51, 51));
        jLabel7.setText("USUARIO :");

        fieldDi.setBackground(new java.awt.Color(229, 229, 229));
        fieldDi.setFont(new java.awt.Font("Bahnschrift", 0, 14)); // NOI18N
        fieldDi.setBorder(null);
        fieldDi.setPreferredSize(new java.awt.Dimension(59, 32));

        fieldDi1.setBackground(new java.awt.Color(229, 229, 229));
        fieldDi1.setFont(new java.awt.Font("Bahnschrift", 0, 14)); // NOI18N
        fieldDi1.setBorder(null);
        fieldDi1.setPreferredSize(new java.awt.Dimension(59, 32));

        jLabel8.setFont(new java.awt.Font("Bahnschrift", 0, 14)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(51, 51, 51));
        jLabel8.setText("CONTRASEÑA :");

        jLabel9.setFont(new java.awt.Font("Bahnschrift", 0, 14)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(51, 51, 51));
        jLabel9.setText("ESTADO :");

        B_Agre_cita.setBackground(new java.awt.Color(255, 255, 255));
        B_Agre_cita.setFont(new java.awt.Font("Bahnschrift", 0, 18)); // NOI18N
        B_Agre_cita.setForeground(new java.awt.Color(255, 255, 255));
        B_Agre_cita.setIcon(new javax.swing.ImageIcon(getClass().getResource("/acme/Images/Boton_morado2.png"))); // NOI18N
        B_Agre_cita.setText("REGISTRAR");
        B_Agre_cita.setBorderPainted(false);
        B_Agre_cita.setContentAreaFilled(false);
        B_Agre_cita.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        B_Agre_cita.setFocusPainted(false);
        B_Agre_cita.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        jLabel11.setFont(new java.awt.Font("Bahnschrift", 0, 18)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(51, 51, 51));
        jLabel11.setText("SECRETARIO");

        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        javax.swing.GroupLayout panelRegisSecre02Layout = new javax.swing.GroupLayout(panelRegisSecre02);
        panelRegisSecre02.setLayout(panelRegisSecre02Layout);
        panelRegisSecre02Layout.setHorizontalGroup(
            panelRegisSecre02Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelRegisSecre02Layout.createSequentialGroup()
                .addGap(312, 312, 312)
                .addComponent(jLabel11))
            .addGroup(panelRegisSecre02Layout.createSequentialGroup()
                .addGap(90, 90, 90)
                .addComponent(jLabel7)
                .addGap(17, 17, 17)
                .addComponent(fieldDi, javax.swing.GroupLayout.PREFERRED_SIZE, 158, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(66, 66, 66)
                .addComponent(jLabel8)
                .addGap(18, 18, 18)
                .addComponent(fieldDi1, javax.swing.GroupLayout.PREFERRED_SIZE, 158, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(panelRegisSecre02Layout.createSequentialGroup()
                .addGap(90, 90, 90)
                .addComponent(jLabel9)
                .addGap(22, 22, 22)
                .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(panelRegisSecre02Layout.createSequentialGroup()
                .addGap(520, 520, 520)
                .addComponent(B_Agre_cita, javax.swing.GroupLayout.PREFERRED_SIZE, 249, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        panelRegisSecre02Layout.setVerticalGroup(
            panelRegisSecre02Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelRegisSecre02Layout.createSequentialGroup()
                .addGap(56, 56, 56)
                .addComponent(jLabel11)
                .addGap(72, 72, 72)
                .addGroup(panelRegisSecre02Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelRegisSecre02Layout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addComponent(jLabel7))
                    .addComponent(fieldDi, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(panelRegisSecre02Layout.createSequentialGroup()
                        .addGap(7, 7, 7)
                        .addComponent(jLabel8))
                    .addComponent(fieldDi1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(panelRegisSecre02Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel9)
                    .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(248, 248, 248)
                .addComponent(B_Agre_cita, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panelRegisSecre02, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panelRegisSecre02, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    public static void main(String args[]) {
        
        Regis_secre02 RegisSecre02 = new Regis_secre02();
        RegisSecre02.setBounds(0, 0, 780, 570);
        RegisSecre02.setVisible(true);
        RegisSecre02.setResizable(false);
        RegisSecre02.setLocationRelativeTo(null);
        
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
              //  new Vent_procedi().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton B_Agre_cita;
    private javax.swing.JTextField fieldDi;
    private javax.swing.JTextField fieldDi1;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    public static javax.swing.JPanel panelRegisSecre02;
    // End of variables declaration//GEN-END:variables
}