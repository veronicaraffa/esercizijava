package Lezione9;

import javax.swing.*;
import java.awt.*;
import java.util.ArrayList;

public class PrenotazioneAutobus 
{
	private JFrame frame;
	private JLabel lblPasseggeri, lblAutisti; 
	private int maxPasseggeri = 20;
	private int maxAutisti= 2;
	
	private ArrayList<UtenteAutobus> listaUtenti = new ArrayList<>();
	
	public PrenotazioneAutobus() 
	{
		frame= new JFrame ("Prenotazione Autobus");
		frame.setSize(400, 200);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setLayout(new FlowLayout());
		
		JButton btnPasseggero = new JButton("Aggiungi passeggero");
		JButton btnAutista = new JButton ("Aggiungi autista");
		
		lblPasseggeri = new JLabel ("Posti passeggeri rimanenti: "+ maxPasseggeri);
		lblAutisti = new JLabel ("Posti autisti rimanenti: "+ maxAutisti);
		
		btnPasseggero.addActionListener(e ->{
			try {
				  if(contaPasseggeri() >=20) throw new postiEsauritiPasseggeroException("Posti passeggeri esauriti!");
				  
				  Passeggero p= new Passeggero("Veronica", "Raffa", "RFFVNC04A0158X", "Messina", true);
				  listaUtenti.add(p);
				  aggiornaEtichette();
			}
			catch(postiEsauritiPasseggeroException ex) 
			{
				JOptionPane.showMessageDialog(frame, ex.getMessage(), "Errore", JOptionPane.ERROR_MESSAGE);
			}	
		});
		btnAutista.addActionListener(e ->
		{
			try {
				    if (contaAutisti() >= 2) throw new postiEsauritiAutistaException("Posti autisti esauriti!");
				    
				    Autista a = new Autista("Luca", "Bianchi", "BCHLCU70A0DRF5K", "D", 10);
				    listaUtenti.add(a);
	                aggiornaEtichette();
			}
			catch(postiEsauritiAutistaException ex) 
			{
				 JOptionPane.showMessageDialog(frame, ex.getMessage(), "Errore", JOptionPane.ERROR_MESSAGE);
			}
		});
		
		frame.add(btnPasseggero);
		frame.add(btnAutista);
		frame.add(lblPasseggeri);
		frame.add(lblAutisti);
		
		frame.setVisible(true);
	}
	
	private int contaPasseggeri() 
	{
		return (int)listaUtenti.stream().filter(u -> u.getTipo().equals("Passeggero")).count();
	}
	private int contaAutisti() 
	{
		return (int)listaUtenti.stream().filter(u -> u.getTipo().equals("Autista")).count();
	}
	
	 private void aggiornaEtichette() 
	 {
	     lblPasseggeri.setText("Posti passeggeri rimanenti: " + (20 - contaPasseggeri()));
	     lblAutisti.setText("Posti autisti rimanenti: " + (2 - contaAutisti()));
	 }
}
