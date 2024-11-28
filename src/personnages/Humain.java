package personnages;

public class Humain {
	private String nom;
	private String boissonFav;
	protected int argent;
	
	public Humain(String nom, String boissonFav, int argent) {
		this.nom = nom;
		this.boissonFav = boissonFav;
		this.argent = argent;
	}

	public String getNom() {
		return nom;
	}

	public int getArgent() {
		return argent;
	}
	
	public void parler(String texte) {
		System.out.println("["+nom+"]"+"<<"+texte+">>");
	}
	public void direBonjour() {
		parler("bonjour!je m'appelle "+nom+" et j'aime boire du "+boissonFav);
	}
	public void boire() {
		parler("Mmmmm,un bon verre de "+boissonFav+"!GLOUPS!");
	}
	public void acheter(String bien,int prix) {
		if (prix<=argent) {
			parler("j'ai "+argent+" sous en poche.Je vais pouvoir m'offrir "+bien+" a "+prix+" sous.");
			argent-=prix;
		} else {
			parler("je n'ai plus que "+argent+" sous en poche.Je ne peux meme pas m'offrir "+bien+" a "+prix+" sous.");
		}
		
	}
	protected void gagnerArgent(int gain) {
		argent+=gain;
	}
	protected void perdreArgent(int perte) {
		argent-=perte;
	}
	
	
	
}
