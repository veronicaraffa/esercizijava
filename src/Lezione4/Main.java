package Lezione4;

import java.util.ArrayList;
public class Main {

	public static void main(String[] args) {
		ArrayList <Animale> RifugioAnimali= new ArrayList<>();
		Cane c= new Cane("Fido");
		Gatto g= new Gatto("Salem");
		Cane c1= new Cane("Fid");
		RifugioAnimali.add(c);
		RifugioAnimali.add(g);
		RifugioAnimali.add(c1);
		Rifugio rifugio= new Rifugio();
		rifugio.stampaVersi(RifugioAnimali);
	}

}