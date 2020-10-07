package AdminPack.vista;

public class Regis_odont02 extends javax.swing.JFrame {

    public Regis_odont02() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panelRegisOdonto02 = new javax.swing.JPanel();
        jLabel7 = new javax.swing.JLabel();
        fieldDi = new javax.swing.JTextField();
        fieldDi1 = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        B_Agre_cita = new javax.swing.JButton();
        jLabel11 = new javax.swing.JLabel();
        jComboBox1 = new javax.swing.JComboBox<>();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        panelRegisOdonto02.setBackground(new java.awt.Color(255, 255, 255));
        panelRegisOdonto02.setPreferredSize(new java.awt.Dimension(780, 570));
        panelRegisOdonto02.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel7.setFont(new java.awt.Font("Bahnschrift", 0, 14)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(51, 51, 51));
        jLabel7.setText("USUARIO :");
        panelRegisOdonto02.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 160, -1, -1));

        fieldDi.setBackground(new java.awt.Color(229, 229, 229));
        fieldDi.setFont(new java.awt.Font("Bahnschrift", 0, 14)); // NOI18N
        fieldDi.setBorder(null);
        fieldDi.setPreferredSize(new java.awt.Dimension(59, 32));
        panelRegisOdonto02.add(fieldDi, new org.netbeans.lib.awtextra.AbsoluteConstraints(172, 150, 158, -1));

        fieldDi1.setBackground(new java.awt.Color(229, 229, 229));
        fieldDi1.setFont(new java.awt.Font("Bahnschrift", 0, 14)); // NOI18N
        fieldDi1.setBorder(null);
        fieldDi1.setPreferredSize(new java.awt.Dimension(59, 32));
        panelRegisOdonto02.add(fieldDi1, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 150, 158, -1));

        jLabel8.setFont(new java.awt.Font("Bahnschrift", 0, 14)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(51, 51, 51));
        jLabel8.setText("CONTRASEÑA :");
        panelRegisOdonto02.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(396, 157, -1, -1));

        jLabel9.setFont(new java.awt.Font("Bahnschrift", 0, 14)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(51, 51, 51));
        jLabel9.setText("ESTADO :");
        panelRegisOdonto02.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 200, -1, -1));

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
        panelRegisOdonto02.add(B_Agre_cita, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 470, 249, 91));

        jLabel11.setFont(new java.awt.Font("Bahnschrift", 0, 18)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(51, 51, 51));
        jLabel11.setText("ODONTOLOGO");
        panelRegisOdonto02.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(312, 56, -1, -1));

        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        panelRegisOdonto02.add(jComboBox1, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 200, 160, -1));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panelRegisOdonto02, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panelRegisOdonto02, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    public static void main(String args[]) {
        
        Regis_odont02 RegisOdont02 = new Regis_odont02();
        RegisOdont02.setBounds(0, 0, 780, 570);
        RegisOdont02.setVisible(true);
        RegisOdont02.setResizable(false);
        RegisOdont02.setLocationRelativeTo(null);
        
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
    public static javax.swing.JPanel panelRegisOdonto02;
    // End of variables declaration//GEN-END:variables
}