import java.util.ArrayList;

public class TypesArrays {

	public static void main(String[] args) {
//		int [] firstArray = new int[5];
//		firstArray[0] = 10;
//		firstArray[1] = 20;
//		firstArray[2] = 30;
//		firstArray[3] = 40;
//		firstArray[4] = 50;
//
//		for (int value : firstArray) {
//			System.out.println(value);
//		}
		
//		int [] secondArray = {100, 200, 300, 400, 500};
//		for (int value : secondArray) {
//			System.out.println(value);
//		}
		
//		double [] thirdArray = {1.1, 1.2, 1.3, 1.4, 1.5};
//		for (double value : thirdArray) {
//			System.out.println(value);
//		}
		
//		boolean [] booleanArray = new boolean[4];
//		for (boolean b : booleanArray) {
//			System.out.println(b); //Valeur par défaut : toujours 0 donc false
//		}
		
//		String [] stringArray = new String[3];
//		for (String string : stringArray) {
//			System.out.println(string); //null
//		}
		
		//les collections
		ArrayList<String> coll = new ArrayList<>();
		coll.add("azerty");
		coll.add("querty");
		System.out.println(coll.size());// non length
		for (String string : coll) {
			System.out.println(string);
		}
				
		
	}

}
