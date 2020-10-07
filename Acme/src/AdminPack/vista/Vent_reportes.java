package AdminPack.vista;

public class Vent_reportes extends javax.swing.JFrame {

    public Vent_reportes() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panelRepoVent = new javax.swing.JPanel();
        B_Consul_reportes = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        panelRepoVent.setBackground(new java.awt.Color(255, 255, 255));
        panelRepoVent.setPreferredSize(new java.awt.Dimension(780, 570));

        B_Consul_reportes.setBackground(new java.awt.Color(255, 255, 255));
        B_Consul_reportes.setFont(new java.awt.Font("Bahnschrift", 0, 18)); // NOI18N
        B_Consul_reportes.setForeground(new java.awt.Color(255, 255, 255));
        B_Consul_reportes.setIcon(new javax.swing.ImageIcon(getClass().getResource("/acme/Images/Boton_rojo2.png"))); // NOI18N
        B_Consul_reportes.setText("CONSULTAR REPORTES");
        B_Consul_reportes.setBorderPainted(false);
        B_Consul_reportes.setContentAreaFilled(false);
        B_Consul_reportes.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        B_Consul_reportes.setFocusPainted(false);
        B_Consul_reportes.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        javax.swing.GroupLayout panelRepoVentLayout = new javax.swing.GroupLayout(panelRepoVent);
        panelRepoVent.setLayout(panelRepoVentLayout);
        panelRepoVentLayout.setHorizontalGroup(
            panelRepoVentLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelRepoVentLayout.createSequentialGroup()
                .addGap(152, 152, 152)
                .addComponent(B_Consul_reportes))
        );
        panelRepoVentLayout.setVerticalGroup(
            panelRepoVentLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelRepoVentLayout.createSequentialGroup()
                .addGap(222, 222, 222)
                .addComponent(B_Consul_reportes))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panelRepoVent, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panelRepoVent, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    public static void main(String args[]) {
        
        Vent_reportes ventanaRepo = new Vent_reportes();
        ventanaRepo.setBounds(0, 0, 788, 570);
        ventanaRepo.setVisible(true);
        ventanaRepo.setResizable(false);
        ventanaRepo.setLocationRelativeTo(null);
        
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
              //  new Vent_procedi().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton B_Consul_reportes;
    public static javax.swing.JPanel panelRepoVent;
    // End of variables declaration//GEN-END:variables
}