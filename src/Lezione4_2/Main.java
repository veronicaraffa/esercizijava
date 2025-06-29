package Lezione4_2;

public class Main {

	public static void main(String[] args) {
		Admin a= new Admin("veronica04", "veronica.raffa@stevejobs.academy");
		Admin a1= new Admin("raffa04", "veronicaraffa04@stevejobs.academy");
		
		Cliente c = new Cliente("veronicaraffa", "veronica.raffa04@stevejobs.academy");
		Cliente c1 = new Cliente("veronica", "veronicaraffa04@gmail.com");
		
		GestioneUtenti g= new GestioneUtenti();
		g.aggiungiUtente(a);
		g.aggiungiUtente(a1);
		g.aggiungiUtente(c);
		g.aggiungiUtente(c1);
	    g.stampaPermessi();

	}

}