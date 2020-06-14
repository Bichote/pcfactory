
package Controlador;

import Coneccion.BD_PSQL;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;

public class C_HOME_ADMIN {

    private BD_PSQL ObjConn = new BD_PSQL();
    private Connection conn = ObjConn.getConexion(); // llamar la conexion 
    private PreparedStatement ps = null; // preparar la query
    private ResultSet rs = null; // Se va a guardar el resultado de la query
    private ResultSet rsTOTAL = null;
    private String TOTAL_PENDIENTES = "";
    private String TOTAL = "";
    
    private String SQL_COUNT_USER_PENDIENTES = "SELECT COUNT(ID_USUARIO) AS \"TOTAL\" FROM usuario WHERE ID_TIPO_USUARIO = 3";
    
    private String SQL_COUNT = "SELECT COUNT(*) AS \"TOTAL\" FROM USUARIO";
    
    private String SQL_USUARIOS = "SELECT US.ID_USUARIO AS \"ID\" ,  US.USU_NOMBRE AS \"NOMBRE\" ,  US.USU_APELLIDO AS \"APELLIDO\" ,  US.USU_RUT AS \"RUT\" , TU.TU_DESCRIPCION AS \"TIPO\" FROM USUARIO US JOIN TIPO_USUARIO TU ON US.ID_TIPO_USUARIO = TU.ID_TIPO_USUARIO  WHERE US.ID_TIPO_USUARIO <> 1";
    
    private String SQL_ELIMINAR_USUARIO = "DELETE FROM USUARIO WHERE USU_RUT = ? ";
    
    private String SQL_MODIFICAR_USUARIO = "UPDATE USUARIO AS USU SET ID_TIPO_USUARIO = ? WHERE USU_RUT = ? ";

    public String CountUser(){
        
        try {
            
            ps = conn.prepareStatement(SQL_COUNT_USER_PENDIENTES);
            rs = ps.executeQuery();

            while (rs.next()) { 
                TOTAL_PENDIENTES = rs.getString("TOTAL");
            }

            ps.close();
   
        } catch (Exception e) { JOptionPane.showMessageDialog(null, "ERROR");
        }
        
        return TOTAL_PENDIENTES;
    }
    
    public String CountUserTotal(){
        
        try {
            
            ps = conn.prepareStatement(SQL_COUNT);
            rs = ps.executeQuery();

            while (rs.next()) { 
                TOTAL = rs.getString("TOTAL");
            }

            ps.close();
   
        } catch (Exception e) { JOptionPane.showMessageDialog(null, "ERROR");
        }
        
        return TOTAL;
    }
        
    public ResultSet Usuarios(){
            
        try {     
            
            ps = conn.prepareStatement(SQL_USUARIOS);
            rsTOTAL = ps.executeQuery();

        } catch (SQLException e) { JOptionPane.showMessageDialog(null, "ERROR "+e+"");
        }
        
        return rsTOTAL;
    }
        
    public  void Eliminar_Usuario(String rut){
            
        try {   
            
            ps = conn.prepareStatement(SQL_ELIMINAR_USUARIO);
            ps.setString(1, rut);
            ps.execute();
            
            JOptionPane.showMessageDialog(null, "Usuario Eliminado");
   
        } catch (SQLException e) { JOptionPane.showMessageDialog(null, "ERROR : "+e+"");
        }
       
    }
    
    public  void Modificar_Usuario(String rut , int rol){
            
        try {   
            
            ps = conn.prepareStatement(SQL_MODIFICAR_USUARIO);
            ps.setInt(1, rol);
            ps.setString(2, rut);
            ps.execute();
            JOptionPane.showMessageDialog(null, "Usuario Modificado");
   
        } catch (SQLException e) { JOptionPane.showMessageDialog(null, "ERROR : "+e+"");
        }
       
    }
    
}
