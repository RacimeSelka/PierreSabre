package personnages;

public class Ronin extends Humain {
	private int honneur=1;
	private int force=2*honneur;
	
	public Ronin(String nom, String boissonFav, int argent) {
		super(nom, boissonFav, argent);
		
	}
	public void donner(Commercant commercant) {
		
		parler(commercant.getNom()+"prend ces "+argent/10+" sous");
		commercant.recevoirArgent(argent/10);
		this.perdreArgent(argent/10);
	}
	public void duel(Yakuza yakuza) {
		parler("Je t'ai retrouvé vermine, tu vas payer pour ce que tu as fait à ce pauvre marchand!");
		if (force>=yakuza.getReputation()) {
			argent+=yakuza.getArgent();
			honneur+=1;
			parler("Je t’ai eu petit yakusa!");
			yakuza.perdre();
		} else {
			honneur-=1;
			
			parler("J'ai perdu contre ce yakuza, mon honneur et ma bourse ont en pris un coup.");
			yakuza.gangner(argent);
			argent=0;
		}
	}
	
	
}
