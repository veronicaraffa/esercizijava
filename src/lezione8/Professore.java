package lezione8;

public class Professore extends Persona {
    private String stipendio;

    public Professore(String nome, String cognome, String stipendio) {
        super(nome, cognome);
        this.stipendio = stipendio;
    }

    @Override
    public String getInfo() {
        return "Professore: " + super.getInfo() + " - Stipendio: " + stipendio + "€";
    }
}
