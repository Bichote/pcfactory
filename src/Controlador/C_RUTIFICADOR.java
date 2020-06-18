package Controlador;

public class C_RUTIFICADOR {
    
    private boolean RS_RUTIFICADOR = false;

    public boolean rutificador(String rut){
        
        rut = rut.toUpperCase();
        rut = rut.replace(".", "");
        rut = rut.replace("-", "");

        int rutAux = Integer.parseInt(rut.substring(0, rut.length() - 1));
        char dv = rut.charAt(rut.length() - 1);
        int m = 0, s = 1;
            
        for (; rutAux != 0; rutAux /= 10) { s = (s + rutAux % 10 * (9 - m++ % 6)) % 11;}
        
        if (dv == (char) (s != 0 ? s + 47 : 75))  { 
            RS_RUTIFICADOR = true;
        }else{
            RS_RUTIFICADOR = false;
        }
      
        return RS_RUTIFICADOR;

    }
    
}
