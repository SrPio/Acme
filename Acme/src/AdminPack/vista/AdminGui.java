/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package AdminPack.vista;

import static AdminPack.vista.Vent_List_paci.panelListPaciVent;
import static AdminPack.vista.Vent_citas.panelCitasVent;
import static AdminPack.vista.Vent_clientes.panelClientesVent;
import static AdminPack.vista.Vent_facturas.panelFacturasVent;
import static AdminPack.vista.Vent_histo_clinic.panelHistoClinicVent;
import static AdminPack.vista.Vent_home.panelHomeDesign;
import java.awt.BorderLayout;
import static AdminPack.vista.Vent_procedi.panelProcediVent;
import static AdminPack.vista.Vent_reportes.panelRepoVent;
import static AdminPack.vista.Vent_users.panelUsersVent;
import javax.swing.ImageIcon;



/**
 *
 * @author Andres
 */
public class AdminGui extends javax.swing.JFrame {
    
   ImageIcon iconobtnNS = new ImageIcon("src/acme/Images/User_B.png");
   ImageIcon iconobtn2NS = new ImageIcon("src/acme/Images/Inicio_B.png");
   ImageIcon iconobtn3NS = new ImageIcon("src/acme/Images/Procedimientos_B.png");
   ImageIcon iconobtn4NS = new ImageIcon("src/acme/Images/Reportes_B.png");
   ImageIcon iconobtn5NS = new ImageIcon("src/acme/Images/Citas_B.png");
   ImageIcon iconobtn6NS = new ImageIcon("src/acme/Images/Clientes_B.png");
   ImageIcon iconobtn7NS = new ImageIcon("src/acme/Images/Facturas_B.png");
   ImageIcon iconobtn8NS = new ImageIcon("src/acme/Images/ListaPacientes_B.png");
   ImageIcon iconobtn9NS = new ImageIcon("src/acme/Images/HistoriasClinicas_B.png");

   ImageIcon iconobtn = new ImageIcon("src/acme/Images/User_B_Selected.png");
   ImageIcon iconobtn2 = new ImageIcon("src/acme/Images/Inicio_B_Selected.png");
   ImageIcon iconobtn3 = new ImageIcon("src/acme/Images/Procedimientos_B_Selected.png");
   ImageIcon iconobtn4 = new ImageIcon("src/acme/Images/Reportes_B_Selected.png");
   ImageIcon iconobtn5 = new ImageIcon("src/acme/Images/Citas_B_Selected.png");
   ImageIcon iconobtn6 = new ImageIcon("src/acme/Images/Clientes_B_Selected.png");
   ImageIcon iconobtn7 = new ImageIcon("src/acme/Images/Facturas_B_Selected.png");
   ImageIcon iconobtn8 = new ImageIcon("src/acme/Images/ListaPacientes_B_Selected.png");
   ImageIcon iconobtn9 = new ImageIcon("src/acme/Images/HistoriasClinicas_B_Selected.png");
    
