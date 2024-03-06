
package model;

public class Pista extends Servei {
    protected float mida;
    protected String tipusTanca;
    protected boolean iluminada;

    public float getMida() {
        return mida;
    }

    public void setMida(float mida) {
        this.mida = mida;
    }

    public String getTipusTanca() {
        return tipusTanca;
    }

    public void setTipusTanca(String tipusTanca) {
        this.tipusTanca = tipusTanca;
    }

    public boolean isIluminada() {
        return iluminada;
    }

    public void setIluminacio(boolean iluminada) {
        this.iluminada = iluminada;
    }

    public Pista(String nom, String id, float mida, String tipusTanca, boolean iluminada) {
        super(nom, id);
        this.mida = mida;
        this.tipusTanca = tipusTanca;
        this.iluminada = iluminada;
    }
    
    
}
