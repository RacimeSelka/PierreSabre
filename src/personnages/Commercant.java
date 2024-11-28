package personnages;

public class Commercant extends Humain {

	public Commercant(String nom, int argent) {
		super(nom,"thé", argent);
		
	}
	public void seFaireExtorquer() {
		this.perdreArgent(argent);
		parler("j'ai tout perdu !le monde est top injuste");
	}
	public void recevoirArgent(int recu) {
		this.gagnerArgent(recu);
		parler(recu+" sous!merci genereux donateur");
	}
	
}
