package model;

public class Servei implements InServeiReservable{
    protected String nom;
    protected String id;
    protected long tempsSlotReserva;

    public Servei(String nom, String id) {
        this.nom = nom;
        this.id = id;
    }

    @Override
    public String getNom() {
        return this.nom;
    }

    @Override
    public void setNom(String nom) {
        this.nom = nom;
    }

    @Override
    public String getIdServei() {
        return id;
    }

    @Override
    public void setIdServei(String id) {
        this.id = id;
    }

    @Override
    public long getTempsSlotReserva() {
        return tempsSlotReserva;
    }

    @Override
    public void setTempsSlotReserva(long tempsSlotReserva) {
        this.tempsSlotReserva = tempsSlotReserva;
    }

    @Override
    public boolean correcteFuncionament() {
        return true;  // ARREGLAR !!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!
    }
    
}
