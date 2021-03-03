
public class Persona {
	private String nome;
	private String cognome;
	private String codfiscale;
	private String nascita;
	
	public Persona(String nome, String cognome, String codfiscale, String nascita) {
		this.nome = nome;
		this.cognome = cognome;
		this.codfiscale = codfiscale;
		this.nascita = nascita;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getCognome() {
		return cognome;
	}

	public void setCognome(String cognome) {
		this.cognome = cognome;
	}

	public String getCodfiscale() {
		return codfiscale;
	}

	public void setCodfiscale(String codfiscale) {
		this.codfiscale = codfiscale;
	}

	public String getNascita() {
		return nascita;
	}

	public void setNascita(String nascita) {
		this.nascita = nascita;
	}
}
