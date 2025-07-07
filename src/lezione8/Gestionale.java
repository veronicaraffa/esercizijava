package lezione8;

import javax.swing.*;
import java.awt.*;
import java.util.ArrayList;
public class Gestionale {
    private JFrame frame;
    private CardLayout cardLayout;
    private JPanel pannelloCentrale;
    ArrayList<Persona> archivio = new ArrayList<>();

    public Gestionale() {
        frame = new JFrame("Gestionale");
        frame.setSize(400, 250);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLayout(new BorderLayout());

       
        JPanel barraSuperiore = new JPanel(new FlowLayout());
        JButton btnStudente = new JButton("Studente");
        JButton btnProfessore = new JButton("Professore");
        barraSuperiore.add(btnStudente);
        barraSuperiore.add(btnProfessore);

        cardLayout = new CardLayout();
        pannelloCentrale = new JPanel(cardLayout);
        pannelloCentrale.add(creaFormStudente(), "studente");
        pannelloCentrale.add(creaFormProfessore(), "professore");

        btnStudente.addActionListener(e -> cardLayout.show(pannelloCentrale, "studente"));
        btnProfessore.addActionListener(e -> cardLayout.show(pannelloCentrale, "professore"));

        frame.add(barraSuperiore, BorderLayout.NORTH);
        frame.add(pannelloCentrale, BorderLayout.CENTER);
        frame.setVisible(true);
    }

    private JPanel creaFormStudente() {
        JPanel panel = new JPanel(null);
        JLabel lblNome = new JLabel("Nome:");
        JTextField txtNome = new JTextField();
        JLabel lblCognome = new JLabel("Cognome:");
        JTextField txtCognome = new JTextField();
        JLabel lblMatricola = new JLabel("Matricola:");
        JTextField txtMatricola = new JTextField();
        JButton btnInvia = new JButton("Invia");

        lblNome.setBounds(30, 10, 80, 20);
        txtNome.setBounds(120, 10, 200, 20);
        lblCognome.setBounds(30, 40, 80, 20);
        txtCognome.setBounds(120, 40, 200, 20);
        lblMatricola.setBounds(30, 70, 80, 20);
        txtMatricola.setBounds(120, 70, 200, 20);
        btnInvia.setBounds(140, 110, 100, 25);

        btnInvia.addActionListener(e -> {
            Studente s = new Studente(txtNome.getText(), txtCognome.getText(), txtMatricola.getText());
            archivio.add(s);

        
            System.out.println("Nuovo studente inserito: " + s.getInfo());

            txtNome.setText("");
            txtCognome.setText("");
            txtMatricola.setText("");
            JOptionPane.showMessageDialog(frame, "Studente salvato.");
        });

        panel.add(lblNome); panel.add(txtNome);
        panel.add(lblCognome); panel.add(txtCognome);
        panel.add(lblMatricola); panel.add(txtMatricola);
        panel.add(btnInvia);

        return panel;
    }

    private JPanel creaFormProfessore() {
        JPanel panel = new JPanel(null);
        JLabel lblNome = new JLabel("Nome:");
        JTextField txtNome = new JTextField();
        JLabel lblCognome = new JLabel("Cognome:");
        JTextField txtCognome = new JTextField();
        JLabel lblStipendio = new JLabel("Stipendio:");
        JTextField txtStipendio = new JTextField();
        JButton btnInvia = new JButton("Invia");

        lblNome.setBounds(30, 10, 80, 20);
        txtNome.setBounds(120, 10, 200, 20);
        lblCognome.setBounds(30, 40, 80, 20);
        txtCognome.setBounds(120, 40, 200, 20);
        lblStipendio.setBounds(30, 70, 80, 20);
        txtStipendio.setBounds(120, 70, 200, 20);
        btnInvia.setBounds(140, 110, 100, 25);

        btnInvia.addActionListener(e -> {
            Professore p = new Professore(txtNome.getText(), txtCognome.getText(), txtStipendio.getText());
            archivio.add(p);

            System.out.println("Nuovo professore inserito: " + p.getInfo());

            txtNome.setText("");
            txtCognome.setText("");
            txtStipendio.setText("");
            JOptionPane.showMessageDialog(frame, "Professore salvato.");
        });

        panel.add(lblNome); panel.add(txtNome);
        panel.add(lblCognome); panel.add(txtCognome);
        panel.add(lblStipendio); panel.add(txtStipendio);
        panel.add(btnInvia);

        return panel;
    }
}
