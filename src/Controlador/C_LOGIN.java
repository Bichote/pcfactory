
package Controlador;
import java.sql.Connection;
import java.sql.PreparedStatement;
import Coneccion.BD_PSQL;
import java.sql.ResultSet;
import javax.swing.JOptionPane;


public class C_LOGIN {
    
   
    private BD_PSQL ObjConn = new BD_PSQL();
    private Connection conn = ObjConn.getConexion(); // llamar la conexion 
    private PreparedStatement ps = null; // preparar la query
    private ResultSet rs = null; // Se va a guardar el resultado de la query
    private int Rquery = 0;
    
    private String SQL = "SELECT COUNT(ID_USUARIO) as \"ID\" , ID_TIPO_USUARIO as \"TIPO\" FROM USUARIO WHERE USU_RUT = ?  AND USU_CONTRASENIA = ? group by id_tipo_usuario";
   
    
    public int login(String rut , String pass ){
        
        try {
            
            ps = conn.prepareStatement(SQL);
            ps.setString(1, rut);
            ps.setString(2, pass);
            rs = ps.executeQuery();
            
            while (rs.next()) {
                
                String tipo = rs.getString("TIPO");
                System.err.println(tipo);
              
                
                if (rs.getString("ID").equals("1")) {

                    if (tipo.equals("3")) {
                       
                        Rquery = 3 ;
                          
                    } else {
                        
                        Rquery = 1 ; 
                    }
 
                return Rquery;
                     
                } else{
                    
                    Rquery = 0 ;
                  
                }
            }
            
            ps.close();
            
        } catch (Exception e) { System.err.println(e); }

        return  Rquery ;
    }
    
    
    
}