    public AdminGui() {
        
        initComponents();
        
        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        B_Inicio = new javax.swing.JButton();
        B_Procedimientos = new javax.swing.JButton();
        B_Reportes = new javax.swing.JButton();
        B_Citas = new javax.swing.JButton();
        B_Clientes = new javax.swing.JButton();
        B_Facturas = new javax.swing.JButton();
        B_ListaPacientes = new javax.swing.JButton();
        B_HistoClinicas = new javax.swing.JButton();
        Logo = new javax.swing.JLabel();
        B_user = new javax.swing.JButton();
        BarraLateral = new javax.swing.JLabel();
        PanelCentral = new javax.swing.JPanel();
        panelCentral = new javax.swing.JPanel();
        ImagenHome = new javax.swing.JLabel();
        LabeBienvenido = new javax.swing.JLabel();
        botonX = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        setResizable(false);

        jPanel1.setBackground(new java.awt.Color(248, 248, 248));
        jPanel1.setMaximumSize(new java.awt.Dimension(1233, 693));
        jPanel1.setMinimumSize(new java.awt.Dimension(1233, 693));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        B_Inicio.setBackground(new java.awt.Color(255, 255, 255));
        B_Inicio.setFont(new java.awt.Font("Bahnschrift", 0, 18)); // NOI18N
        B_Inicio.setForeground(new java.awt.Color(255, 0, 0));
        B_Inicio.setIcon(new javax.swing.ImageIcon(getClass().getResource("/acme/Images/Inicio_B_Selected.png"))); // NOI18N
        B_Inicio.setBorderPainted(false);
        B_Inicio.setContentAreaFilled(false);
        B_Inicio.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        B_Inicio.setFocusPainted(false);
        B_Inicio.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        B_Inicio.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                B_InicioMousePressed(evt);
            }
        });
        B_Inicio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                B_InicioActionPerformed(evt);
            }
        });
        jPanel1.add(B_Inicio, new org.netbeans.lib.awtextra.AbsoluteConstraints(24, 80, 340, 60));

        B_Procedimientos.setBackground(new java.awt.Color(255, 255, 255));
        B_Procedimientos.setFont(new java.awt.Font("Bahnschrift", 0, 18)); // NOI18N
        B_Procedimientos.setForeground(new java.awt.Color(255, 0, 0));
        B_Procedimientos.setIcon(new javax.swing.ImageIcon(getClass().getResource("/acme/Images/Procedimientos_B.png"))); // NOI18N
        B_Procedimientos.setBorderPainted(false);
        B_Procedimientos.setContentAreaFilled(false);
        B_Procedimientos.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        B_Procedimientos.setFocusPainted(false);
        B_Procedimientos.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        B_Procedimientos.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                B_ProcedimientosMousePressed(evt);
            }
        });
        B_Procedimientos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                B_ProcedimientosActionPerformed(evt);
            }
        });
        jPanel1.add(B_Procedimientos, new org.netbeans.lib.awtextra.AbsoluteConstraints(24, 130, 340, 60));

        B_Reportes.setBackground(new java.awt.Color(255, 255, 255));
        B_Reportes.setFont(new java.awt.Font("Bahnschrift", 0, 18)); // NOI18N
        B_Reportes.setForeground(new java.awt.Color(255, 0, 0));
        B_Reportes.setIcon(new javax.swing.ImageIcon(getClass().getResource("/acme/Images/Reportes_B.png"))); // NOI18N
        B_Reportes.setBorderPainted(false);
        B_Reportes.setContentAreaFilled(false);
        B_Reportes.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        B_Reportes.setFocusPainted(false);
        B_Reportes.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        B_Reportes.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                B_ReportesMousePressed(evt);
            }
        });
        B_Reportes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                B_ReportesActionPerformed(evt);
            }
        });
        jPanel1.add(B_Reportes, new org.netbeans.lib.awtextra.AbsoluteConstraints(24, 180, 340, 60));

        B_Citas.setBackground(new java.awt.Color(255, 255, 255));
        B_Citas.setFont(new java.awt.Font("Bahnschrift", 0, 18)); // NOI18N
        B_Citas.setForeground(new java.awt.Color(255, 0, 0));
        B_Citas.setIcon(new javax.swing.ImageIcon(getClass().getResource("/acme/Images/Citas_B.png"))); // NOI18N
        B_Citas.setBorderPainted(false);
        B_Citas.setContentAreaFilled(false);
        B_Citas.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        B_Citas.setFocusPainted(false);
        B_Citas.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        B_Citas.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                B_CitasMousePressed(evt);
            }
        });
        B_Citas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                B_CitasActionPerformed(evt);
            }
        });
        jPanel1.add(B_Citas, new org.netbeans.lib.awtextra.AbsoluteConstraints(24, 280, 340, 60));

        B_Clientes.setBackground(new java.awt.Color(255, 255, 255));
        B_Clientes.setFont(new java.awt.Font("Bahnschrift", 0, 18)); // NOI18N
        B_Clientes.setForeground(new java.awt.Color(255, 0, 0));
        B_Clientes.setIcon(new javax.swing.ImageIcon(getClass().getResource("/acme/Images/Clientes_B.png"))); // NOI18N
        B_Clientes.setBorderPainted(false);
        B_Clientes.setContentAreaFilled(false);
        B_Clientes.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        B_Clientes.setFocusPainted(false);
        B_Clientes.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        B_Clientes.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                B_ClientesMousePressed(evt);
            }
        });
        B_Clientes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                B_ClientesActionPerformed(evt);
            }
        });
        jPanel1.add(B_Clientes, new org.netbeans.lib.awtextra.AbsoluteConstraints(24, 330, 340, 60));

        B_Facturas.setBackground(new java.awt.Color(255, 255, 255));
        B_Facturas.setFont(new java.awt.Font("Bahnschrift", 0, 18)); // NOI18N
        B_Facturas.setForeground(new java.awt.Color(255, 0, 0));
        B_Facturas.setIcon(new javax.swing.ImageIcon(getClass().getResource("/acme/Images/Facturas_B.png"))); // NOI18N
        B_Facturas.setBorderPainted(false);
        B_Facturas.setContentAreaFilled(false);
        B_Facturas.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        B_Facturas.setFocusPainted(false);
        B_Facturas.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        B_Facturas.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                B_FacturasMousePressed(evt);
            }
        });
        B_Facturas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                B_FacturasActionPerformed(evt);
            }
        });
        jPanel1.add(B_Facturas, new org.netbeans.lib.awtextra.AbsoluteConstraints(24, 380, 340, 60));

        B_ListaPacientes.setBackground(new java.awt.Color(255, 255, 255));
        B_ListaPacientes.setFont(new java.awt.Font("Bahnschrift", 0, 18)); // NOI18N
        B_ListaPacientes.setForeground(new java.awt.Color(255, 0, 0));
        B_ListaPacientes.setIcon(new javax.swing.ImageIcon(getClass().getResource("/acme/Images/ListaPacientes_B.png"))); // NOI18N
        B_ListaPacientes.setBorderPainted(false);
        B_ListaPacientes.setContentAreaFilled(false);
        B_ListaPacientes.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        B_ListaPacientes.setFocusPainted(false);
        B_ListaPacientes.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        B_ListaPacientes.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                B_ListaPacientesMousePressed(evt);
            }
        });
        B_ListaPacientes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                B_ListaPacientesActionPerformed(evt);
            }
        });
        jPanel1.add(B_ListaPacientes, new org.netbeans.lib.awtextra.AbsoluteConstraints(24, 430, 340, 60));

        B_HistoClinicas.setBackground(new java.awt.Color(255, 255, 255));
        B_HistoClinicas.setFont(new java.awt.Font("Bahnschrift", 0, 18)); // NOI18N
        B_HistoClinicas.setForeground(new java.awt.Color(255, 0, 0));
        B_HistoClinicas.setIcon(new javax.swing.ImageIcon(getClass().getResource("/acme/Images/HistoriasClinicas_B.png"))); // NOI18N
        B_HistoClinicas.setBorderPainted(false);
        B_HistoClinicas.setContentAreaFilled(false);
        B_HistoClinicas.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        B_HistoClinicas.setFocusPainted(false);
        B_HistoClinicas.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        B_HistoClinicas.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                B_HistoClinicasMousePressed(evt);
            }
        });
        B_HistoClinicas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                B_HistoClinicasActionPerformed(evt);
            }
        });
        jPanel1.add(B_HistoClinicas, new org.netbeans.lib.awtextra.AbsoluteConstraints(24, 480, 340, 60));

        Logo.setBackground(new java.awt.Color(102, 0, 255));
        Logo.setFont(new java.awt.Font("Bahnschrift", 0, 18)); // NOI18N
        Logo.setForeground(new java.awt.Color(255, 255, 255));
        Logo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/acme/Images/Logo.png"))); // NOI18N
        Logo.setToolTipText("");
        Logo.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jPanel1.add(Logo, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 600, 150, 60));

        B_user.setBackground(new java.awt.Color(255, 255, 255));
        B_user.setFont(new java.awt.Font("Bahnschrift", 0, 18)); // NOI18N
        B_user.setForeground(new java.awt.Color(255, 0, 0));
        B_user.setIcon(new javax.swing.ImageIcon(getClass().getResource("/acme/Images/User_B.png"))); // NOI18N
        B_user.setBorderPainted(false);
        B_user.setContentAreaFilled(false);
        B_user.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        B_user.setFocusPainted(false);
        B_user.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        B_user.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                B_userMousePressed(evt);
            }
        });
        B_user.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                B_userActionPerformed(evt);
            }
        });
        jPanel1.add(B_user, new org.netbeans.lib.awtextra.AbsoluteConstraints(24, 230, 340, 60));

        BarraLateral.setIcon(new javax.swing.ImageIcon(getClass().getResource("/acme/Images/BarraLateral.png"))); // NOI18N
        jPanel1.add(BarraLateral, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, -1, 669));

        PanelCentral.setBackground(new java.awt.Color(248, 248, 248));
        PanelCentral.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        panelCentral.setBackground(new java.awt.Color(255, 255, 255));
        panelCentral.setPreferredSize(new java.awt.Dimension(780, 570));

        ImagenHome.setBackground(new java.awt.Color(255, 255, 255));
        ImagenHome.setIcon(new javax.swing.ImageIcon(getClass().getResource("/acme/Images/AdminHome.png"))); // NOI18N

        LabeBienvenido.setFont(new java.awt.Font("Harlow Solid Italic", 0, 48)); // NOI18N
        LabeBienvenido.setForeground(new java.awt.Color(252, 177, 166));
        LabeBienvenido.setIcon(new javax.swing.ImageIcon(getClass().getResource("/acme/Images/BienvenidaHome.png"))); // NOI18N

        javax.swing.GroupLayout panelCentralLayout = new javax.swing.GroupLayout(panelCentral);
        panelCentral.setLayout(panelCentralLayout);
        panelCentralLayout.setHorizontalGroup(
            panelCentralLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelCentralLayout.createSequentialGroup()
                .addContainerGap(247, Short.MAX_VALUE)
                .addComponent(ImagenHome, javax.swing.GroupLayout.PREFERRED_SIZE, 527, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
            .addGroup(panelCentralLayout.createSequentialGroup()
                .addGap(63, 63, 63)
                .addComponent(LabeBienvenido, javax.swing.GroupLayout.PREFERRED_SIZE, 268, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        panelCentralLayout.setVerticalGroup(
            panelCentralLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelCentralLayout.createSequentialGroup()
                .addContainerGap(7, Short.MAX_VALUE)
                .addComponent(LabeBienvenido, javax.swing.GroupLayout.PREFERRED_SIZE, 143, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(ImagenHome, javax.swing.GroupLayout.PREFERRED_SIZE, 408, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        PanelCentral.add(panelCentral, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 60, -1, -1));

        botonX.setBackground(new java.awt.Color(255, 255, 255));
        botonX.setIcon(new javax.swing.ImageIcon(getClass().getResource("/acme/Images/BotonEquis.png"))); // NOI18N
        botonX.setBorder(null);
        botonX.setBorderPainted(false);
        botonX.setContentAreaFilled(false);
        botonX.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        botonX.setFocusPainted(false);
        botonX.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonXActionPerformed(evt);
            }
        });
        PanelCentral.add(botonX, new org.netbeans.lib.awtextra.AbsoluteConstraints(790, 10, 30, 30));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/acme/Images/VentanaCentral.png"))); // NOI18N
        PanelCentral.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 0, -1, 674));

        jPanel1.add(PanelCentral, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 10, 860, 680));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void botonXActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonXActionPerformed

        System.exit(0);
    }//GEN-LAST:event_botonXActionPerformed

    private void B_userActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_B_userActionPerformed

        Vent_users ventanaUsers = new Vent_users();
        ventanaUsers.setSize(780, 570);
        ventanaUsers.setLocation(30,60);
        
        panelCentral.removeAll();
        panelCentral.add(panelUsersVent, BorderLayout.CENTER);
        panelCentral.revalidate();
        panelCentral.repaint();
        
    }//GEN-LAST:event_B_userActionPerformed

    private void B_userMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_B_userMousePressed

        B_user.setIcon(iconobtn);
        B_Inicio.setIcon(iconobtn2NS);
        B_Procedimientos.setIcon(iconobtn3NS);
        B_Reportes.setIcon(iconobtn4NS);
        B_Citas.setIcon(iconobtn5NS);
        B_Clientes.setIcon(iconobtn6NS);
        B_Facturas.setIcon(iconobtn7NS);
        B_ListaPacientes.setIcon(iconobtn8NS);
        B_HistoClinicas.setIcon(iconobtn9NS);
    }//GEN-LAST:event_B_userMousePressed

    private void B_InicioMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_B_InicioMousePressed
        B_Inicio.setIcon(iconobtn2);
        B_Procedimientos.setIcon(iconobtn3NS);
        B_Reportes.setIcon(iconobtn4NS);
        B_user.setIcon(iconobtnNS);
        B_Citas.setIcon(iconobtn5NS);
        B_Clientes.setIcon(iconobtn6NS);
        B_Facturas.setIcon(iconobtn7NS);
        B_ListaPacientes.setIcon(iconobtn8NS);
        B_HistoClinicas.setIcon(iconobtn9NS);
        
                
    }//GEN-LAST:event_B_InicioMousePressed

    private void B_InicioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_B_InicioActionPerformed

        Vent_home VentHome = new Vent_home();
        VentHome.setSize(780, 570);
        VentHome.setLocation(30,60);
        
        panelCentral.removeAll();
        panelCentral.add(panelHomeDesign, BorderLayout.CENTER);
        panelCentral.revalidate();
        panelCentral.repaint();
    }//GEN-LAST:event_B_InicioActionPerformed

    private void B_ProcedimientosMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_B_ProcedimientosMousePressed

        B_Inicio.setIcon(iconobtn2NS);
        B_Procedimientos.setIcon(iconobtn3);
        B_Reportes.setIcon(iconobtn4NS);
        B_user.setIcon(iconobtnNS);
        B_Citas.setIcon(iconobtn5NS);
        B_Clientes.setIcon(iconobtn6NS);
        B_Facturas.setIcon(iconobtn7NS);
        B_ListaPacientes.setIcon(iconobtn8NS);
        B_HistoClinicas.setIcon(iconobtn9NS);
        
    }//GEN-LAST:event_B_ProcedimientosMousePressed

    private void B_ProcedimientosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_B_ProcedimientosActionPerformed

        Vent_procedi ventanaProcedi = new Vent_procedi();
        ventanaProcedi.setSize(780, 570);
        ventanaProcedi.setLocation(30,60);
        
        panelCentral.removeAll();
        panelCentral.add(panelProcediVent, BorderLayout.CENTER);
        panelCentral.revalidate();
        panelCentral.repaint();
    }//GEN-LAST:event_B_ProcedimientosActionPerformed

    private void B_ReportesMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_B_ReportesMousePressed

        B_Inicio.setIcon(iconobtn2NS);
        B_Procedimientos.setIcon(iconobtn3NS);
        B_Reportes.setIcon(iconobtn4);
        B_user.setIcon(iconobtnNS);
        B_Citas.setIcon(iconobtn5NS);
        B_Clientes.setIcon(iconobtn6NS);
        B_Facturas.setIcon(iconobtn7NS);
        B_ListaPacientes.setIcon(iconobtn8NS);
        B_HistoClinicas.setIcon(iconobtn9NS);
    }//GEN-LAST:event_B_ReportesMousePressed

    private void B_ReportesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_B_ReportesActionPerformed

        Vent_reportes ventanaRepo = new Vent_reportes();
        ventanaRepo.setSize(780, 570);
        ventanaRepo.setLocation(30,60);
        
        panelCentral.removeAll();
        panelCentral.add(panelRepoVent, BorderLayout.CENTER);
        panelCentral.revalidate();
        panelCentral.repaint();
    }//GEN-LAST:event_B_ReportesActionPerformed

    private void B_CitasMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_B_CitasMousePressed

        B_Inicio.setIcon(iconobtn2NS);
        B_Procedimientos.setIcon(iconobtn3NS);
        B_Reportes.setIcon(iconobtn4NS);
        B_user.setIcon(iconobtnNS);
        B_Citas.setIcon(iconobtn5);
        B_Clientes.setIcon(iconobtn6NS);
        B_Facturas.setIcon(iconobtn7NS);
        B_ListaPacientes.setIcon(iconobtn8NS);
        B_HistoClinicas.setIcon(iconobtn9NS);
    }//GEN-LAST:event_B_CitasMousePressed

    private void B_CitasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_B_CitasActionPerformed

        Vent_citas ventanaCitas = new Vent_citas();
        ventanaCitas.setSize(780, 570);
        ventanaCitas.setLocation(30,60);
        
        panelCentral.removeAll();
        panelCentral.add(panelCitasVent, BorderLayout.CENTER);
        panelCentral.revalidate();
        panelCentral.repaint();
    }//GEN-LAST:event_B_CitasActionPerformed

    private void B_ClientesMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_B_ClientesMousePressed

        B_Inicio.setIcon(iconobtn2NS);
        B_Procedimientos.setIcon(iconobtn3NS);
        B_Reportes.setIcon(iconobtn4NS);
        B_user.setIcon(iconobtnNS);
        B_Citas.setIcon(iconobtn5NS);
        B_Clientes.setIcon(iconobtn6);
        B_Facturas.setIcon(iconobtn7NS);
        B_ListaPacientes.setIcon(iconobtn8NS);
        B_HistoClinicas.setIcon(iconobtn9NS);
    }//GEN-LAST:event_B_ClientesMousePressed

    private void B_ClientesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_B_ClientesActionPerformed

        Vent_clientes ventanaClientes = new Vent_clientes();
        ventanaClientes.setSize(780, 570);
        ventanaClientes.setLocation(30,60);
        
        panelCentral.removeAll();
        panelCentral.add(panelClientesVent, BorderLayout.CENTER);
        panelCentral.revalidate();
        panelCentral.repaint();
    }//GEN-LAST:event_B_ClientesActionPerformed

    private void B_FacturasMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_B_FacturasMousePressed

        B_Inicio.setIcon(iconobtn2NS);
        B_Procedimientos.setIcon(iconobtn3NS);
        B_Reportes.setIcon(iconobtn4NS);
        B_user.setIcon(iconobtnNS);
        B_Citas.setIcon(iconobtn5NS);
        B_Clientes.setIcon(iconobtn6NS);
        B_Facturas.setIcon(iconobtn7);
        B_ListaPacientes.setIcon(iconobtn8NS);
        B_HistoClinicas.setIcon(iconobtn9NS);
    }//GEN-LAST:event_B_FacturasMousePressed

    private void B_FacturasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_B_FacturasActionPerformed

        Vent_facturas ventanaFacturas = new Vent_facturas();
        ventanaFacturas.setSize(780, 570);
        ventanaFacturas.setLocation(30,60);
        
        panelCentral.removeAll();
        panelCentral.add(panelFacturasVent, BorderLayout.CENTER);
        panelCentral.revalidate();
        panelCentral.repaint();
    }//GEN-LAST:event_B_FacturasActionPerformed

    private void B_ListaPacientesMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_B_ListaPacientesMousePressed

        B_Inicio.setIcon(iconobtn2NS);
        B_Procedimientos.setIcon(iconobtn3NS);
        B_Reportes.setIcon(iconobtn4NS);
        B_user.setIcon(iconobtnNS);
        B_Citas.setIcon(iconobtn5NS);
        B_Clientes.setIcon(iconobtn6NS);
        B_Facturas.setIcon(iconobtn7NS);
        B_ListaPacientes.setIcon(iconobtn8);
        B_HistoClinicas.setIcon(iconobtn9NS);
    }//GEN-LAST:event_B_ListaPacientesMousePressed

    private void B_ListaPacientesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_B_ListaPacientesActionPerformed

        Vent_List_paci ventanaListPaci = new Vent_List_paci();
        ventanaListPaci.setSize(780, 570);
        ventanaListPaci.setLocation(30,60);
        
        panelCentral.removeAll();
        panelCentral.add(panelListPaciVent, BorderLayout.CENTER);
        panelCentral.revalidate();
        panelCentral.repaint();
    }//GEN-LAST:event_B_ListaPacientesActionPerformed

    private void B_HistoClinicasMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_B_HistoClinicasMousePressed

        B_Inicio.setIcon(iconobtn2NS);
        B_Procedimientos.setIcon(iconobtn3NS);
        B_Reportes.setIcon(iconobtn4NS);
        B_user.setIcon(iconobtnNS);
        B_Citas.setIcon(iconobtn5NS);
        B_Clientes.setIcon(iconobtn6NS);
        B_Facturas.setIcon(iconobtn7NS);
        B_ListaPacientes.setIcon(iconobtn8NS);
        B_HistoClinicas.setIcon(iconobtn9);
    }//GEN-LAST:event_B_HistoClinicasMousePressed

    private void B_HistoClinicasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_B_HistoClinicasActionPerformed

        Vent_histo_clinic ventanaHistoClinic = new Vent_histo_clinic();
        ventanaHistoClinic.setSize(780, 570);
        ventanaHistoClinic.setLocation(30,60);
        
        panelCentral.removeAll();
        panelCentral.add(panelHistoClinicVent, BorderLayout.CENTER);
        panelCentral.revalidate();
        panelCentral.repaint();
    }//GEN-LAST:event_B_HistoClinicasActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {

        AdminGui ventanaAdmin = new AdminGui();
        ventanaAdmin.setBounds(0, 0, 1233, 693);
        ventanaAdmin.setVisible(true);
        ventanaAdmin.setResizable(false);
        ventanaAdmin.setLocationRelativeTo(null);
        
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                // new AdminGui().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton B_Citas;
    private javax.swing.JButton B_Clientes;
    private javax.swing.JButton B_Facturas;
    private javax.swing.JButton B_HistoClinicas;
    private javax.swing.JButton B_Inicio;
    private javax.swing.JButton B_ListaPacientes;
    private javax.swing.JButton B_Procedimientos;
    private javax.swing.JButton B_Reportes;
    private javax.swing.JButton B_user;
    private javax.swing.JLabel BarraLateral;
    private javax.swing.JLabel ImagenHome;
    private javax.swing.JLabel LabeBienvenido;
    private javax.swing.JLabel Logo;
    private javax.swing.JPanel PanelCentral;
    private javax.swing.JButton botonX;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    public static javax.swing.JPanel panelCentral;
    // End of variables declaration//GEN-END:variables
}
