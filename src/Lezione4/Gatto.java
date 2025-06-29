package Lezione4;

public class Gatto extends Animale {

	public Gatto(String nome) {
		super(nome);	
	}

	@Override
	public void emettiVerso() {
		System.out.println("Miao! ");
	}

}