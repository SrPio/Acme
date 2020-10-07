package AdminPack.vista;

import static AdminPack.vista.Regis_odont02.panelRegisOdonto02;
import java.awt.BorderLayout;

public class Regis_odont01 extends javax.swing.JFrame {

    public Regis_odont01() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panelRegisOdonto01 = new javax.swing.JPanel();
        jLabel7 = new javax.swing.JLabel();
        fieldNombre = new javax.swing.JTextField();
        fieldApellido = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        fieldDocumento = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        fieldTipoDocumento = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        B_Agre_Odonto = new javax.swing.JButton();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        fieldCorreo = new javax.swing.JTextField();
        fieldLugarGraduacion = new javax.swing.JTextField();
        fieldFechaNacimiento = new javax.swing.JTextField();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        fieldEspecializa = new javax.swing.JTextField();
        jLabel13 = new javax.swing.JLabel();
        fieldUsuario = new javax.swing.JTextField();
        fieldContraseña = new javax.swing.JTextField();
        jLabel17 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        ComboEstado = new javax.swing.JComboBox<>();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        panelRegisOdonto01.setBackground(new java.awt.Color(255, 255, 255));
        panelRegisOdonto01.setPreferredSize(new java.awt.Dimension(780, 570));

        jLabel7.setFont(new java.awt.Font("Bahnschrift", 0, 14)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(51, 51, 51));
        jLabel7.setText("NOMBRE :");

        fieldNombre.setBackground(new java.awt.Color(229, 229, 229));
        fieldNombre.setFont(new java.awt.Font("Bahnschrift", 0, 14)); // NOI18N
        fieldNombre.setBorder(null);
        fieldNombre.setPreferredSize(new java.awt.Dimension(59, 32));

        fieldApellido.setBackground(new java.awt.Color(229, 229, 229));
        fieldApellido.setFont(new java.awt.Font("Bahnschrift", 0, 14)); // NOI18N
        fieldApellido.setBorder(null);
        fieldApellido.setPreferredSize(new java.awt.Dimension(59, 32));

        jLabel8.setFont(new java.awt.Font("Bahnschrift", 0, 14)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(51, 51, 51));
        jLabel8.setText("APELLIDO :");

        fieldDocumento.setBackground(new java.awt.Color(229, 229, 229));
        fieldDocumento.setFont(new java.awt.Font("Bahnschrift", 0, 14)); // NOI18N
        fieldDocumento.setBorder(null);
        fieldDocumento.setPreferredSize(new java.awt.Dimension(59, 32));

        jLabel9.setFont(new java.awt.Font("Bahnschrift", 0, 14)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(51, 51, 51));
        jLabel9.setText("DOCUMENTO :");

        fieldTipoDocumento.setBackground(new java.awt.Color(229, 229, 229));
        fieldTipoDocumento.setFont(new java.awt.Font("Bahnschrift", 0, 14)); // NOI18N
        fieldTipoDocumento.setBorder(null);
        fieldTipoDocumento.setPreferredSize(new java.awt.Dimension(59, 32));

        jLabel10.setFont(new java.awt.Font("Bahnschrift", 0, 14)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(51, 51, 51));
        jLabel10.setText("TIPO DE DOCUMENTO :");

