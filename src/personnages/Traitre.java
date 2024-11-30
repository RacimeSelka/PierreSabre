package personnages;

import java.util.Random;

public class Traitre extends Samourai{
	private int nvTraitrise=0;
	public Traitre(String nom, String seigneur, String boissonFav, int argent) {
		super(nom, seigneur, boissonFav, argent);
		
	}
	
	@Override
	public void direBonjour() {
		parler("bonjour!je m'appelle " + getNom() + " et j'aime boire du " + getBoissonFav());
		parler(" Je suis fier de servir le seigneur "+seigneur);
		parler("Mais je suis un traître et mon niveau de traîtrise est :"+nvTraitrise+". Chut !");
	}
	
	public void ranconner(Commercant commercant) {
		if (nvTraitrise<3) {
			int argentCommercant=commercant.argent;
			int argentRanconner=argentCommercant*2/10;
			gagnerArgent(argentRanconner);
			parler("Si tu veux ma protection contre les Yakuzas, il va falloir payer ! Donne-moi "+argentRanconner+" sous ou gare à toi !");
			commercant.perdreArgent(argentRanconner);
			commercant.parler("tout de suite grand "+getNom());
			nvTraitrise+=1;
		} else {
			parler(" Mince je ne peux plus rançonner personne sinon un samouraï risque de me démasquer !");
		}
		
		
	}
	public void faireLeGentil() {
		if (nbConnaissance<1) {
			parler("Je ne peux faire ami ami avec personne car je ne connais personne ! Snif.");
		} else {
			int don=argent/20;
			Random random=new Random();
			Humain ami=Connaissance[random.nextInt(nbConnaissance)];
			String nomAmi=ami.getNom();
			parler("Il faut absolument remonter ma cote de confiance. Je vais faire ami ami avec "+nomAmi+".");
			parler("Bonjour l'ami ! Je voudrais vous aider en vous donnant "+don+" sous.");
			ami.gagnerArgent(don);
			perdreArgent(don);
			ami.parler("Merci "+getNom()+" vous ètes quelqu'un de bien");
			if (nvTraitrise>1) {
				nvTraitrise-=1;
			}
			
			
		}
	}
}
