
package fechaHora;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class FechaHora {
    
    public String Fecha(){
        
        Date sistFecha=new Date();
        SimpleDateFormat formato=new SimpleDateFormat("dd/MM/YYYY");
        
//        System.out.println("La fecha del sistema es:");
//        System.out.println(formato.format(sistFecha));
        
        return formato.format(sistFecha);
        
    }
    
    public String Hora(){
        
        Date sistHora=new Date();
        String pmAm="hh:mm:ss a";
        SimpleDateFormat format=new SimpleDateFormat(pmAm);
        Calendar hoy=Calendar.getInstance();
        
//        System.out.println("La hora del sistema es:");
//        System.out.println(String.format(format.format(sistHora),hoy));
        
        return String.format(format.format(sistHora),hoy);
        
    }
    
}
