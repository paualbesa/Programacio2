
package vista;

import model.Gimnas;


/**
 * Classe per gestionar els serveis del gimnàs Club Esportiu Medditerrani.
 * @author lauraigual
 */
public class GestorServeisGimnas {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Gimnas clubMediterrani = new Gimnas("Club Esportiu Mediterrani");
        
        omplirDadesModel(clubMediterrani);
        
        ferReserves(clubMediterrani);
        
        
        
        // Calcular el mida total de les pistes (en M^2) del Gimnàs i mostrar un missatge de la següent manera:
        // >> La mida total de les pistes del gimnàs Club Esportiu Mediterrani és de X m^2
        //--------------------------------------------------------------------------------------------------------------------
        // Per completar:
        
        
        // Mostrar el número total de serveis del Gimnàs i el número de serveis que estan operatius amb el següent missatge:
        // >> El número total de serveis del gimnàs és X dels quals X serveis estan operatius.
        //--------------------------------------------------------------------------------------------------
        // Per completar:
     
       
    }
    
    /**
     * Mètode de classe per afegir pistes de tenis, pistes de futbol, sales de fitness i socis al gimnàs.
     * @param gim L'objecte de tipus Gimnas que anem a omplir 
     */
    private static void omplirDadesModel(Gimnas gim){
        
        
        // Afegir pistes de tenis:
        //------------------------------
           
        
        boolean iluminada = true;
        String tipusTanca = "Metàl·lica";
        float mida = 195.9f; 
        
        String tipusSuperficie = "Asfalt";
        String tipusXarxa = "Fixa";
        
          
        String nom = "Tenis Nord";
        String idServei = "100P";
        
        gim.afegirPistaTenis(nom, idServei, iluminada, tipusTanca, mida, tipusSuperficie, tipusXarxa);
             
        nom = "Tenis Sud";
        idServei = "101P";
        tipusTanca = "Metàl·lica";
        tipusSuperficie = "Terra batuda";
        tipusXarxa = "Ajustable";
        
        gim.afegirPistaTenis(nom, idServei, iluminada, tipusTanca, mida, tipusSuperficie, tipusXarxa);
        
         
        nom = "Pàdel Est";
        idServei = "102P";
        
        iluminada = false;
        tipusTanca = "Vidre";
        mida = 200f;
        tipusSuperficie = "Herba artificial";
        tipusXarxa = "Sense";
        
        gim.afegirPistaTenis(nom, idServei, iluminada, tipusTanca, mida, tipusSuperficie, tipusXarxa);
        
         
                
        // Afegir pistes de futbol:
        //------------------------------
         
        String tipusPorteria = "Estandard";
        iluminada = true;
        mida = 800f;
        tipusTanca = "Sense";
        int numPorteries = 2;
        nom = "Futbol Nord";
        idServei = "200P";
        
        gim.afegirPistaFutbol(nom, idServei, iluminada, tipusTanca, mida, tipusPorteria, numPorteries);
   
        tipusPorteria = "Petita";
        numPorteries = 3;
        nom = "Futbol Sud";
        idServei = "201P";
        
        gim.afegirPistaFutbol(nom, idServei, iluminada, tipusTanca, mida, tipusPorteria, numPorteries);
   
        mida = 600f;
        iluminada = false;
        tipusTanca = "Metàlica";
        numPorteries = 0;
        nom = "Futbol Est";
        idServei = "200P";
        
        gim.afegirPistaFutbol(nom, idServei, iluminada, tipusTanca, mida, tipusPorteria, numPorteries);
   
                
        // Afegir sales de fitness:
        //------------------------------
      
        int numMaquines = 1;
        boolean monitor = false;
        nom = "Tramuntana";
        idServei = "300S";
        
        gim.afegirSalaFitness(nom, idServei, numMaquines, monitor);
               
       
        monitor = true;
        nom = "Llevant";
        idServei = "301S";
        
        gim.afegirSalaFitness(nom, idServei, numMaquines, monitor);
        
        numMaquines = 2;
        nom = "Ponent";
        idServei = "302S";
      
        gim.afegirSalaFitness(nom, idServei, numMaquines, monitor);
               
        
        // Afegir socis:
        //------------------------------
        
        String nomSoci="Patricia Fernandez";
        String dni="123456X";
        gim.afegirSoci(nomSoci, dni);
        
        nomSoci = "Lluís Plans";
        dni="789101A";
        gim.afegirSoci(nomSoci, dni);
    }
    
    /**
     * Mètode per fer reserves d'espais.
     * @param gim 
     */
    private static void ferReserves(Gimnas gim){
        
        // Per completar:
        
        // 1. Afegeix una reserva pel soci amb DNI "123456X" del servei amb identificador "100P" 
        // amb la data i hora 20 de Febrer del 2024 a 2:30 PM.
        
        // Declarar les variables de tipus String idServei i dni.
        // Assigna els valors corresponents.
       
        
        // Crear una LocalDateTime per definir la data i hora de la reserva. 
        
        // Intentar afegir la reserva amb la informació indicada i si no és possible mostrar el missatge d'error.
        
        
        // 2. Afegeix una reserva pel soci amb DNI "789101A" del servei amb identificador "100P" 
        // amb la data i hora 20 de Febrer del 2024 a 3:15 PM.
        
        // Assigna els nous valors a les variables
       
        // Intentar afegir la reserva amb la informació indicada i si no és possible mostrar el missatge d'error.
       
           
        // 3. Afegeix una reserva pel soci amb DNI "789101A" del servei amb identificador "300S" 
        // amb la data i hora 25 de Febrer del 2024 a 10:00 AM.
        
        // Assigna els nous valors a les variables.    
      
        // Intentar afegir la reserva amb la informació indicada i si no és possible mostrar el missatge d'error.
        
        
    }
    
}
