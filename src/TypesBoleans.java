
public class TypesBoleans {
	public static void main(String[] args) {
		boolean test1 = true;
		boolean test2 = false;
		System.out.println(test1 + " " + test2);
		
//		boolean test3 = true;
//		//Boucle infinie car test3 vaut toujours true
		//Ici si test3 valait 1, c'est un int et pas un boolean donc erreur
		//Donc pas d'utilisation de 0 ou 1 mais true ou false
//		while(test3) {
//			System.out.println("True");
//		}
		if(test1 && test2) {
			System.out.println("Les 2 sont true");
		}
		if(test1 || test2) {
			System.out.println("Une des deux est true");
		}
		if(test1 == false) {
			System.out.println("test1 est initialisée à false");
		}
		if(!test2) {
			System.out.println("test2 est initialisée à false");
		}

	}
}
