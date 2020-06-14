
package Controlador;

import Coneccion.BD_PSQL;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import javax.swing.JOptionPane;


public class C_AGREGAR_USUARIO {
    
    private BD_PSQL ObjConn = new BD_PSQL();
    private Connection conn = ObjConn.getConexion(); // llamar la conexion 
    private PreparedStatement ps = null; // preparar la query
    private ResultSet rs = null; // Se va a guardar el resultado de la query
    private int validar_login = 0;
    private String SQL = "INSERT INTO USUARIO (id_usuario,usu_nombre,usu_apellido,usu_rut,usu_contrasenia,id_tipo_usuario) VALUES (nextval('id_usuario'),?,?,?,?,?)";
    private String SQL_validar = "SELECT COUNT(ID_USUARIO) as \"ID\"  FROM USUARIO WHERE USU_RUT = ? ";

    public void AgregarUsario(String rut , String nombre , String apellido , String pass){
        
        try {
            
            ps = conn.prepareStatement(SQL);
            ps.setString(1, nombre); // PASAR PARAPRETROS AL PRIMER signo de interrogacion QUE ENCONTREMOS
            ps.setString(2, apellido);
            ps.setString(3, rut);
            ps.setString(4, pass);
            ps.setInt(5,3);
            ps.execute(); // 
            JOptionPane.showMessageDialog(null, "Usuario registrado") ;
            ps.close();
            
        } catch (Exception e)  { JOptionPane.showMessageDialog(null, "Error al agregar el usuario , error : "+e+" ") ; }
    }
    
    public int validarexiste(String rut){
        
        try {
            
            ps = conn.prepareStatement(SQL_validar);
            ps.setString(1, rut);
            rs = ps.executeQuery();
            
            while (rs.next()) {
                
                if (rs.getString("ID").equals("0")) {
                    validar_login = 0;
                } else{  validar_login = 1;}
            }
            
        } catch (Exception e) {
        }
        return validar_login;
    }
        

    
}
