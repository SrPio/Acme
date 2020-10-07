package AdminPack.vista;

import static AdminPack.vista.Regis_odont02.panelRegisOdonto02;
import java.awt.BorderLayout;

public class Regis_factura extends javax.swing.JFrame {

    public Regis_factura() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panelRegisFactura = new javax.swing.JPanel();
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
        jLabel12 = new javax.swing.JLabel();
        fieldDi4 = new javax.swing.JTextField();
        fieldDi6 = new javax.swing.JTextField();
        jLabel14 = new javax.swing.JLabel();
        fieldDi7 = new javax.swing.JTextField();
        jLabel15 = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        fieldDi10 = new javax.swing.JTextField();
        fieldDi5 = new javax.swing.JTextField();
        jLabel13 = new javax.swing.JLabel();
        fieldDi12 = new javax.swing.JTextField();
        jLabel21 = new javax.swing.JLabel();
        jLabel20 = new javax.swing.JLabel();
        fieldDi13 = new javax.swing.JTextField();
        fieldDi8 = new javax.swing.JTextField();
        jLabel16 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        panelRegisFactura.setBackground(new java.awt.Color(255, 255, 255));
        panelRegisFactura.setPreferredSize(new java.awt.Dimension(780, 570));

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
        jLabel10.setText("DIRECCION A ENVIAR :");

        B_Agre_cita.setBackground(new java.awt.Color(255, 255, 255));
        B_Agre_cita.setFont(new java.awt.Font("Bahnschrift", 0, 18)); // NOI18N
        B_Agre_cita.setForeground(new java.awt.Color(255, 255, 255));
        B_Agre_cita.setIcon(new javax.swing.ImageIcon(getClass().getResource("/acme/Images/Boton_morado2.png"))); // NOI18N
        B_Agre_cita.setText("GENERAR FACTURA");
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
        jLabel11.setText("FACTURA CITA");

        jLabel12.setFont(new java.awt.Font("Bahnschrift", 0, 14)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(51, 51, 51));
        jLabel12.setText("FECHA EN QUE SE GENERA :");

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
        jLabel14.setText("FECHA DE VENCIMIENTO :");

        fieldDi7.setBackground(new java.awt.Color(229, 229, 229));
        fieldDi7.setFont(new java.awt.Font("Bahnschrift", 0, 14)); // NOI18N
        fieldDi7.setBorder(null);
        fieldDi7.setPreferredSize(new java.awt.Dimension(59, 32));

        jLabel15.setFont(new java.awt.Font("Bahnschrift", 0, 14)); // NOI18N
        jLabel15.setForeground(new java.awt.Color(51, 51, 51));
        jLabel15.setText("VALOR TOTAL:");

        jLabel19.setFont(new java.awt.Font("Bahnschrift", 0, 14)); // NOI18N
        jLabel19.setForeground(new java.awt.Color(51, 51, 51));
        jLabel19.setText("CONDICIONES DE PAGO :");

        fieldDi10.setBackground(new java.awt.Color(229, 229, 229));
        fieldDi10.setFont(new java.awt.Font("Bahnschrift", 0, 14)); // NOI18N
        fieldDi10.setBorder(null);
        fieldDi10.setPreferredSize(new java.awt.Dimension(59, 32));

        fieldDi5.setBackground(new java.awt.Color(229, 229, 229));
        fieldDi5.setFont(new java.awt.Font("Bahnschrift", 0, 14)); // NOI18N
        fieldDi5.setBorder(null);
        fieldDi5.setPreferredSize(new java.awt.Dimension(59, 32));

        jLabel13.setFont(new java.awt.Font("Bahnschrift", 0, 14)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(51, 51, 51));
        jLabel13.setText("PROCEDIMIENTOS :");

        fieldDi12.setBackground(new java.awt.Color(229, 229, 229));
        fieldDi12.setFont(new java.awt.Font("Bahnschrift", 0, 14)); // NOI18N
        fieldDi12.setBorder(null);
        fieldDi12.setPreferredSize(new java.awt.Dimension(59, 32));

