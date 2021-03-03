
public class Docente extends Persona{
	private String concorso;

	public Docente(String nome, String cognome, String codfiscale, String nascita, String concorso) {
		super(nome, cognome, codfiscale, nascita);
		this.concorso = concorso;
	}

	public String getConcorso() {
		return concorso;
	}

	public void setConcorso(String concorso) {
		this.concorso = concorso;
	}
	
	
}
