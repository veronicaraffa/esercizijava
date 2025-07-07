package lezione8;
import javax.swing.*;
public class Frame {
	public static void main (String[]args) 
	{
	
		JFrame finestra = new JFrame ("Dati utente");
		finestra.setSize(300, 200);
		finestra.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		finestra.setLayout(null);
		
		    JLabel nome1 = new JLabel("Nome:");
	        JLabel cognome1 = new JLabel("Cognome:");
	        JLabel email1 = new JLabel("Email:");
		
			JTextField nome= new JTextField();
			JTextField cognome= new JTextField();
			JTextField email= new JTextField();
			JButton invia = new JButton("Invia");
			
			nome1.setBounds(20, 10, 80, 20);
			nome.setBounds(100, 10, 150, 20);
			
			cognome1.setBounds(20, 40, 80, 20);
			cognome.setBounds(100, 40, 150, 20);
			
			email1.setBounds(20, 70, 80, 20);
			email.setBounds(100, 70, 80, 25);
			
	        invia.setBounds(100, 110, 80, 25);

			
			finestra.add(nome1);
	        finestra.add(nome);
	        
	        finestra.add(cognome1);
	        finestra.add(cognome);
	        
	        finestra.add(email1);
	        finestra.add(email);
	        
	        finestra.add(invia);
	        
	        invia.addActionListener(e -> {
	            String messaggio = "Nome: " + nome.getText() +
	                               "\nCognome: " + cognome.getText() +
	                               "\nEmail: " + email.getText();
	            JOptionPane.showMessageDialog(finestra, messaggio);
	        });
	        finestra.setVisible(true);
	        
	}	
}