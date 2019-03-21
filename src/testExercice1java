import java.util.Scanner;
//Application de conversion degrés Celsius et Fahrenheit
public class testExerciceFC {
	public static void main(String[] args) {
		int choice;
		int celsius;
		int fahrenheit;
		char reponse = 'O';
		Scanner sc = new Scanner(System.in);
		while(reponse == 'O') {
			System.out.println(first());
			choice = sc.nextInt();
			while(choice != 1 && choice != 2) {
				System.out.println(first());
				choice = sc.nextInt();
			}
			if(choice == 1){
				System.out.println("Temperature à convertir :");
				celsius = sc.nextInt();
				fahrenheit = ((9 / 5) * celsius) + 32;
				System.out.println(celsius + "°C correspond à : " + fahrenheit + "°F");
			}
			else {
				System.out.println("Temperature à convertir :");
				fahrenheit = sc.nextInt();
				celsius = ((fahrenheit - 32) * 5) / 9;
				System.out.println(fahrenheit + "°F correspond à :" + celsius + "°C");
			}
			reponse = ' ';
			while(reponse != 'O' && reponse != 'N') {
				System.out.println("Souhaitez-vous convertir une autre température ? (O/N)");
				reponse = sc.next().charAt(0);
			}
		}
		System.out.println("Au revoir et à bientôt ;p");
	}
	public static String first() {
		System.out.println("Choisissez le mode de converstion : \n" + "1 - Celsius/Fahrenheit \n" + "2 - Fahrenheit/Celsius \n");
		return ""; 
	}
}
