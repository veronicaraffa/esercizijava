package Esame_ese3;

public class Segretario extends Utente 
{
	private String ufficio;
	public Segretario(String username, String email, String ufficio) 
	{
		super(username, email);
		this.ufficio= ufficio;
	}
	@Override
	public void presentati() 
	{
		System.out.println("Personale di segreteria "+username+ "ufficio: "+ufficio);
	}
}
