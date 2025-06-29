package Lezione6;
import java.util.Scanner;

public class Array_tray {

	public static void main(String [] args) {
		Scanner input= new Scanner (System.in);
		String[] nomi= {"Ugo", "Eva", "Alex", "Daniele"};
		System.out.print("inserisci un numero: ");
		int indice= input.nextInt();
		System.out.println("Hai scelto: "+nomi[indice]);
		input.close();
	}
}

