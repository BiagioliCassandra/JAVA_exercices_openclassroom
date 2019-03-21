//Ceci importe la classe Scanner du package java.util
import java.util.Scanner;
//Ceci importe toutes les classes du package java.util
//import java.util.*;

public class testClavier {

	public static void main(String[] args) {
//		Scanner sc = new Scanner(System.in);
//		System.out.println("Veuillez saisir un mot :");
//		String str = sc.nextLine();
//		char character = str.charAt(0);
//		System.out.println("Vous avez saisi : " + character);
		
		//Permet de saisir plusieurs instruction à la fois.
		Scanner sc = new Scanner(System.in);
		System.out.println("Veuillez saisir un nombre :");
		int integer = sc.nextInt();
		System.out.println("Veuillez saisir un mot :");
		sc.nextLine();
		String mot = sc.nextLine();
		System.out.println("Vous avez saisi : " + integer + " " + mot);
		
	}

}
