package AdminPack.vista;

public class Regis_procedi extends javax.swing.JFrame {

    public Regis_procedi() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panelRegisProcedi = new javax.swing.JPanel();
        jLabel7 = new javax.swing.JLabel();
        fieldDi = new javax.swing.JTextField();
        fieldDi1 = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        fieldDi2 = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        fieldDi3 = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        B_Agre_cita = new javax.swing.JButton();
        jLabel11 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        panelRegisProcedi.setBackground(new java.awt.Color(255, 255, 255));
        panelRegisProcedi.setPreferredSize(new java.awt.Dimension(780, 570));

        jLabel7.setFont(new java.awt.Font("Bahnschrift", 0, 14)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(51, 51, 51));
        jLabel7.setText("NOMBRE :");

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
        jLabel8.setText("ID PROCEDIMIENTO :");

        fieldDi2.setBackground(new java.awt.Color(229, 229, 229));
        fieldDi2.setFont(new java.awt.Font("Bahnschrift", 0, 14)); // NOI18N
        fieldDi2.setBorder(null);
        fieldDi2.setPreferredSize(new java.awt.Dimension(59, 32));

        jLabel9.setFont(new java.awt.Font("Bahnschrift", 0, 14)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(51, 51, 51));
        jLabel9.setText("VALOR :");

        fieldDi3.setBackground(new java.awt.Color(229, 229, 229));
        fieldDi3.setFont(new java.awt.Font("Bahnschrift", 0, 14)); // NOI18N
        fieldDi3.setBorder(null);
        fieldDi3.setPreferredSize(new java.awt.Dimension(59, 32));

        jLabel10.setFont(new java.awt.Font("Bahnschrift", 0, 14)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(51, 51, 51));
        jLabel10.setText("DESCRIPCION :");

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
        jLabel11.setText("PROCEDIMIETOS");

        javax.swing.GroupLayout panelRegisProcediLayout = new javax.swing.GroupLayout(panelRegisProcedi);
        panelRegisProcedi.setLayout(panelRegisProcediLayout);
        panelRegisProcediLayout.setHorizontalGroup(
            panelRegisProcediLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelRegisProcediLayout.createSequentialGroup()
                .addGap(311, 311, 311)
                .addComponent(jLabel11))
            .addGroup(panelRegisProcediLayout.createSequentialGroup()
                .addGap(60, 60, 60)
                .addComponent(jLabel7)
                .addGap(17, 17, 17)
                .addComponent(fieldDi, javax.swing.GroupLayout.PREFERRED_SIZE, 158, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(72, 72, 72)
                .addComponent(jLabel8)
                .addGap(10, 10, 10)
                .addComponent(fieldDi1, javax.swing.GroupLayout.PREFERRED_SIZE, 158, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(panelRegisProcediLayout.createSequentialGroup()
                .addGap(60, 60, 60)
                .addComponent(jLabel9)
                .addGap(30, 30, 30)
                .addComponent(fieldDi2, javax.swing.GroupLayout.PREFERRED_SIZE, 158, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(102, 102, 102)
                .addComponent(jLabel10)
                .addGap(14, 14, 14)
                .addComponent(fieldDi3, javax.swing.GroupLayout.PREFERRED_SIZE, 158, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(panelRegisProcediLayout.createSequentialGroup()
                .addGap(520, 520, 520)
                .addComponent(B_Agre_cita, javax.swing.GroupLayout.PREFERRED_SIZE, 249, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        panelRegisProcediLayout.setVerticalGroup(
            panelRegisProcediLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelRegisProcediLayout.createSequentialGroup()
                .addGap(55, 55, 55)
                .addComponent(jLabel11)
                .addGap(93, 93, 93)
                .addGroup(panelRegisProcediLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(fieldDi, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(fieldDi1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(panelRegisProcediLayout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addGroup(panelRegisProcediLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel7)
                            .addComponent(jLabel8))))
                .addGap(28, 28, 28)
                .addGroup(panelRegisProcediLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelRegisProcediLayout.createSequentialGroup()
                        .addGap(20, 20, 20)
                        .addComponent(jLabel9))
                    .addGroup(panelRegisProcediLayout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addComponent(fieldDi2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(panelRegisProcediLayout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addComponent(jLabel10))
                    .addComponent(fieldDi3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(198, 198, 198)
                .addComponent(B_Agre_cita, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panelRegisProcedi, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panelRegisProcedi, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    public static void main(String args[]) {
        
        Regis_procedi RegisProcediVent = new Regis_procedi();
        RegisProcediVent.setBounds(0, 0, 780, 570);
        RegisProcediVent.setVisible(true);
        RegisProcediVent.setResizable(false);
        RegisProcediVent.setLocationRelativeTo(null);
        
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
    private javax.swing.JTextField fieldDi2;
    private javax.swing.JTextField fieldDi3;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    public static javax.swing.JPanel panelRegisProcedi;
    // End of variables declaration//GEN-END:variables
}