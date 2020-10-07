
package controlador;

import AdminPack.vista.Regis_odont01;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import modelo.ConsultasUsuario;
import modelo.Usuario;

public class CtrlUsuario {
    
    private Usuario mod;
    private ConsultasUsuario modC;
    private Regis_odont01 frm;
    
    public CtrlUsuario(Usuario mod, ConsultasUsuario modC, Regis_odont01 frm){
        this.mod = mod;
        this.modC = modC;
        this.frm = frm;
        this.frm.B_Agre_Odonto.addActionListener((ActionListener) this);
    }
   
    
    public void actionPerformed(ActionEvent e)
    {
        if (e.getSource() == frm.B_Agre_Odonto)
        {
            mod.setNombre(frm.fieldNombre.getText());
            mod.setApellido(frm.fieldApellido.getText());
            mod.setNum_Documento(Integer.parseInt(frm.fieldDocumento.getText()));
            mod.setTipo_Documento(frm.fieldTipoDocumento.getText());
            mod.setCorreo(frm.fieldCorreo.getText());
            mod.setFecha_Nacimiento(frm.fieldFechaNacimiento.getText());
            mod.setLugar_Graduacion(frm.fieldLugarGraduacion.getText());
            mod.setTitulos(frm.fieldEspecializa.getText());
            mod.setNombre_Usuario(frm.fieldUsuario.getText());
            mod.setContraseña(frm.fieldContraseña.getText());
            
        }
        
    }
}
