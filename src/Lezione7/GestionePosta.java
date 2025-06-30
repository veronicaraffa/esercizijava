package Lezione7;

public class GestionePosta 
{
	public static void main(String [] args) 
	{
		Posta ufficio =new Posta();
		Persona p1= new Persona ("Matteo");
	    Persona p2= new Persona ("Alessia");
	    Persona p3= new Persona ("Mirko");
	    
	    ufficio.entraInCoda(p1);
	    ufficio.entraInCoda(p2);
	    ufficio.entraInCoda(p3);
	    
	    System.out.println();
	    ufficio.mostraCoda();
	    
	    System.out.println("\nil prossimo da servire è: " +ufficio.chiEIlProssimo());
	    
	    System.out.println("\n" +ufficio.ServireProssimo());
	    System.out.println(ufficio.ServireProssimo());
	    
	    System.out.println();
	    ufficio.mostraCoda();
	}
}
