
public class TypesStrings {

	public static void main(String[] args) {
		String message = "This is a string with Unicode Characters \u062C";
		char a = 1581;
		char b = 1606;
		char c = 1575;
		char d = 1606;
		System.out.println( message + " - " + a + b + c + d);
		
		//Des opérateurs permettent de manipuler les chaines de caractères
		String start = "Start";
		start = start + "After"; //! la concaténation peut couter cher
		start += "End"; //Les classes StringBuffer et StringBuilder peuvent etre plus efficace
		System.out.println(start);
		
		String upper = message.toUpperCase();
		System.out.println( upper );
		String lower = message.toLowerCase();
		System.out.println( lower );
		System.out.println( message );
		
		String subPart = message.substring(22, 29);
		System.out.println(subPart);
		
		String [] parts = message.split(" ");
		for(String str : parts) {
			System.out.print(str + " - ");
		}
		System.out.println();
		
		String remplacement = message.replace("string", "test");
		System.out.println(remplacement);
		
		//Ici c'est pour transformer les chaines en nombres
		String strValue = "123";
		int value1 = Integer.parseInt(strValue);
		strValue = "3.141592654";
		double value2 = Double.parseDouble(strValue);
		System.out.println(value1 + " - " + value2);
		
		//Ici c'est pour transformer les nombres en chaines
		String finalString = value1 + "";
		finalString += " ";
		finalString += Double.toString(value2);
		System.out.println(finalString);
		
		String strFinal = String.format("%05d [%05.2f]", value1, value2);
		System.out.println(strFinal);
		
		String mot1 = "toto";
		String mot2 = "tata";
		String mot3 = "toto";
		System.out.println(mot1 == mot2); //false
		System.out.println(mot1 == mot3); //true
		//ici il compare mot1 et mot3 mais pas le contenu mais les pointeurs en mémoire. Donc interdit de comparer avec ==.
		
		String half = "to";
		String mot4 = half + half;
		System.out.println(mot1 == mot4); //false
		System.out.println(mot1.equals(mot4)); //true
		//Ici il compare le contenu de la chaine donc c'est cette méthode à utiliser. 
		System.out.println(mot1.equalsIgnoreCase(mot4));
		//Ici compare en ignorant la casse. Donc aucunes importances pour les maj ou les min
		//Elle coute plus cher donc si tout est en minuscule, on s'embête pas.
		

	}

}
