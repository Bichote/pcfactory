
package Controlador;

import Coneccion.BD_PSQL;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import javax.swing.JOptionPane;

public class C_DISENIO_COLOR {
    
    private BD_PSQL ObjConn = new BD_PSQL();
    private Connection conn = ObjConn.getConexion(); // llamar la conexion 
    private PreparedStatement ps = null; // preparar la query
    private ResultSet rs = null; // Se va a guardar el resultado de la query
    
    private String SQL = "select DIS_COLOR from DISENIO_COLOR ";    
    private String SQL_INSERT = "UPDATE DISENIO_COLOR  SET DIS_COLOR = ? WHERE id_disenio_color = 1";   
    
    String Rcolor = "";

    
    public String Color(){
        
        try {
    
            ps = conn.prepareStatement(SQL);
            rs = ps.executeQuery();
            
            while (rs.next()) {
              
                Rcolor = rs.getString("DIS_COLOR");
                
            }
            
            ps.close();
            
            return Rcolor ;
            
        } catch (Exception e) { }
        
        return Rcolor;
    
    }
    
    public void  InsertColor(String estado){
        
        try {
            
            ps = conn.prepareStatement(SQL_INSERT);
            ps.setString(1, estado);
            ps.execute();

            JOptionPane.showMessageDialog(null,"Color "+estado+" Actualizado para todos");
            
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null,"ERROR : "+e+"");
        }
        

    }
    
}
