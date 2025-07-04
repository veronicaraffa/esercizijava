package Esame_ese2;

public class Main {

	public static void main(String[] args) 
	{
		Persona p1 = new Studente("Veronica", "Raffa", "55513");
		Persona p2 = new Professore("Andrea", "Calabretta", "Programmazione 1");
		Persona p3= new Persona ("Danilo", "Battaglia");
		
		Persona[] persone = {p1, p2, p3};
		
		for (Persona persona : persone) 
		{
			persona.presentati();
		}

	}

}
