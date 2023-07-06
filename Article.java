package toto;

public class Article {
	private String libelle;
	private int qtity;
	private double price;

	public Article(String pLibelle, int pQtity, double pPrice) {
		libelle = pLibelle;
		qtity = pQtity;
		this.price = pPrice;
	}

	public void setLibelle(String libelle) {
		this.libelle = libelle;
	}

	public void setQtity(int qtity) {
		this.qtity = qtity;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public String getLibelle() {
		return libelle;
	}

	public int getQtity() {
		return qtity;
	}

	public double getPrice() {
		return price;
	}

	
	
	
}
