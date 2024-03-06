
package model;
import java.time.LocalDateTime;
import java.util.ArrayList;
import vista.ExcepcioReserva;


public class LlistaReserves implements InLlistaReserves{
    public ArrayList<Soci> LlistaReserves = new ArrayList();

    @Override
    public void afegirReserva(Servei servei, Soci soci, LocalDateTime data) throws ExcepcioReserva {
        
    }
}