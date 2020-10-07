package AdminPack.vista;

import static AdminPack.vista.Regis_factura.panelRegisFactura;
import java.awt.BorderLayout;

public class Vent_facturas extends javax.swing.JFrame {

    public Vent_facturas() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panelFacturasVent = new javax.swing.JPanel();
        B_Agre_factu = new javax.swing.JButton();
        B_Consul_factu = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        panelFacturasVent.setBackground(new java.awt.Color(255, 255, 255));
        panelFacturasVent.setPreferredSize(new java.awt.Dimension(780, 570));

        B_Agre_factu.setBackground(new java.awt.Color(255, 255, 255));
        B_Agre_factu.setFont(new java.awt.Font("Bahnschrift", 0, 18)); // NOI18N
        B_Agre_factu.setForeground(new java.awt.Color(255, 255, 255));
        B_Agre_factu.setIcon(new javax.swing.ImageIcon(getClass().getResource("/acme/Images/Boton_rojo2.png"))); // NOI18N
        B_Agre_factu.setText("GENERAR FACTURA");
        B_Agre_factu.setBorderPainted(false);
        B_Agre_factu.setContentAreaFilled(false);
        B_Agre_factu.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        B_Agre_factu.setFocusPainted(false);
        B_Agre_factu.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        B_Agre_factu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                B_Agre_factuActionPerformed(evt);
            }
        });

        B_Consul_factu.setBackground(new java.awt.Color(255, 255, 255));
        B_Consul_factu.setFont(new java.awt.Font("Bahnschrift", 0, 18)); // NOI18N
        B_Consul_factu.setForeground(new java.awt.Color(255, 255, 255));
        B_Consul_factu.setIcon(new javax.swing.ImageIcon(getClass().getResource("/acme/Images/Boton_rojo2.png"))); // NOI18N
        B_Consul_factu.setText("CONSULTAR FACTURA");
        B_Consul_factu.setBorderPainted(false);
        B_Consul_factu.setContentAreaFilled(false);
        B_Consul_factu.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        B_Consul_factu.setFocusPainted(false);
        B_Consul_factu.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        javax.swing.GroupLayout panelFacturasVentLayout = new javax.swing.GroupLayout(panelFacturasVent);
        panelFacturasVent.setLayout(panelFacturasVentLayout);
        panelFacturasVentLayout.setHorizontalGroup(
            panelFacturasVentLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelFacturasVentLayout.createSequentialGroup()
                .addGap(152, 152, 152)
                .addGroup(panelFacturasVentLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(B_Consul_factu)
                    .addComponent(B_Agre_factu)))
        );
        panelFacturasVentLayout.setVerticalGroup(
            panelFacturasVentLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelFacturasVentLayout.createSequentialGroup()
                .addGap(264, 264, 264)
                .addComponent(B_Consul_factu))
            .addGroup(panelFacturasVentLayout.createSequentialGroup()
                .addGap(145, 145, 145)
                .addComponent(B_Agre_factu))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panelFacturasVent, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panelFacturasVent, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void B_Agre_factuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_B_Agre_factuActionPerformed

        Regis_factura RegisFactura = new Regis_factura();
        RegisFactura.setSize(780, 570);
        RegisFactura.setLocation(30,60);
        
        panelFacturasVent.removeAll();
        panelFacturasVent.add(panelRegisFactura, BorderLayout.CENTER);
        panelFacturasVent.revalidate();
        panelFacturasVent.repaint();
    }//GEN-LAST:event_B_Agre_factuActionPerformed

    public static void main(String args[]) {
        
        Vent_facturas ventanaFacturas = new Vent_facturas();
        ventanaFacturas.setBounds(0, 0, 788, 570);
        ventanaFacturas.setVisible(true);
        ventanaFacturas.setResizable(false);
        ventanaFacturas.setLocationRelativeTo(null);
        
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
              //  new Vent_procedi().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton B_Agre_factu;
    private javax.swing.JButton B_Consul_factu;
    public static javax.swing.JPanel panelFacturasVent;
    // End of variables declaration//GEN-END:variables
}