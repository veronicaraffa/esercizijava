package Lezione4_2;

import java.util.ArrayList;

public abstract class Utente {
	private String username;
	private String email;
	
	public Utente (String username, String email) {
		this.username= username;
		this.email= email;
	}
	
	public abstract ArrayList<String> getPermessi();
	
	public void stampaInfo() {
		System.out.println("Username: "+username);
		System.out.println("Email: "+email);
	}
}