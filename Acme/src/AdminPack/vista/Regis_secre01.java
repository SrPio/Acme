package AdminPack.vista;

import static AdminPack.vista.Regis_secre02.panelRegisSecre02;
import java.awt.BorderLayout;

public class Regis_secre01 extends javax.swing.JFrame {

    public Regis_secre01() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panelRegisSecre01 = new javax.swing.JPanel();
        fieldDi = new javax.swing.JTextField();
        fieldDi1 = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        fieldDi2 = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        fieldDi3 = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        B_Agre_cita = new javax.swing.JButton();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        fieldDi4 = new javax.swing.JTextField();
        fieldDi6 = new javax.swing.JTextField();
        jLabel14 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        fieldDi8 = new javax.swing.JTextField();
        jLabel19 = new javax.swing.JLabel();
        fieldDi11 = new javax.swing.JTextField();
        jLabel13 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        panelRegisSecre01.setBackground(new java.awt.Color(255, 255, 255));
        panelRegisSecre01.setPreferredSize(new java.awt.Dimension(780, 570));

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
        jLabel8.setText("APELLIDO :");

        fieldDi2.setBackground(new java.awt.Color(229, 229, 229));
        fieldDi2.setFont(new java.awt.Font("Bahnschrift", 0, 14)); // NOI18N
        fieldDi2.setBorder(null);
        fieldDi2.setPreferredSize(new java.awt.Dimension(59, 32));

        jLabel9.setFont(new java.awt.Font("Bahnschrift", 0, 14)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(51, 51, 51));
        jLabel9.setText("DOCUMENTO :");

        fieldDi3.setBackground(new java.awt.Color(229, 229, 229));
        fieldDi3.setFont(new java.awt.Font("Bahnschrift", 0, 14)); // NOI18N
        fieldDi3.setBorder(null);
        fieldDi3.setPreferredSize(new java.awt.Dimension(59, 32));

        jLabel10.setFont(new java.awt.Font("Bahnschrift", 0, 14)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(51, 51, 51));
        jLabel10.setText("TIPO DE DOCUMENTO :");

