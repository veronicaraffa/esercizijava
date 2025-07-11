package Lezione9;

public class Passeggero implements UtenteAutobus 
{
	private String nome, cognome, codiceFiscale, destinazione;
	private boolean haBagaglio;
	
	public Passeggero (String nome, String cognome, String codiceFiscale, String destinazione, boolean haBagaglio)
	{
		this.nome= nome;
		this.cognome= cognome;
		this.codiceFiscale= codiceFiscale;
		this.destinazione= destinazione;
		this.haBagaglio= haBagaglio;
	}
	public String getTipo()
	{
		return "Passeggero";
	}
}
