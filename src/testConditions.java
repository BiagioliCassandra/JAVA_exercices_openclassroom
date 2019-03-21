
public class testConditions {

	public static void main(String[] args) {
		int i = 50;
//		if(i < 0) {
//			System.out.println("Le nombre est négatif");
//		}
//		else if(i > 0) {
//			System.out.println("Le nombre est positif");
//		}
//		else {
//			System.out.println("Le nombre est égal à O");
//		}

//		if(i > 40 && i < 60) {
//			System.out.println("Ce nombre est dans l'interval");
//		}
//		else {
//			System.out.println("Ce nombre n'est pas dans l'interval");
//		}
		
		int note = 19;
		switch (note) 
		{
			case 0:
				System.out.println("Nul, on recommence");
				break;
			case 10: 
				System.out.println("Vous passez de justesse");
				break;
			case 20:
				System.out.println("Parfait, vous passez!");
				break;
			default:
				System.out.println("Il faut d'avantage travailler");
		}
		
		String chaine = "Bonjour";

		switch(chaine) {
		  case "Bonjour":
		    System.out.println("Bonjour madame !");
		    break;
		  case "Bonsoir":
		    System.out.println("Bonsoir madame !");
		    break;
		  default:
		    System.out.println("Bonjoir ! :p");
		}
	}

}