        B_Agre_Odonto.setBackground(new java.awt.Color(255, 255, 255));
        B_Agre_Odonto.setFont(new java.awt.Font("Bahnschrift", 0, 18)); // NOI18N
        B_Agre_Odonto.setForeground(new java.awt.Color(255, 255, 255));
        B_Agre_Odonto.setIcon(new javax.swing.ImageIcon(getClass().getResource("/acme/Images/Boton_morado2.png"))); // NOI18N
        B_Agre_Odonto.setText("REGISTRAR");
        B_Agre_Odonto.setBorderPainted(false);
        B_Agre_Odonto.setContentAreaFilled(false);
        B_Agre_Odonto.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        B_Agre_Odonto.setFocusPainted(false);
        B_Agre_Odonto.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        B_Agre_Odonto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                B_Agre_OdontoActionPerformed(evt);
            }
        });

        jLabel11.setFont(new java.awt.Font("Bahnschrift", 0, 18)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(51, 51, 51));
        jLabel11.setText("ODONTOLOGO");

        jLabel12.setFont(new java.awt.Font("Bahnschrift", 0, 14)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(51, 51, 51));
        jLabel12.setText("CORREO :");

        fieldCorreo.setBackground(new java.awt.Color(229, 229, 229));
        fieldCorreo.setFont(new java.awt.Font("Bahnschrift", 0, 14)); // NOI18N
        fieldCorreo.setBorder(null);
        fieldCorreo.setPreferredSize(new java.awt.Dimension(59, 32));

        fieldLugarGraduacion.setBackground(new java.awt.Color(229, 229, 229));
        fieldLugarGraduacion.setFont(new java.awt.Font("Bahnschrift", 0, 14)); // NOI18N
        fieldLugarGraduacion.setBorder(null);
        fieldLugarGraduacion.setPreferredSize(new java.awt.Dimension(59, 32));

        fieldFechaNacimiento.setBackground(new java.awt.Color(229, 229, 229));
        fieldFechaNacimiento.setFont(new java.awt.Font("Bahnschrift", 0, 14)); // NOI18N
        fieldFechaNacimiento.setBorder(null);
        fieldFechaNacimiento.setPreferredSize(new java.awt.Dimension(59, 32));

        jLabel14.setFont(new java.awt.Font("Bahnschrift", 0, 14)); // NOI18N
        jLabel14.setForeground(new java.awt.Color(51, 51, 51));
        jLabel14.setText("FECHA DE NACIMIENTO :");

        jLabel15.setFont(new java.awt.Font("Bahnschrift", 0, 14)); // NOI18N
        jLabel15.setForeground(new java.awt.Color(51, 51, 51));
        jLabel15.setText("LUGAR DE GRADUACION:");

        jLabel16.setFont(new java.awt.Font("Bahnschrift", 0, 14)); // NOI18N
        jLabel16.setForeground(new java.awt.Color(51, 51, 51));
        jLabel16.setText("DESCRIPCION Y ESPECIALIZACIONES:");

        fieldEspecializa.setBackground(new java.awt.Color(229, 229, 229));
        fieldEspecializa.setFont(new java.awt.Font("Bahnschrift", 0, 14)); // NOI18N
        fieldEspecializa.setBorder(null);
        fieldEspecializa.setPreferredSize(new java.awt.Dimension(59, 32));

        jLabel13.setFont(new java.awt.Font("Bahnschrift", 0, 14)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(51, 51, 51));
        jLabel13.setText("USUARIO :");

        fieldUsuario.setBackground(new java.awt.Color(229, 229, 229));
        fieldUsuario.setFont(new java.awt.Font("Bahnschrift", 0, 14)); // NOI18N
        fieldUsuario.setBorder(null);
        fieldUsuario.setPreferredSize(new java.awt.Dimension(59, 32));

        fieldContraseña.setBackground(new java.awt.Color(229, 229, 229));
        fieldContraseña.setFont(new java.awt.Font("Bahnschrift", 0, 14)); // NOI18N
        fieldContraseña.setBorder(null);
        fieldContraseña.setPreferredSize(new java.awt.Dimension(59, 32));

        jLabel17.setFont(new java.awt.Font("Bahnschrift", 0, 14)); // NOI18N
        jLabel17.setForeground(new java.awt.Color(51, 51, 51));
        jLabel17.setText("CONTRASEÑA :");

        jLabel18.setFont(new java.awt.Font("Bahnschrift", 0, 14)); // NOI18N
        jLabel18.setForeground(new java.awt.Color(51, 51, 51));
        jLabel18.setText("ESTADO :");

        ComboEstado.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Activo", "Inactivo" }));

        javax.swing.GroupLayout panelRegisOdonto01Layout = new javax.swing.GroupLayout(panelRegisOdonto01);
        panelRegisOdonto01.setLayout(panelRegisOdonto01Layout);
        panelRegisOdonto01Layout.setHorizontalGroup(
            panelRegisOdonto01Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelRegisOdonto01Layout.createSequentialGroup()
                .addGap(312, 312, 312)
                .addComponent(jLabel11))
            .addGroup(panelRegisOdonto01Layout.createSequentialGroup()
                .addGap(90, 90, 90)
                .addComponent(jLabel7)
                .addGap(17, 17, 17)
                .addComponent(fieldNombre, javax.swing.GroupLayout.PREFERRED_SIZE, 158, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(122, 122, 122)
                .addComponent(jLabel8)
                .addGap(19, 19, 19)
                .addComponent(fieldApellido, javax.swing.GroupLayout.PREFERRED_SIZE, 158, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(panelRegisOdonto01Layout.createSequentialGroup()
                .addGap(60, 60, 60)
                .addComponent(jLabel9)
                .addGap(22, 22, 22)
                .addComponent(fieldDocumento, javax.swing.GroupLayout.PREFERRED_SIZE, 158, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(52, 52, 52)
                .addComponent(jLabel10)
                .addGap(18, 18, 18)
                .addComponent(fieldTipoDocumento, javax.swing.GroupLayout.PREFERRED_SIZE, 158, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(panelRegisOdonto01Layout.createSequentialGroup()
                .addGap(90, 90, 90)
                .addComponent(jLabel12)
                .addGap(20, 20, 20)
                .addComponent(fieldCorreo, javax.swing.GroupLayout.PREFERRED_SIZE, 158, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(42, 42, 42)
                .addComponent(jLabel14)
                .addGap(13, 13, 13)
                .addComponent(fieldFechaNacimiento, javax.swing.GroupLayout.PREFERRED_SIZE, 158, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(panelRegisOdonto01Layout.createSequentialGroup()
                .addGap(90, 90, 90)
                .addComponent(jLabel15)
                .addGap(212, 212, 212)
                .addComponent(jLabel16))
            .addGroup(panelRegisOdonto01Layout.createSequentialGroup()
                .addGap(520, 520, 520)
                .addComponent(B_Agre_Odonto, javax.swing.GroupLayout.PREFERRED_SIZE, 249, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(panelRegisOdonto01Layout.createSequentialGroup()
                .addGap(90, 90, 90)
                .addGroup(panelRegisOdonto01Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelRegisOdonto01Layout.createSequentialGroup()
                        .addComponent(jLabel13)
                        .addGap(17, 17, 17)
                        .addComponent(fieldUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, 158, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(66, 66, 66)
                        .addComponent(jLabel17)
                        .addGap(18, 18, 18)
                        .addComponent(fieldContraseña, javax.swing.GroupLayout.PREFERRED_SIZE, 158, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(panelRegisOdonto01Layout.createSequentialGroup()
                        .addComponent(jLabel18)
                        .addGap(22, 22, 22)
                        .addComponent(ComboEstado, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(panelRegisOdonto01Layout.createSequentialGroup()
                        .addComponent(fieldLugarGraduacion, javax.swing.GroupLayout.PREFERRED_SIZE, 240, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(130, 130, 130)
                        .addComponent(fieldEspecializa, javax.swing.GroupLayout.PREFERRED_SIZE, 240, javax.swing.GroupLayout.PREFERRED_SIZE))))
        );
        panelRegisOdonto01Layout.setVerticalGroup(
            panelRegisOdonto01Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelRegisOdonto01Layout.createSequentialGroup()
                .addGap(56, 56, 56)
                .addComponent(jLabel11)
                .addGap(72, 72, 72)
                .addGroup(panelRegisOdonto01Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(fieldNombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(fieldApellido, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(panelRegisOdonto01Layout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addGroup(panelRegisOdonto01Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel7)
                            .addComponent(jLabel8))))
                .addGap(18, 18, 18)
                .addGroup(panelRegisOdonto01Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel9)
                    .addComponent(fieldDocumento, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel10)
                    .addComponent(fieldTipoDocumento, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(panelRegisOdonto01Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel12)
                    .addComponent(fieldCorreo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel14)
                    .addComponent(fieldFechaNacimiento, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(38, 38, 38)
                .addGroup(panelRegisOdonto01Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel15)
                    .addComponent(jLabel16))
                .addGap(3, 3, 3)
                .addGroup(panelRegisOdonto01Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(fieldLugarGraduacion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(fieldEspecializa, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(34, 34, 34)
                .addGroup(panelRegisOdonto01Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelRegisOdonto01Layout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addComponent(jLabel13))
                    .addComponent(fieldUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(panelRegisOdonto01Layout.createSequentialGroup()
                        .addGap(7, 7, 7)
                        .addComponent(jLabel17))
                    .addComponent(fieldContraseña, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(panelRegisOdonto01Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel18)
                    .addComponent(ComboEstado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(B_Agre_Odonto, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panelRegisOdonto01, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panelRegisOdonto01, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void B_Agre_OdontoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_B_Agre_OdontoActionPerformed

    }//GEN-LAST:event_B_Agre_OdontoActionPerformed

    public static void main(String args[]) {
        
        Regis_odont01 RegisOdont01 = new Regis_odont01();
        RegisOdont01.setBounds(0, 0, 780, 570);
        RegisOdont01.setVisible(true);
        RegisOdont01.setResizable(false);
        RegisOdont01.setLocationRelativeTo(null);
        
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
              //  new Vent_procedi().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    public javax.swing.JButton B_Agre_Odonto;
    private javax.swing.JComboBox<String> ComboEstado;
    public javax.swing.JTextField fieldApellido;
    private javax.swing.JTextField fieldContraseña;
    public javax.swing.JTextField fieldCorreo;
    public javax.swing.JTextField fieldDocumento;
    public javax.swing.JTextField fieldEspecializa;
    public javax.swing.JTextField fieldFechaNacimiento;
    public javax.swing.JTextField fieldLugarGraduacion;
    public javax.swing.JTextField fieldNombre;
    public javax.swing.JTextField fieldTipoDocumento;
    private javax.swing.JTextField fieldUsuario;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    public static javax.swing.JPanel panelRegisOdonto01;
    // End of variables declaration//GEN-END:variables
}
