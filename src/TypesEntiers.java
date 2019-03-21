
public class TypesEntiers {

	public static void main(String[] args) {
		int number = 10;
		number ++;
		System.out.println(number);
		number --;
		System.out.println(number);
		
		//4 types entiers 
		//byte -> 1 octet (2 puissance 8) -> -128 à 127
		byte monByte = 127;
		System.out.println(monByte);
		//short -> 2 octets (2 puissance 16) -> -32768 à 32767
		short monShort = 32767;
		System.out.println(monShort);
		//int -> 4 octets (2 puissance 32) 
		int monInt = 1_000_000_000;
		System.out.println(monInt);
		//long -> 8 octets (2 puissance 64)
		long monLong = 10_000_000_000L; //l OU L
		System.out.println(monLong);
		
		//4 bases du numériques
		int decimalValue = 10;	//10 digits de 0 à 9
		int binaryValue = 0b101; //2 digits 0 et 1 (ici 5 en binaire)
		int octalValue = 010; //8 digits de 0 à 7
		int hexadecimalValue = 0xFF; //16 digits de 0 à 9 et de A à F (ici 255 en valeur)
		System.out.println(decimalValue + " " + binaryValue + " " + octalValue + " " + hexadecimalValue);
		//préfixé => incrémentation est effectué avant l'utilisation de la variable
		System.out.println( ++decimalValue ); 
		//postfixé => incrémentation est effectué après l'utilisation de la variable
		System.out.println( decimalValue++ ); //affiche 10 mais a vaut 11
		
		int part1 = 10;
		int part2 = 20; 
		//10 + 20 pendant le calcul mais après l'opération vaut 11 et 21
		int result = part1++ + part2++; //++part1 et ++part2 est différent
		System.out.println(result + " - " + part1 + " - " +part2);
		

		
	}

}
