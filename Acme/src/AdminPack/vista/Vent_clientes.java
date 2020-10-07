package AdminPack.vista;

import static AdminPack.vista.Regis_cliente.panelRegisCliente;
import java.awt.BorderLayout;

public class Vent_clientes extends javax.swing.JFrame {

    public Vent_clientes() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panelClientesVent = new javax.swing.JPanel();
        B_Agre_clientes = new javax.swing.JButton();
        B_Consul_clientes = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        panelClientesVent.setBackground(new java.awt.Color(255, 255, 255));
        panelClientesVent.setMinimumSize(new java.awt.Dimension(780, 570));
        panelClientesVent.setPreferredSize(new java.awt.Dimension(780, 570));

        B_Agre_clientes.setBackground(new java.awt.Color(255, 255, 255));
        B_Agre_clientes.setFont(new java.awt.Font("Bahnschrift", 0, 18)); // NOI18N
        B_Agre_clientes.setForeground(new java.awt.Color(255, 255, 255));
        B_Agre_clientes.setIcon(new javax.swing.ImageIcon(getClass().getResource("/acme/Images/Boton_rojo2.png"))); // NOI18N
        B_Agre_clientes.setText("AÑADIR CLIENTE");
        B_Agre_clientes.setBorderPainted(false);
        B_Agre_clientes.setContentAreaFilled(false);
        B_Agre_clientes.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        B_Agre_clientes.setFocusPainted(false);
        B_Agre_clientes.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        B_Agre_clientes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                B_Agre_clientesActionPerformed(evt);
            }
        });

        B_Consul_clientes.setBackground(new java.awt.Color(255, 255, 255));
        B_Consul_clientes.setFont(new java.awt.Font("Bahnschrift", 0, 18)); // NOI18N
        B_Consul_clientes.setForeground(new java.awt.Color(255, 255, 255));
        B_Consul_clientes.setIcon(new javax.swing.ImageIcon(getClass().getResource("/acme/Images/Boton_rojo2.png"))); // NOI18N
        B_Consul_clientes.setText("CONSULTAR CLIENTE");
        B_Consul_clientes.setBorderPainted(false);
        B_Consul_clientes.setContentAreaFilled(false);
        B_Consul_clientes.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        B_Consul_clientes.setFocusPainted(false);
        B_Consul_clientes.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        javax.swing.GroupLayout panelClientesVentLayout = new javax.swing.GroupLayout(panelClientesVent);
        panelClientesVent.setLayout(panelClientesVentLayout);
        panelClientesVentLayout.setHorizontalGroup(
            panelClientesVentLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelClientesVentLayout.createSequentialGroup()
                .addGap(152, 152, 152)
                .addGroup(panelClientesVentLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(B_Agre_clientes)
                    .addComponent(B_Consul_clientes)))
        );
        panelClientesVentLayout.setVerticalGroup(
            panelClientesVentLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelClientesVentLayout.createSequentialGroup()
                .addGap(145, 145, 145)
                .addComponent(B_Agre_clientes))
            .addGroup(panelClientesVentLayout.createSequentialGroup()
                .addGap(264, 264, 264)
                .addComponent(B_Consul_clientes))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panelClientesVent, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panelClientesVent, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void B_Agre_clientesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_B_Agre_clientesActionPerformed

        Regis_cliente RegisClienteVent = new Regis_cliente();
        RegisClienteVent.setSize(780, 570);
        RegisClienteVent.setLocation(30,60);
        
        panelClientesVent.removeAll();
        panelClientesVent.add(panelRegisCliente, BorderLayout.CENTER);
        panelClientesVent.revalidate();
        panelClientesVent.repaint();
    }//GEN-LAST:event_B_Agre_clientesActionPerformed

    public static void main(String args[]) {
        
        Vent_clientes ventanaClientes = new Vent_clientes();
        ventanaClientes.setBounds(0, 0, 788, 570);
        ventanaClientes.setVisible(true);
        ventanaClientes.setResizable(false);
        ventanaClientes.setLocationRelativeTo(null);
        
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
              //  new Vent_procedi().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton B_Agre_clientes;
    private javax.swing.JButton B_Consul_clientes;
    public static javax.swing.JPanel panelClientesVent;
    // End of variables declaration//GEN-END:variables
}