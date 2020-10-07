package AdminPack.vista;

import static AdminPack.vista.Regis_odont02.panelRegisOdonto02;
import java.awt.BorderLayout;

public class Vent_home extends javax.swing.JFrame {

    public Vent_home() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panelHomeDesign = new javax.swing.JPanel();
        LabeBienvenido = new javax.swing.JLabel();
        ImagenHome = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        panelHomeDesign.setBackground(new java.awt.Color(255, 255, 255));
        panelHomeDesign.setPreferredSize(new java.awt.Dimension(780, 570));

        LabeBienvenido.setFont(new java.awt.Font("Harlow Solid Italic", 0, 48)); // NOI18N
        LabeBienvenido.setForeground(new java.awt.Color(252, 177, 166));
        LabeBienvenido.setIcon(new javax.swing.ImageIcon(getClass().getResource("/acme/Images/BienvenidaHome.png"))); // NOI18N

        ImagenHome.setBackground(new java.awt.Color(255, 255, 255));
        ImagenHome.setIcon(new javax.swing.ImageIcon(getClass().getResource("/acme/Images/AdminHome.png"))); // NOI18N

        javax.swing.GroupLayout panelHomeDesignLayout = new javax.swing.GroupLayout(panelHomeDesign);
        panelHomeDesign.setLayout(panelHomeDesignLayout);
        panelHomeDesignLayout.setHorizontalGroup(
            panelHomeDesignLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelHomeDesignLayout.createSequentialGroup()
                .addContainerGap(247, Short.MAX_VALUE)
                .addComponent(ImagenHome, javax.swing.GroupLayout.PREFERRED_SIZE, 527, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
            .addGroup(panelHomeDesignLayout.createSequentialGroup()
                .addGap(63, 63, 63)
                .addComponent(LabeBienvenido, javax.swing.GroupLayout.PREFERRED_SIZE, 268, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        panelHomeDesignLayout.setVerticalGroup(
            panelHomeDesignLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelHomeDesignLayout.createSequentialGroup()
                .addContainerGap(7, Short.MAX_VALUE)
                .addComponent(LabeBienvenido, javax.swing.GroupLayout.PREFERRED_SIZE, 143, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(ImagenHome, javax.swing.GroupLayout.PREFERRED_SIZE, 408, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panelHomeDesign, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panelHomeDesign, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    public static void main(String args[]) {
        
        Vent_home VentHome = new Vent_home();
        VentHome.setBounds(0, 0, 780, 570);
        VentHome.setVisible(true);
        VentHome.setResizable(false);
        VentHome.setLocationRelativeTo(null);
        
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
              //  new Vent_procedi().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel ImagenHome;
    private javax.swing.JLabel LabeBienvenido;
    public static javax.swing.JPanel panelHomeDesign;
    // End of variables declaration//GEN-END:variables
}