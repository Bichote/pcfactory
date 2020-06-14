
package Coneccion;

import java.awt.Color;
import java.awt.Frame;
import javax.swing.JFrame;
import javax.swing.JPanel;



public class x {
    

    public x(){
        
        hilo();
         
    }
    
    public void hilo(){
        
        while(true){
            System.err.println("------");
        }
        
    }
    
    public static void main (String [ ] args) {
 
       java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
              new x();
            }
        });
       
 }
}
