package AdminPack.vista;

import static AdminPack.vista.Regis_odont01.panelRegisOdonto01;
import static AdminPack.vista.Regis_secre01.panelRegisSecre01;
import java.awt.BorderLayout;

public class Vent_users extends javax.swing.JFrame {

    public Vent_users() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panelUsersVent = new javax.swing.JPanel();
        B_Agre_user = new javax.swing.JButton();
        B_Consul_user = new javax.swing.JButton();
        B_Agre_Secre = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        panelUsersVent.setBackground(new java.awt.Color(255, 255, 255));
        panelUsersVent.setMinimumSize(new java.awt.Dimension(780, 570));
        panelUsersVent.setPreferredSize(new java.awt.Dimension(780, 570));

        B_Agre_user.setBackground(new java.awt.Color(255, 255, 255));
        B_Agre_user.setFont(new java.awt.Font("Bahnschrift", 0, 18)); // NOI18N
        B_Agre_user.setForeground(new java.awt.Color(255, 255, 255));
        B_Agre_user.setIcon(new javax.swing.ImageIcon(getClass().getResource("/acme/Images/Boton_rojo2.png"))); // NOI18N
        B_Agre_user.setText("AÑADIR ODONTOLOGO");
        B_Agre_user.setBorderPainted(false);
        B_Agre_user.setContentAreaFilled(false);
        B_Agre_user.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        B_Agre_user.setFocusPainted(false);
        B_Agre_user.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        B_Agre_user.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                B_Agre_userActionPerformed(evt);
            }
        });

        B_Consul_user.setBackground(new java.awt.Color(255, 255, 255));
        B_Consul_user.setFont(new java.awt.Font("Bahnschrift", 0, 18)); // NOI18N
        B_Consul_user.setForeground(new java.awt.Color(255, 255, 255));
        B_Consul_user.setIcon(new javax.swing.ImageIcon(getClass().getResource("/acme/Images/Boton_rojo2.png"))); // NOI18N
        B_Consul_user.setText("CONSULTAR USUARIO");
        B_Consul_user.setBorderPainted(false);
        B_Consul_user.setContentAreaFilled(false);
        B_Consul_user.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        B_Consul_user.setFocusPainted(false);
        B_Consul_user.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        B_Agre_Secre.setBackground(new java.awt.Color(255, 255, 255));
        B_Agre_Secre.setFont(new java.awt.Font("Bahnschrift", 0, 18)); // NOI18N
        B_Agre_Secre.setForeground(new java.awt.Color(255, 255, 255));
        B_Agre_Secre.setIcon(new javax.swing.ImageIcon(getClass().getResource("/acme/Images/Boton_rojo2.png"))); // NOI18N
        B_Agre_Secre.setText("AÑADIR SECRETARIO");
        B_Agre_Secre.setBorderPainted(false);
        B_Agre_Secre.setContentAreaFilled(false);
        B_Agre_Secre.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        B_Agre_Secre.setFocusPainted(false);
        B_Agre_Secre.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        B_Agre_Secre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                B_Agre_SecreActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout panelUsersVentLayout = new javax.swing.GroupLayout(panelUsersVent);
        panelUsersVent.setLayout(panelUsersVentLayout);
        panelUsersVentLayout.setHorizontalGroup(
            panelUsersVentLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelUsersVentLayout.createSequentialGroup()
                .addGap(152, 152, 152)
                .addGroup(panelUsersVentLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(B_Agre_user)
                    .addComponent(B_Agre_Secre)
                    .addComponent(B_Consul_user)))
        );
        panelUsersVentLayout.setVerticalGroup(
            panelUsersVentLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelUsersVentLayout.createSequentialGroup()
                .addGap(90, 90, 90)
                .addComponent(B_Agre_user)
                .addGap(4, 4, 4)
                .addComponent(B_Agre_Secre)
                .addGap(4, 4, 4)
                .addComponent(B_Consul_user))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panelUsersVent, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panelUsersVent, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void B_Agre_userActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_B_Agre_userActionPerformed

        Regis_odont01 RegisOdont01 = new Regis_odont01();
        RegisOdont01.setSize(780, 570);
        RegisOdont01.setLocation(30,60);
        
        panelUsersVent.removeAll();
        panelUsersVent.add(panelRegisOdonto01, BorderLayout.CENTER);
        panelUsersVent.revalidate();
        panelUsersVent.repaint();
    }//GEN-LAST:event_B_Agre_userActionPerformed

    private void B_Agre_SecreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_B_Agre_SecreActionPerformed

        Regis_secre01 RegisSecre01 = new Regis_secre01();
        RegisSecre01.setSize(780, 570);
        RegisSecre01.setLocation(30,60);
        
        panelUsersVent.removeAll();
        panelUsersVent.add(panelRegisSecre01, BorderLayout.CENTER);
        panelUsersVent.revalidate();
        panelUsersVent.repaint();
    }//GEN-LAST:event_B_Agre_SecreActionPerformed

    public static void main(String args[]) {
        
        Vent_users ventanaUsers = new Vent_users();
        ventanaUsers.setBounds(0, 0, 788, 570);
        ventanaUsers.setVisible(true);
        ventanaUsers.setResizable(false);
        ventanaUsers.setLocationRelativeTo(null);
        
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
              //  new Vent_procedi().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton B_Agre_Secre;
    private javax.swing.JButton B_Agre_user;
    private javax.swing.JButton B_Consul_user;
    public static javax.swing.JPanel panelUsersVent;
    // End of variables declaration//GEN-END:variables
}