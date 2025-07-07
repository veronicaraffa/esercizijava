package lezione8;

public class Studente extends Persona {
    private String matricola;

    public Studente(String nome, String cognome, String matricola) {
        super(nome, cognome);
        this.matricola = matricola;
    }

    @Override
    public String getInfo() {
        return "Studente: " + super.getInfo() + " - Matricola: " + matricola;
    }
}
