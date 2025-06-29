package Lezione6;
import java.util.Scanner;
public class ArrayTray {
	public static void main(String [] args) {
		Scanner input= new Scanner (System.in);
		String[] nomi= {"Ugo", "Eva", "Alex", "Daniele"};
		System.out.print("inserisci un numero: ");
		int indice= input.nextInt();
		try 
		{
		    System.out.println("Hai scelto: "+nomi[indice]);
		}
		catch(Exception e) 
		{
			System.out.println("Errore, devi scegliere un numero da 0 a 3!");
		}
		finally 
		{
			input.close();
		}
	}
}