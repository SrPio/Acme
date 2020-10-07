package AdminPack.vista;

import static AdminPack.vista.Regis_procedi.panelRegisProcedi;
import java.awt.BorderLayout;

public class Vent_procedi extends javax.swing.JFrame {

    public Vent_procedi() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panelProcediVent = new javax.swing.JPanel();
        B_Agre_procedi = new javax.swing.JButton();
        B_Consul_procedi = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        panelProcediVent.setBackground(new java.awt.Color(255, 255, 255));
        panelProcediVent.setPreferredSize(new java.awt.Dimension(780, 570));

        B_Agre_procedi.setBackground(new java.awt.Color(255, 255, 255));
        B_Agre_procedi.setFont(new java.awt.Font("Bahnschrift", 0, 18)); // NOI18N
        B_Agre_procedi.setForeground(new java.awt.Color(255, 255, 255));
        B_Agre_procedi.setIcon(new javax.swing.ImageIcon(getClass().getResource("/acme/Images/Boton_rojo2.png"))); // NOI18N
        B_Agre_procedi.setText("AÑADIR PROCEDIMIENTO");
        B_Agre_procedi.setBorderPainted(false);
        B_Agre_procedi.setContentAreaFilled(false);
        B_Agre_procedi.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        B_Agre_procedi.setFocusPainted(false);
        B_Agre_procedi.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        B_Agre_procedi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                B_Agre_procediActionPerformed(evt);
            }
        });

        B_Consul_procedi.setBackground(new java.awt.Color(255, 255, 255));
        B_Consul_procedi.setFont(new java.awt.Font("Bahnschrift", 0, 18)); // NOI18N
        B_Consul_procedi.setForeground(new java.awt.Color(255, 255, 255));
        B_Consul_procedi.setIcon(new javax.swing.ImageIcon(getClass().getResource("/acme/Images/Boton_rojo2.png"))); // NOI18N
        B_Consul_procedi.setText("CONSULTAR PROCEDIMIENTO");
        B_Consul_procedi.setBorderPainted(false);
        B_Consul_procedi.setContentAreaFilled(false);
        B_Consul_procedi.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        B_Consul_procedi.setFocusPainted(false);
        B_Consul_procedi.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        javax.swing.GroupLayout panelProcediVentLayout = new javax.swing.GroupLayout(panelProcediVent);
        panelProcediVent.setLayout(panelProcediVentLayout);
        panelProcediVentLayout.setHorizontalGroup(
            panelProcediVentLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelProcediVentLayout.createSequentialGroup()
                .addGap(152, 152, 152)
                .addGroup(panelProcediVentLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(B_Agre_procedi)
                    .addComponent(B_Consul_procedi)))
        );
        panelProcediVentLayout.setVerticalGroup(
            panelProcediVentLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelProcediVentLayout.createSequentialGroup()
                .addGap(145, 145, 145)
                .addComponent(B_Agre_procedi)
                .addGap(6, 6, 6)
                .addComponent(B_Consul_procedi))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panelProcediVent, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(panelProcediVent, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void B_Agre_procediActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_B_Agre_procediActionPerformed

        Regis_procedi RegisProcediVent = new Regis_procedi();
        RegisProcediVent.setSize(780, 570);
        RegisProcediVent.setLocation(30,60);
        
        panelProcediVent.removeAll();
        panelProcediVent.add(panelRegisProcedi, BorderLayout.CENTER);
        panelProcediVent.revalidate();
        panelProcediVent.repaint();
    }//GEN-LAST:event_B_Agre_procediActionPerformed

    public static void main(String args[]) {
        
        Vent_procedi ventanaProcedi = new Vent_procedi();
        ventanaProcedi.setBounds(0, 0, 780, 570);
        ventanaProcedi.setVisible(true);
        ventanaProcedi.setResizable(false);
        ventanaProcedi.setLocationRelativeTo(null);
        
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
              //  new Vent_procedi().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton B_Agre_procedi;
    private javax.swing.JButton B_Consul_procedi;
    public static javax.swing.JPanel panelProcediVent;
    // End of variables declaration//GEN-END:variables
}