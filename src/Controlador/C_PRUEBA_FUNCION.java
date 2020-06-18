
package Controlador;
    
import Coneccion.BD_PSQL;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

// CREAR FUNCION SELECT 
//CREATE OR REPLACE FUNCTION FX1(_parameter varchar)
//RETURNS SETOF USUARIO AS $$
//BEGIN
//  RETURN QUERY SELECT * FROM USUARIO WHERE USU_RUT = _parameter ;
//END
//$$ LANGUAGE plpgsql;

public class C_PRUEBA_FUNCION {
    
    private BD_PSQL ObjConn = new BD_PSQL();
    private Connection conn = ObjConn.getConexion(); // llamar la conexion 
    private PreparedStatement ps = null; // preparar la query
    private ResultSet rs = null; // Se va a guardar el resultado de la query
    private String rut = "201209021";
    private String sql = "SELECT * FROM FX1(?)";
    
    public  C_PRUEBA_FUNCION(){
        prueba();
    }

    public void prueba(){
        try {
            ps = conn.prepareStatement(sql);
            ps.setString(1, rut);
            rs = ps.executeQuery();
            while (rs.next()) {            
                System.out.println(rs.getString("USU_RUT"));
            }
        } catch (Exception e) {
        }
    }
    
     public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new C_PRUEBA_FUNCION();
            }
        });
    }
    
}



