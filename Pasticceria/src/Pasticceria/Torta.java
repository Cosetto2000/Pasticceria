package Pasticceria;

public class Torta {
	String gusto;
	double prezzo;
	
	public Torta(String gusto, double prezzo) {
		this.gusto = gusto;
		this.prezzo = prezzo;
	}
	
	public String getGusto() {
		return gusto;
	}
	public void setGusto(String gusto) {
		this.gusto = gusto;
	}
	public double getPrezzo() {
		return prezzo;
	}
	public void setPrezzo() {
		this.prezzo = prezzo;
	}
}
