
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
    private int Fquerty = 0;
    
    private String SQL = "SELECT COUNT(ID_USUARIO) as \"ID\" , ID_TIPO_USUARIO as \"TIPO\" FROM USUARIO WHERE USU_RUT = ?  AND USU_CONTRASENIA = ? group by id_tipo_usuario";
    private String SQL_FILTRO_ROL = "select id_tipo_usuario as \"ID\" from usuario where usu_rut = ? ";
    
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
    
    public int Filtro_Rol(String rut){
        
        try {
            ps = conn.prepareStatement(SQL_FILTRO_ROL);
            ps.setString(1, rut);
            rs = ps.executeQuery();
            while (rs.next()) {
                
                if (rs.getString("ID").equals("1")) {
                    Fquerty = 1 ;
                }
                if (rs.getString("ID").equals("2")) {
                    Fquerty = 2 ;
                }
                if (rs.getString("ID").equals("3")) {
                    Fquerty = 3 ;
                }
                if (rs.getString("ID").equals("4")) {
                    Fquerty = 4 ;
                }
            }
        } catch (Exception e) { }
        
       return Fquerty;
    }
    
    
    
}
