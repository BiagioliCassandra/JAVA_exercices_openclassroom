	
public class TypesFlottants {

	public static void main(String[] args) {
		float f1 = 3.6F; //4 octets en mémoire
		double f2 = 3.14; //8 octects
		System.out.println( f1 + " - " + f2);
		
		//2 formes de représentation des flottans
		double first = 1.234; //Syntaxe classique
		double second = 1234e-3; //Notation exponensielle (mantisse - exposant)
		System.out.println(first + " - " +second);
		//Petit piège : 1 est une constante de type entier. Donc c'est une division entière. La valeur entière 0 est donc affecté à Double
		double result = 1 / 3; //Résultat 0.0
		//Ici c'est flottant car un des deux nombres est flottant
		double result1 = 1 / 3.0; //Result 0.33333
		double result2 = 1.0 / 3; //Result 0.33333
		System.out.println(result + " " + result1 + " " + result2);
		
		//Valeurs possibles
		double essaie1 = 3.1415; //Result 3.1415
		double essaie2 = 3 / 0.0; //Result Infinity
		double essaie2bis = Double.POSITIVE_INFINITY; //Idem essaie2
		double essaie3 = 0.0 / 0.0; //Result NaN Not a Number
		double essaie3bis = Double.NaN; //Idem essaie3
		System.out.println(essaie1 + " " + essaie2 + " " + essaie3 + " " + essaie2bis + " " + essaie3bis);
		
		float fl1 = 3.6F;
		float fl2 = Float.NaN;
		float fl3 = Float.NEGATIVE_INFINITY;
		
		System.out.println(Float.isFinite(fl1));
		System.out.println(Float.isFinite(fl2));
		System.out.println(Float.isFinite(fl3));
		
		System.out.println(Float.isInfinite(fl1));
		System.out.println(Float.isInfinite(fl2));
		System.out.println(Float.isInfinite(fl3));
		
		System.out.println(Float.isNaN(fl1));
		System.out.println(Float.isNaN(fl2));
		System.out.println(Float.isNaN(fl3));

	}

}
