package Esame_ese3;

public class Studente extends Utente implements Autenticabile 
{
	public String matricola;
	public Studente(String username, String email, String matricola) 
	{
		super(username, email);
		this.matricola= matricola;
	}
	@Override
	public void autentica(String password) throws AutenticazioneException
	{
		if (!password.equals("studente123"))
		{
			throw new AutenticazioneException("Password studente errata!");
		}
	}
	
	@Override
	
	public void presentati() 
	{
		System.out.println("Studente "+ username+ ", matricola: "+ matricola);
	}


	
}
