package Lezione5;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Calcolatrice c = new Calcolatrice();
        Scanner scanner = new Scanner(System.in);

       
        System.out.println("Somma di due interi:");
        System.out.print("Inserisci il primo intero: ");
        int n1 = scanner.nextInt();
        System.out.print("Inserisci il secondo intero: ");
        int n2 = scanner.nextInt();
        System.out.println("Risultato: " + c.somma(n1, n2));

        
        System.out.println("\nSomma di tre2 interi:");
        System.out.print("Inserisci il primo intero: ");
        int n3 = scanner.nextInt();
        System.out.print("Inserisci il secondo intero: ");
        int n4 = scanner.nextInt();
        System.out.print("Inserisci il terzo intero: ");
        int n5 = scanner.nextInt();
        System.out.println("Risultato: " + c.somma(n3, n4, n5));

        
        System.out.println("\nSomma di due double:");
        System.out.print("Inserisci il primo double: ");
        double d1 = scanner.nextDouble();
        System.out.print("Inserisci il secondo double: ");
        double d2 = scanner.nextDouble();
        System.out.println("Risultato: " + c.somma(d1, d2));

        scanner.nextLine(); 
        
        System.out.println("\nConcatenazione due stringhe:");
        System.out.print("Inserisci la prima stringa: ");
        String s1 = scanner.nextLine();
        System.out.print("Inserisci la seconda stringa: ");
        String s2 = scanner.nextLine();
        System.out.println("Risultato: " + c.somma(s1, s2));

        scanner.close();
    }
}