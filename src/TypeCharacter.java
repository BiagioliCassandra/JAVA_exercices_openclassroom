
public class TypeCharacter {

	public static void main(String[] args) {
		//!! à une chaine de caractère "" et un caractère ''
		String str = "Ceci est une chaine de caractères \u03a0"; //Un ensemble de caractères
		char chr = 'a'; //Un unique caractère
		System.out.println(str + " vs " + chr);
		
		char retourALaLigne = '\n';
		char tabulation = '\t';
		System.out.println("Ceci" + retourALaLigne + "est un test" + tabulation + "!!");
		
		//https://unicode-table.com/fr
		char piMaj = '\u03a0'; //codification hexadécimale
		//char piMin = '\u03c0';
		char piMin = 960; //codification en décimal
		System.out.println(piMaj + " - " + piMin);
		
		boolean isDigit = Character.isDigit(chr);
		System.out.println(isDigit);
		boolean isLetter = Character.isLetter(piMaj);
		System.out.println(isLetter);
		boolean isUpperCaseLetter = Character.isUpperCase(piMin);
		System.out.println(isUpperCaseLetter);
	}

}
