package AdminPack.vista;

public class Vent_List_paci extends javax.swing.JFrame {

    public Vent_List_paci() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panelListPaciVent = new javax.swing.JPanel();
        B_Consul_List_paci = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        panelListPaciVent.setBackground(new java.awt.Color(255, 255, 255));
        panelListPaciVent.setPreferredSize(new java.awt.Dimension(780, 570));
        panelListPaciVent.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        B_Consul_List_paci.setBackground(new java.awt.Color(255, 255, 255));
        B_Consul_List_paci.setFont(new java.awt.Font("Bahnschrift", 0, 18)); // NOI18N
        B_Consul_List_paci.setForeground(new java.awt.Color(255, 255, 255));
        B_Consul_List_paci.setIcon(new javax.swing.ImageIcon(getClass().getResource("/acme/Images/Boton_rojo2.png"))); // NOI18N
        B_Consul_List_paci.setText("CONSULTAR LISTA DE PACIENTES");
        B_Consul_List_paci.setBorderPainted(false);
        B_Consul_List_paci.setContentAreaFilled(false);
        B_Consul_List_paci.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        B_Consul_List_paci.setFocusPainted(false);
        B_Consul_List_paci.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        panelListPaciVent.add(B_Consul_List_paci, new org.netbeans.lib.awtextra.AbsoluteConstraints(152, 222, -1, -1));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panelListPaciVent, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panelListPaciVent, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    public static void main(String args[]) {
        
        Vent_List_paci ventanaListPaci = new Vent_List_paci();
        ventanaListPaci.setBounds(0, 0, 788, 570);
        ventanaListPaci.setVisible(true);
        ventanaListPaci.setResizable(false);
        ventanaListPaci.setLocationRelativeTo(null);
        
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
              //  new Vent_procedi().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton B_Consul_List_paci;
    public static javax.swing.JPanel panelListPaciVent;
    // End of variables declaration//GEN-END:variables
}