        jLabel21.setFont(new java.awt.Font("Bahnschrift", 0, 14)); // NOI18N
        jLabel21.setForeground(new java.awt.Color(51, 51, 51));
        jLabel21.setText("SALDO ADEUDADO :");

        jLabel20.setFont(new java.awt.Font("Bahnschrift", 0, 14)); // NOI18N
        jLabel20.setForeground(new java.awt.Color(51, 51, 51));
        jLabel20.setText("CANTIDAD PAGADA:");

        fieldDi13.setBackground(new java.awt.Color(229, 229, 229));
        fieldDi13.setFont(new java.awt.Font("Bahnschrift", 0, 14)); // NOI18N
        fieldDi13.setBorder(null);
        fieldDi13.setPreferredSize(new java.awt.Dimension(59, 32));

        fieldDi8.setBackground(new java.awt.Color(229, 229, 229));
        fieldDi8.setFont(new java.awt.Font("Bahnschrift", 0, 14)); // NOI18N
        fieldDi8.setBorder(null);
        fieldDi8.setPreferredSize(new java.awt.Dimension(59, 32));

        jLabel16.setFont(new java.awt.Font("Bahnschrift", 0, 14)); // NOI18N
        jLabel16.setForeground(new java.awt.Color(51, 51, 51));
        jLabel16.setText("OBSERVACIONES :");

