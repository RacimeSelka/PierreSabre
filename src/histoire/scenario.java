package histoire;
import personnages.Humain;
import personnages.Commercant;
import personnages.Yakuza;
import personnages.Ronin;
public class scenario {

	public static void main(String[] args) {
		
		Commercant marco=new Commercant("marco",15);
		
		
		Yakuza yaku = new Yakuza ("Yaku le noir","whisky",30,"Warsong");
		yaku.extorquer(marco);
		Ronin roro=new Ronin("Roro","shochu",60);
		roro.donner(marco);
		roro.duel(yaku);
		
	}

}
