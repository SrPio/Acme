package AdminPack.vista;

import static AdminPack.vista.Regis_cita.panelRegisCita;
import java.awt.BorderLayout;

public class Vent_citas extends javax.swing.JFrame {

    public Vent_citas() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panelCitasVent = new javax.swing.JPanel();
        B_Agre_cita = new javax.swing.JButton();
        B_Consul_cita = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        panelCitasVent.setBackground(new java.awt.Color(255, 255, 255));
        panelCitasVent.setMinimumSize(new java.awt.Dimension(780, 570));
        panelCitasVent.setPreferredSize(new java.awt.Dimension(780, 570));

        B_Agre_cita.setBackground(new java.awt.Color(255, 255, 255));
        B_Agre_cita.setFont(new java.awt.Font("Bahnschrift", 0, 18)); // NOI18N
        B_Agre_cita.setForeground(new java.awt.Color(255, 255, 255));
        B_Agre_cita.setIcon(new javax.swing.ImageIcon(getClass().getResource("/acme/Images/Boton_rojo2.png"))); // NOI18N
        B_Agre_cita.setText("AÑADIR CITA");
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

        B_Consul_cita.setBackground(new java.awt.Color(255, 255, 255));
        B_Consul_cita.setFont(new java.awt.Font("Bahnschrift", 0, 18)); // NOI18N
        B_Consul_cita.setForeground(new java.awt.Color(255, 255, 255));
        B_Consul_cita.setIcon(new javax.swing.ImageIcon(getClass().getResource("/acme/Images/Boton_rojo2.png"))); // NOI18N
        B_Consul_cita.setText("CONSULTAR CITA");
        B_Consul_cita.setBorderPainted(false);
        B_Consul_cita.setContentAreaFilled(false);
        B_Consul_cita.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        B_Consul_cita.setFocusPainted(false);
        B_Consul_cita.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        javax.swing.GroupLayout panelCitasVentLayout = new javax.swing.GroupLayout(panelCitasVent);
        panelCitasVent.setLayout(panelCitasVentLayout);
        panelCitasVentLayout.setHorizontalGroup(
            panelCitasVentLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelCitasVentLayout.createSequentialGroup()
                .addGap(152, 152, 152)
                .addGroup(panelCitasVentLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(B_Agre_cita)
                    .addComponent(B_Consul_cita)))
        );
        panelCitasVentLayout.setVerticalGroup(
            panelCitasVentLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelCitasVentLayout.createSequentialGroup()
                .addGap(145, 145, 145)
                .addComponent(B_Agre_cita)
                .addGap(6, 6, 6)
                .addComponent(B_Consul_cita))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panelCitasVent, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panelCitasVent, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void B_Agre_citaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_B_Agre_citaActionPerformed

        Regis_cita RegisCita = new Regis_cita();
        RegisCita.setSize(780, 570);
        RegisCita.setLocation(30,60);
        
        panelCitasVent.removeAll();
        panelCitasVent.add(panelRegisCita, BorderLayout.CENTER);
        panelCitasVent.revalidate();
        panelCitasVent.repaint();
    }//GEN-LAST:event_B_Agre_citaActionPerformed

    public static void main(String args[]) {
        
        Vent_citas ventanaCitas = new Vent_citas();
        ventanaCitas.setBounds(0, 0, 788, 570);
        ventanaCitas.setVisible(true);
        ventanaCitas.setResizable(false);
        ventanaCitas.setLocationRelativeTo(null);
        
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
              //  new Vent_procedi().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton B_Agre_cita;
    private javax.swing.JButton B_Consul_cita;
    public static javax.swing.JPanel panelCitasVent;
    // End of variables declaration//GEN-END:variables
}