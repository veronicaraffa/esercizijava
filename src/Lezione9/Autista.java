package Lezione9;

public class Autista implements UtenteAutobus
{
	private String nome, cognome, codiceFiscale, patente;
	private int anniEsperienza;
	
	public Autista (String nome, String cognome, String codiceFiscale, String patente, int anniEsperienza)
	{
		this.nome= nome;
		this.cognome= cognome;
		this.codiceFiscale= codiceFiscale;
		this.patente= patente;
		this.anniEsperienza= anniEsperienza;
	}
	
	public String getTipo()
	{
		return "Autista";
	}
}
