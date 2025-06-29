package Lezione4;

import java.util.ArrayList;

public class Rifugio {
	ArrayList<Animale> nome = new ArrayList<>();
	
	public void aggiungiAnimale(Animale a) {
		 nome.add(a);
	}
	public void stampaVersi(ArrayList<Animale> animali) 
	{
        for (Animale a : animali) 
        {
        	a.descrizione();
            a.emettiVerso();
        }
    }
}