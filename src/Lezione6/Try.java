package Lezione6;

import java.util.Scanner;

public class Try {
	
    public static void main(String[] args) 
    {
        Scanner input = new Scanner(System.in);
        System.out.print("Inserisci a: ");
        int a = input.nextInt();
        System.out.print("Inserisci il b: ");
        int b = input.nextInt();
   
        try {
        		int risultato =a/b;
        		System.out.println("risultato della divisione:" +risultato); 
        	}	
        catch (Exception e){
        	System.out.println("Errore, non puoi dividere per 0!");
        }
        finally {
        	input.close();
        }
    }
}