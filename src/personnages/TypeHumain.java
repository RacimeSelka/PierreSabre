package personnages;

public enum TypeHumain {
	YAKUZA("yakuza"),COMMERCANT("commercant"),TRAITRE("traitre"),RONIN("ronin"),GRANDMERE("grand-mere"),SAMURAI("samurai"),HABITANT("habitant");
	
	

	private String nom;

	TypeHumain(String nom) { 
		this.nom=nom;
	}

	public String getNom() {
		return nom;
	}
	

	
	
	
}
