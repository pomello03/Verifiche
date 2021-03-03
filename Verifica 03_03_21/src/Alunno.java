
public class Alunno extends Persona{
	private int classe;
	private String sezione;
	
	public Alunno(String nome, String cognome, String codfiscale, String nascita, int classe, String sezione) {
		super(nome, cognome, codfiscale, nascita);
		this.classe = classe;
		this.sezione = sezione;
	}

	public int getClasse() {
		return classe;
	}

	public void setClasse(int classe) {
		this.classe = classe;
	}

	public String getSezione() {
		return sezione;
	}

	public void setSezione(String sezione) {
		this.sezione = sezione;
	}

}
