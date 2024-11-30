package personnages;

public class Humain {
	private String nom;
	public String getBoissonFav() {
		return boissonFav;
	}

	private String boissonFav;
	protected int argent;
	private Humain[] Connaissance = new Humain[3];
	private int nbConnaissance;

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
		System.out.println("(" + nom + ")" + "-" + texte);
	}

	public void direBonjour() {
		parler("bonjour!je m'appelle " + nom + " et j'aime boire du " + boissonFav);
	}

	public void boire() {
		parler("Mmmmm,un bon verre de " + boissonFav + "!GLOUPS!");
	}

	public void acheter(String bien, int prix) {
		if (prix <= argent) {
			parler("j'ai " + argent + " sous en poche.Je vais pouvoir m'offrir " + bien + " a " + prix + " sous.");
			argent -= prix;
		} else {
			parler("je n'ai plus que " + argent + " sous en poche.Je ne peux meme pas m'offrir " + bien + " a " + prix
					+ " sous.");
		}

	}

	protected void gagnerArgent(int gain) {
		argent += gain;
	}

	protected void perdreArgent(int perte) {
		argent -= perte;
	}

	public void repondre(Humain humain) {
		humain.direBonjour();
	}

	public void memoriser(Humain humain) {
		if (humain.nbConnaissance < Connaissance.length && nbConnaissance < Connaissance.length) {
			humain.Connaissance[humain.nbConnaissance] = this;
			humain.nbConnaissance += 1;
			Connaissance[nbConnaissance] = humain;
			nbConnaissance += 1;
		}

		else if (nbConnaissance < Connaissance.length && humain.nbConnaissance == Connaissance.length) {
			Connaissance[nbConnaissance] = humain;
			nbConnaissance += 1;
			for (int i = 0; i < Connaissance.length - 1; i++) {
				humain.Connaissance[i] = humain.Connaissance[i + 1];
			}
			humain.Connaissance[Connaissance.length - 1] = this;
		}

		else if (nbConnaissance == Connaissance.length && humain.nbConnaissance == Connaissance.length) {
			for (int i = 0; i < Connaissance.length - 1; i++) {
				Connaissance[i] = Connaissance[i + 1];
				humain.Connaissance[i] = humain.Connaissance[i + 1];
			}
			Connaissance[Connaissance.length - 1] = humain;
			humain.Connaissance[Connaissance.length - 1] = this;

		} else if (humain.nbConnaissance < Connaissance.length && nbConnaissance == Connaissance.length) {
			for (int i = 0; i < Connaissance.length - 1; i++) {
				Connaissance[i] = Connaissance[i + 1];
			}
			Connaissance[Connaissance.length - 1] = humain;
			humain.Connaissance[humain.nbConnaissance] = this;
			humain.nbConnaissance += 1;
		}

	}

	public void faireConnaissanceAvec(Humain humain) {
		direBonjour();
		repondre(humain);
		memoriser(humain);

	}

	public void listerConnaisance() {
		
		
		parler("je connais beaucoup de monde dont:");
		for (int i = 0; i < nbConnaissance; i++) {
			
			System.out.println(Connaissance[i].nom );

		}

	}

}
