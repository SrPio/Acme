
package AcmePrincipal;

import AdminPack.vista.AdminGui;
import AdminPack.vista.Regis_odont01;
import controlador.CtrlUsuario;
import modelo.ConsultasUsuario;
import modelo.Usuario;

public class PrincipalClass {
    
    Usuario mod = new Usuario();
    ConsultasUsuario modC = new ConsultasUsuario();
    Regis_odont01 frm = new Regis_odont01();
    
    CtrlUsuario ctrl = new CtrlUsuario(mod, modC, frm);
    
}
