package Lezione6_2;

public abstract class Veicolo {
    protected int batteria;
    protected final int BATTERIA_MAX = 100;

    public Veicolo() {
        this.batteria = 70; 
    }

    public int getBatteria() 
    {
        return batteria;
    }
}