        B_Agre_cita.setBackground(new java.awt.Color(255, 255, 255));
        B_Agre_cita.setFont(new java.awt.Font("Bahnschrift", 0, 18)); // NOI18N
        B_Agre_cita.setForeground(new java.awt.Color(255, 255, 255));
        B_Agre_cita.setIcon(new javax.swing.ImageIcon(getClass().getResource("/acme/Images/Boton_morado2.png"))); // NOI18N
        B_Agre_cita.setText("CONTINUAR");
        B_Agre_cita.setBorderPainted(false);
        B_Agre_cita.setContentAreaFilled(false);
        B_Agre_cita.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        B_Agre_cita.setFocusPainted(false);
        B_Agre_cita.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        B_Agre_cita.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                B_Agre_citaActionPerformed(evt);
            }
        });

        jLabel11.setFont(new java.awt.Font("Bahnschrift", 0, 18)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(51, 51, 51));
        jLabel11.setText("SECRETARIO");

        jLabel12.setFont(new java.awt.Font("Bahnschrift", 0, 14)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(51, 51, 51));
        jLabel12.setText("DIRECCION :");

        fieldDi4.setBackground(new java.awt.Color(229, 229, 229));
        fieldDi4.setFont(new java.awt.Font("Bahnschrift", 0, 14)); // NOI18N
        fieldDi4.setBorder(null);
        fieldDi4.setPreferredSize(new java.awt.Dimension(59, 32));

        fieldDi6.setBackground(new java.awt.Color(229, 229, 229));
        fieldDi6.setFont(new java.awt.Font("Bahnschrift", 0, 14)); // NOI18N
        fieldDi6.setBorder(null);
        fieldDi6.setPreferredSize(new java.awt.Dimension(59, 32));

        jLabel14.setFont(new java.awt.Font("Bahnschrift", 0, 14)); // NOI18N
        jLabel14.setForeground(new java.awt.Color(51, 51, 51));
        jLabel14.setText("FECHA DE NACIMIENTO :");

        jLabel16.setFont(new java.awt.Font("Bahnschrift", 0, 14)); // NOI18N
        jLabel16.setForeground(new java.awt.Color(51, 51, 51));
        jLabel16.setText("DESCRIPCION Y ESPECIALIZACIONES:");

        fieldDi8.setBackground(new java.awt.Color(229, 229, 229));
        fieldDi8.setFont(new java.awt.Font("Bahnschrift", 0, 14)); // NOI18N
        fieldDi8.setBorder(null);
        fieldDi8.setPreferredSize(new java.awt.Dimension(59, 32));

        jLabel19.setFont(new java.awt.Font("Bahnschrift", 0, 14)); // NOI18N
        jLabel19.setForeground(new java.awt.Color(51, 51, 51));
        jLabel19.setText("TELEFONO :");

        fieldDi11.setBackground(new java.awt.Color(229, 229, 229));
        fieldDi11.setFont(new java.awt.Font("Bahnschrift", 0, 14)); // NOI18N
        fieldDi11.setBorder(null);
        fieldDi11.setPreferredSize(new java.awt.Dimension(59, 32));

        jLabel13.setFont(new java.awt.Font("Bahnschrift", 0, 14)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(51, 51, 51));
        jLabel13.setText("NOMBRE :");

        javax.swing.GroupLayout panelRegisSecre01Layout = new javax.swing.GroupLayout(panelRegisSecre01);
        panelRegisSecre01.setLayout(panelRegisSecre01Layout);
        panelRegisSecre01Layout.setHorizontalGroup(
            panelRegisSecre01Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelRegisSecre01Layout.createSequentialGroup()
                .addGroup(panelRegisSecre01Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelRegisSecre01Layout.createSequentialGroup()
                        .addGap(312, 312, 312)
                        .addComponent(jLabel11))
                    .addGroup(panelRegisSecre01Layout.createSequentialGroup()
                        .addGap(69, 69, 69)
                        .addGroup(panelRegisSecre01Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(panelRegisSecre01Layout.createSequentialGroup()
                                .addComponent(jLabel12)
                                .addGap(22, 22, 22)
                                .addComponent(fieldDi4, javax.swing.GroupLayout.PREFERRED_SIZE, 158, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(panelRegisSecre01Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jLabel19)
                                .addComponent(fieldDi11, javax.swing.GroupLayout.PREFERRED_SIZE, 240, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(37, 37, 37)
                        .addGroup(panelRegisSecre01Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelRegisSecre01Layout.createSequentialGroup()
                                .addComponent(jLabel14)
                                .addGap(18, 18, 18)
                                .addComponent(fieldDi6, javax.swing.GroupLayout.PREFERRED_SIZE, 158, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelRegisSecre01Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jLabel16)
                                .addComponent(fieldDi8, javax.swing.GroupLayout.PREFERRED_SIZE, 240, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(panelRegisSecre01Layout.createSequentialGroup()
                        .addGap(59, 59, 59)
                        .addGroup(panelRegisSecre01Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelRegisSecre01Layout.createSequentialGroup()
                                .addComponent(jLabel13)
                                .addGap(18, 18, 18)
                                .addComponent(fieldDi, javax.swing.GroupLayout.PREFERRED_SIZE, 158, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(panelRegisSecre01Layout.createSequentialGroup()
                                .addComponent(jLabel9)
                                .addGap(22, 22, 22)
                                .addComponent(fieldDi2, javax.swing.GroupLayout.PREFERRED_SIZE, 158, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGroup(panelRegisSecre01Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(panelRegisSecre01Layout.createSequentialGroup()
                                .addGap(52, 52, 52)
                                .addComponent(jLabel10)
                                .addGap(18, 18, 18)
                                .addComponent(fieldDi3, javax.swing.GroupLayout.PREFERRED_SIZE, 158, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelRegisSecre01Layout.createSequentialGroup()
                                .addGap(97, 97, 97)
                                .addComponent(jLabel8)
                                .addGap(19, 19, 19)
                                .addComponent(fieldDi1, javax.swing.GroupLayout.PREFERRED_SIZE, 158, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addGap(83, 83, 83))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelRegisSecre01Layout.createSequentialGroup()
                .addComponent(B_Agre_cita, javax.swing.GroupLayout.PREFERRED_SIZE, 249, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        panelRegisSecre01Layout.setVerticalGroup(
            panelRegisSecre01Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelRegisSecre01Layout.createSequentialGroup()
                .addGap(56, 56, 56)
                .addComponent(jLabel11)
                .addGap(37, 37, 37)
                .addGroup(panelRegisSecre01Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelRegisSecre01Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(fieldDi, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel13))
                    .addComponent(fieldDi1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(panelRegisSecre01Layout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addComponent(jLabel8)))
                .addGap(18, 18, 18)
                .addGroup(panelRegisSecre01Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel9)
                    .addComponent(fieldDi2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel10)
                    .addComponent(fieldDi3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(26, 26, 26)
                .addGroup(panelRegisSecre01Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(fieldDi4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(fieldDi6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(panelRegisSecre01Layout.createSequentialGroup()
                        .addGap(7, 7, 7)
                        .addGroup(panelRegisSecre01Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel12)
                            .addComponent(jLabel14))))
                .addGap(18, 18, 18)
                .addGroup(panelRegisSecre01Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelRegisSecre01Layout.createSequentialGroup()
                        .addComponent(jLabel16)
                        .addGap(3, 3, 3)
                        .addComponent(fieldDi8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(panelRegisSecre01Layout.createSequentialGroup()
                        .addComponent(jLabel19)
                        .addGap(3, 3, 3)
                        .addComponent(fieldDi11, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 148, Short.MAX_VALUE)
                .addComponent(B_Agre_cita, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panelRegisSecre01, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panelRegisSecre01, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void B_Agre_citaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_B_Agre_citaActionPerformed

        
        Regis_secre02 RegisSecre02 = new Regis_secre02();
        RegisSecre02.setSize(780, 570);
        RegisSecre02.setLocation(30,60);
        
        panelRegisSecre01.removeAll();
        panelRegisSecre01.add(panelRegisSecre02, BorderLayout.CENTER);
        panelRegisSecre01.revalidate();
        panelRegisSecre01.repaint();
    }//GEN-LAST:event_B_Agre_citaActionPerformed

    public static void main(String args[]) {
        
        Regis_secre01 RegisSecre01 = new Regis_secre01();
        RegisSecre01.setBounds(0, 0, 780, 570);
        RegisSecre01.setVisible(true);
        RegisSecre01.setResizable(false);
        RegisSecre01.setLocationRelativeTo(null);
        
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
    private javax.swing.JTextField fieldDi11;
    private javax.swing.JTextField fieldDi2;
    private javax.swing.JTextField fieldDi3;
    private javax.swing.JTextField fieldDi4;
    private javax.swing.JTextField fieldDi6;
    private javax.swing.JTextField fieldDi8;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    public static javax.swing.JPanel panelRegisSecre01;
    // End of variables declaration//GEN-END:variables
}