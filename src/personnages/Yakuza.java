package personnages;

public class Yakuza extends Humain {
	private String clan;
	private int reputation=0;
	

	public Yakuza(String nom, String boissonFav, int argent,String clan) {
		super(nom, boissonFav, argent);
		this.clan=clan;
		
	}
	public void extorquer(Commercant commercant) {
		reputation+=1;
		argent+=commercant.getArgent();
		
		parler("Tiens, tiens, ne serait-ce pas un faible marchand qui passe par là ?");
		parler(commercant.getNom()+" si tu tiens à la vie donne moi ta bourse !");
		parler("J’ai piqué les "+commercant.getArgent()+" sous de "+commercant.getNom()+", ce qui me fait "+argent+" sous dans ma poche. Hi ! Hi !");
		commercant.seFaireExtorquer();
	}
	public void perdre() {
		parler("J’ai perdu mon duel et mes "+argent+" sous, snif... J'ai déshonoré le clan de "+clan+".");
		argent=0;
		reputation-=1;
		
	}
	public void gangner(int gain) {
		parler("Ce ronin pensait vraiment battre "+this.getNom()+" du clan de "+clan+" ? Je l'ai dépouillé de ses "+gain+" sous.");
		reputation+=1;
	}
	public int getReputation() {
		return reputation;
	}
	
}
