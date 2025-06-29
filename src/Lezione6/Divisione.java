package Lezione6;

import java.util.Scanner;
public class Divisione {
	
	    public static void main(String[] args) 
	    {
	        Scanner scanner = new Scanner(System.in);
	        System.out.print("Inserisci a: ");
	        int a = scanner.nextInt();
	        System.out.print("Inserisci il b: ");
	        int b = scanner.nextInt();
	        int risultato = a / b;
	        System.out.println("Risultato divisione: " + risultato);
	        scanner.close();
	    }
	
}