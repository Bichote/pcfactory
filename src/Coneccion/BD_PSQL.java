package Coneccion;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class BD_PSQL {
    
    private String URL = "jdbc:postgresql://gogoya.tk:1351/pcf";
    private String USER = "javadesk";
    private String PASS = "pass";
    private Connection con = null;
    
 
    
   public Connection getConexion(){
       
      try { 
          con = (Connection) DriverManager.getConnection(URL,USER,PASS);
          System.out.println("Conecto");
        
        } 
        catch(SQLException e){  System.err.println(e); } 
      
        return con;

    } 

     
}
