package AdminPack.vista;

public class Vent_histo_clinic extends javax.swing.JFrame {

    public Vent_histo_clinic() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panelHistoClinicVent = new javax.swing.JPanel();
        B_Consul_Histo_clinic = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        panelHistoClinicVent.setBackground(new java.awt.Color(255, 255, 255));
        panelHistoClinicVent.setPreferredSize(new java.awt.Dimension(780, 570));
        panelHistoClinicVent.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        B_Consul_Histo_clinic.setBackground(new java.awt.Color(255, 255, 255));
        B_Consul_Histo_clinic.setFont(new java.awt.Font("Bahnschrift", 0, 18)); // NOI18N
        B_Consul_Histo_clinic.setForeground(new java.awt.Color(255, 255, 255));
        B_Consul_Histo_clinic.setIcon(new javax.swing.ImageIcon(getClass().getResource("/acme/Images/Boton_rojo2.png"))); // NOI18N
        B_Consul_Histo_clinic.setText("CONSULTAR HISTORIA CLINICA");
        B_Consul_Histo_clinic.setBorderPainted(false);
        B_Consul_Histo_clinic.setContentAreaFilled(false);
        B_Consul_Histo_clinic.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        B_Consul_Histo_clinic.setFocusPainted(false);
        B_Consul_Histo_clinic.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        panelHistoClinicVent.add(B_Consul_Histo_clinic, new org.netbeans.lib.awtextra.AbsoluteConstraints(152, 222, -1, -1));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panelHistoClinicVent, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panelHistoClinicVent, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    public static void main(String args[]) {
        
        Vent_histo_clinic ventanaHistoClinic = new Vent_histo_clinic();
        ventanaHistoClinic.setBounds(0, 0, 788, 570);
        ventanaHistoClinic.setVisible(true);
        ventanaHistoClinic.setResizable(false);
        ventanaHistoClinic.setLocationRelativeTo(null);
        
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
              //  new Vent_procedi().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton B_Consul_Histo_clinic;
    public static javax.swing.JPanel panelHistoClinicVent;
    // End of variables declaration//GEN-END:variables
}