        javax.swing.GroupLayout panelRegisFacturaLayout = new javax.swing.GroupLayout(panelRegisFactura);
        panelRegisFactura.setLayout(panelRegisFacturaLayout);
        panelRegisFacturaLayout.setHorizontalGroup(
            panelRegisFacturaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelRegisFacturaLayout.createSequentialGroup()
                .addGroup(panelRegisFacturaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelRegisFacturaLayout.createSequentialGroup()
                        .addGap(337, 337, 337)
                        .addComponent(jLabel11))
                    .addGroup(panelRegisFacturaLayout.createSequentialGroup()
                        .addGap(90, 90, 90)
                        .addComponent(jLabel7)
                        .addGap(17, 17, 17)
                        .addComponent(fieldDi, javax.swing.GroupLayout.PREFERRED_SIZE, 158, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(122, 122, 122)
                        .addComponent(jLabel8)
                        .addGap(19, 19, 19)
                        .addComponent(fieldDi1, javax.swing.GroupLayout.PREFERRED_SIZE, 158, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(panelRegisFacturaLayout.createSequentialGroup()
                        .addGap(60, 60, 60)
                        .addGroup(panelRegisFacturaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(panelRegisFacturaLayout.createSequentialGroup()
                                .addComponent(jLabel9)
                                .addGap(22, 22, 22)
                                .addComponent(fieldDi2, javax.swing.GroupLayout.PREFERRED_SIZE, 158, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(panelRegisFacturaLayout.createSequentialGroup()
                                .addGap(30, 30, 30)
                                .addComponent(jLabel12)))
                        .addGap(112, 112, 112)
                        .addGroup(panelRegisFacturaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel10)
                            .addComponent(fieldDi3, javax.swing.GroupLayout.PREFERRED_SIZE, 260, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(panelRegisFacturaLayout.createSequentialGroup()
                        .addGap(90, 90, 90)
                        .addComponent(fieldDi4, javax.swing.GroupLayout.PREFERRED_SIZE, 240, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(110, 110, 110)
                        .addComponent(jLabel14)
                        .addGap(16, 16, 16)
                        .addComponent(fieldDi6, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(panelRegisFacturaLayout.createSequentialGroup()
                        .addGap(90, 90, 90)
                        .addComponent(jLabel19)
                        .addGap(212, 212, 212)
                        .addComponent(jLabel21))
                    .addGroup(panelRegisFacturaLayout.createSequentialGroup()
                        .addGap(90, 90, 90)
                        .addGroup(panelRegisFacturaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(fieldDi7, javax.swing.GroupLayout.PREFERRED_SIZE, 240, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel16)))
                    .addGroup(panelRegisFacturaLayout.createSequentialGroup()
                        .addGap(90, 90, 90)
                        .addComponent(fieldDi8, javax.swing.GroupLayout.PREFERRED_SIZE, 240, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(200, 200, 200)
                        .addComponent(B_Agre_cita, javax.swing.GroupLayout.PREFERRED_SIZE, 249, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(panelRegisFacturaLayout.createSequentialGroup()
                        .addGap(90, 90, 90)
                        .addGroup(panelRegisFacturaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(panelRegisFacturaLayout.createSequentialGroup()
                                .addGroup(panelRegisFacturaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel13)
                                    .addComponent(fieldDi5, javax.swing.GroupLayout.PREFERRED_SIZE, 240, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel15))
                                .addGap(130, 130, 130)
                                .addGroup(panelRegisFacturaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel20)
                                    .addComponent(fieldDi13, javax.swing.GroupLayout.PREFERRED_SIZE, 240, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(panelRegisFacturaLayout.createSequentialGroup()
                                .addComponent(fieldDi12, javax.swing.GroupLayout.PREFERRED_SIZE, 240, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(130, 130, 130)
                                .addComponent(fieldDi10, javax.swing.GroupLayout.PREFERRED_SIZE, 240, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addGap(1, 1, 1))
        );
        panelRegisFacturaLayout.setVerticalGroup(
            panelRegisFacturaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelRegisFacturaLayout.createSequentialGroup()
                .addGap(54, 54, 54)
                .addComponent(jLabel11)
                .addGap(24, 24, 24)
                .addGroup(panelRegisFacturaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(fieldDi, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(fieldDi1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(panelRegisFacturaLayout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addGroup(panelRegisFacturaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel7)
                            .addComponent(jLabel8))))
                .addGap(18, 18, 18)
                .addGroup(panelRegisFacturaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelRegisFacturaLayout.createSequentialGroup()
                        .addGroup(panelRegisFacturaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel9)
                            .addComponent(fieldDi2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addComponent(jLabel12))
                    .addGroup(panelRegisFacturaLayout.createSequentialGroup()
                        .addComponent(jLabel10)
                        .addGap(3, 3, 3)
                        .addComponent(fieldDi3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(3, 3, 3)
                .addGroup(panelRegisFacturaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(fieldDi4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(panelRegisFacturaLayout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addComponent(jLabel14))
                    .addComponent(fieldDi6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(panelRegisFacturaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel19)
                    .addComponent(jLabel21))
                .addGap(3, 3, 3)
                .addGroup(panelRegisFacturaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(fieldDi12, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(fieldDi10, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(panelRegisFacturaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelRegisFacturaLayout.createSequentialGroup()
                        .addComponent(jLabel13)
                        .addGap(3, 3, 3)
                        .addComponent(fieldDi5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(8, 8, 8)
                        .addComponent(jLabel15))
                    .addGroup(panelRegisFacturaLayout.createSequentialGroup()
                        .addComponent(jLabel20)
                        .addGap(13, 13, 13)
                        .addComponent(fieldDi13, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(3, 3, 3)
                .addComponent(fieldDi7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(8, 8, 8)
                .addComponent(jLabel16)
                .addGap(3, 3, 3)
                .addGroup(panelRegisFacturaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(fieldDi8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(B_Agre_cita, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE)))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panelRegisFactura, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panelRegisFactura, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void B_Agre_citaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_B_Agre_citaActionPerformed


    }//GEN-LAST:event_B_Agre_citaActionPerformed

    public static void main(String args[]) {
        
        Regis_factura RegisFactura = new Regis_factura();
        RegisFactura.setBounds(0, 0, 780, 570);
        RegisFactura.setVisible(true);
        RegisFactura.setResizable(false);
        RegisFactura.setLocationRelativeTo(null);
        
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
    private javax.swing.JTextField fieldDi10;
    private javax.swing.JTextField fieldDi12;
    private javax.swing.JTextField fieldDi13;
    private javax.swing.JTextField fieldDi2;
    private javax.swing.JTextField fieldDi3;
    private javax.swing.JTextField fieldDi4;
    private javax.swing.JTextField fieldDi5;
    private javax.swing.JTextField fieldDi6;
    private javax.swing.JTextField fieldDi7;
    private javax.swing.JTextField fieldDi8;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    public static javax.swing.JPanel panelRegisFactura;
    // End of variables declaration//GEN-END:variables
}
