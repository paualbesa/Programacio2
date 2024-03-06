package model;

public class SalaFitness extends Servei {
    private int numMaquines;
    private boolean monitorDisponible;

    public int getNumMaquines() {
        return numMaquines;
    }

    public void setNumMaquines(int numMaquines) {
        this.numMaquines = numMaquines;
    }

    public boolean isMonitorDisponible() {
        return monitorDisponible;
    }

    public void setMonitorDisponible(boolean monitorDisponible) {
        this.monitorDisponible = monitorDisponible;
    }
    
    public SalaFitness(String nom, String idServei, int numMaquines, boolean monitorDisponible) {
        super(nom, idServei);
        this.numMaquines = numMaquines;
        this.monitorDisponible = monitorDisponible;
    }
}
