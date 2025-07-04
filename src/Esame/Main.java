package Esame;

public class Main 
{
	public static void main(String []args) 
	{
		Studente s1= new Studente("Alessio", "D'antonio", 2005);
		Studente s2= new Studente("Gabriele","Dell'Aquila", 1999);
		
		s1.stampaScheda();
		s2.stampaScheda();
	}
}
