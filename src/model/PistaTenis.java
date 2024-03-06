package model;

public class PistaTenis extends Pista {
    private String tipusSuperficie;
    private String tipusXarxa;

    //getter i setter de tipusSuperficie
    public String getTipusSuperficie() {
        return tipusSuperficie;
    }

    public void setTipusSuperficie(String tipusSuperficie) {
        this.tipusSuperficie = tipusSuperficie;
    }
    
    
    //getter i setter de tipusXarxa
    public String getTipusXarxa() {
        return tipusXarxa;
    }

    public void setTipusXarxa(String tipusXarxa) {
        this.tipusXarxa = tipusXarxa;
    }
    
    PistaTenis(String nom, String idServei, boolean iluminada, String tipusTanca, float mida, String tipusSuperficie, String tipusXarxa){
        super(nom, idServei, mida, tipusTanca, iluminada);
        this.tipusSuperficie = tipusSuperficie;
        this.tipusXarxa = tipusXarxa;
    }
}
