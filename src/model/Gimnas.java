package model;

import java.time.LocalDateTime;
import java.util.ArrayList;
import vista.ExcepcioReserva;


public class Gimnas implements InGimnas{
    private String nom;
    private int numServeis;
    private ArrayList<Servei> llistaServeis;
    private ArrayList<Soci> llistaSocis;
    
    public Gimnas(String nom) {
        this.nom = nom;
    }
    
    @Override
    public String getNom() {
        return nom;
    }

    @Override
    public int getNumServeis() {
        return numServeis;
    }

    @Override
    public void afegirSoci(String nom_, String dni_) {
        Soci s = new Soci(nom_, dni_);
        
    }

    @Override
    public void afegirPistaTenis(String nom_, String idServei_, boolean iluminada_, String tipusTanca_, float mida_, String tipusSuperficie_, String tipusXarxa_) {
        PistaTenis pt = new PistaTenis(nom_, idServei_, iluminada_, tipusTanca_, mida_, tipusSuperficie_, tipusXarxa_);
        llistaServeis.add(pt);
    }

    @Override
    public void afegirPistaFutbol(String nom_, String idServei_, boolean iluminada_, String tipusTanca_, float mida_, String tipusPorteries_, int numPorteries_) {
        PistaFutbol pf = new PistaFutbol(nom_, idServei_, iluminada_, tipusTanca_, mida_, tipusPorteries_, numPorteries_);
        llistaServeis.add(pf);
    }

    @Override
    public void afegirSalaFitness(String nom_, String idServei_, int numMaquines_, boolean monitor_) {
        SalaFitness sf = new SalaFitness(nom_, idServei_, numMaquines_, monitor_);
        llistaServeis.add(sf);
    }

    @Override
    public void afegirReserva(String idServei_, String dni_, LocalDateTime data_) throws ExcepcioReserva {
        
    }

    @Override
    public float calculMidaTotalPistes() {
        throw new UnsupportedOperationException("Not supported yet."); 
    }

    @Override
    public int calculServeisOperatius() {
        throw new UnsupportedOperationException("Not supported yet."); 
    }
    
}
