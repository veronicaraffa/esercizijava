package Lezione6_2;

public class Auto_Ibrida extends Veicolo implements Connettivita, Ricaricabile {

    private boolean connesso;

    public Auto_Ibrida() {
        super(); 
        this.connesso = false;
    }

    
    @Override
    public void connetti() 
    {
        connesso = true;
        System.out.println("Dispositivo connesso via Bluetooth.");
    }

    @Override
    public void disconnetti() 
    {
        connesso = false;
        System.out.println("Dispositivo disconnesso.");
    }

    @Override
    public boolean isConnesso() 
    {
        return connesso;
    }

   
    @Override
    public void ricarica() 
    {
        batteria = BATTERIA_MAX;
        System.out.println("Auto ricaricata al massimo. Batteria: " + batteria + "%");
    }
}
