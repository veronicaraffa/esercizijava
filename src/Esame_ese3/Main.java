package Esame_ese3;

import java.util.ArrayList;
public class Main {

	public static void main(String[] args) 
	{
		ArrayList<Utente> listaUtenti = new ArrayList<>();
		 listaUtenti.add(new Studente("veronica04", "veronica.raffa@stevejobs.academy", "55513"));
	     listaUtenti.add(new Professore("Marco89", "marcooliva@email.it", "Storia"));
	     listaUtenti.add(new Segretario("chiaragazzini", "chiara.gazzini@email.it", "Ufficio 2"));

	     for (Utente u: listaUtenti) {
	     u.presentati();
	    	 
	 }
	}
}
