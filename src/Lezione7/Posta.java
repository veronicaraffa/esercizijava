package Lezione7;
import java.util.LinkedList;
import java.util.Queue;
public class Posta 
{
	private Queue<Persona> coda;
	
	public Posta() 
	{
		coda = new LinkedList<>();
	}
	
	public void entraInCoda(Persona p) 
	{
		coda.add(p);
		System.out.println(p.getNome()+ " è entrato/a in coda");
	}
	
	public String chiEIlProssimo()
	{
		if (!coda.isEmpty()) 
		{
			return coda.peek().getNome();
		}
		else 
		{
			return "Nessuno in coda";
		}
	}
	
	public String ServireProssimo()
	{
	    if (!coda.isEmpty())
	    {
	        Persona p1 = coda.poll();
	        return p1.getNome() + " è stato servito/a";
	    }
	    else
	    {
	        return "Nessuno da servire";
	    }
	}
	public void mostraCoda() 
	{
		if (coda.isEmpty()) 
		{
		    System.out.println("La coda è vuota");
		}
		else
		{
		    System.out.println("Persone attualmente in coda:");
		    for (Persona p : coda) 
		    {
		        System.out.println("- " + p.getNome());
		    }
		}

	}
}
