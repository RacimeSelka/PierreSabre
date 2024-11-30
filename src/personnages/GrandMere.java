package personnages;

import java.util.Random;

public class GrandMere extends Humain {
	

	

	
	public GrandMere(String nom,  int argent) {
		super(nom, "thé", argent);
		
	}
	@Override
	public void memoriser(Humain humain) {
		if (humain.nbConnaissance < 5 && nbConnaissance < 5) {
			humain.Connaissance[humain.nbConnaissance] = this;
			humain.nbConnaissance += 1;
			Connaissance[nbConnaissance] = humain;
			nbConnaissance += 1;
		}

		else if (nbConnaissance < 5 && humain.nbConnaissance == 5) {
			Connaissance[nbConnaissance] = humain;
			nbConnaissance += 1;
			for (int i = 0; i < 5 - 1; i++) {
				humain.Connaissance[i] = humain.Connaissance[i + 1];
			}
			humain.Connaissance[5 - 1] = this;
		}

		else if (nbConnaissance == 5 && humain.nbConnaissance == 5) {
			for (int i = 0; i < 5 - 1; i++) {
				Connaissance[i] = Connaissance[i + 1];
				humain.Connaissance[i] = humain.Connaissance[i + 1];
			}
			Connaissance[5 - 1] = humain;
			humain.Connaissance[5 - 1] = this;

		} else if (humain.nbConnaissance < 5 && nbConnaissance == 5) {
			for (int i = 0; i < 5 - 1; i++) {
				Connaissance[i] = Connaissance[i + 1];
			}
			Connaissance[5 - 1] = humain;
			humain.Connaissance[humain.nbConnaissance] = this;
			humain.nbConnaissance += 1;
			
		}
	}
	@Override
	public void faireConnaissanceAvec(Humain humain) {
		if (humain instanceof Traitre) {
			repondre(humain);
			parler("VOUS ETES UN TRAITRE ELOIGNEZ VOUS DE MOI AAAAA");
			memoriser(humain);
		}else {
		direBonjour();
		repondre(humain);
		memoriser(humain);
		}

	}
	
	
	private String humainHasard() {
		TypeHumain[] types = TypeHumain.values();
		Random random=new Random();
		return types[random.nextInt(7)].getNom();
	}
	public void ragoter() {
		parler("Oh ma tête ! Je ne peux plus retenir le nom d'une personne supplémentaire !");
		for (int i = 0; i < nbConnaissance; i++) {
			parler("je crois que "+Connaissance[i].getNom()+" est un "+humainHasard());
		}
	}
	
	
	
	
	
	
	
	
	
	
	
}





	

	

	

	



