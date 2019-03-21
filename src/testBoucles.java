import java.util.Scanner;

public class testBoucles {

	public static void main(String[] args) {
		//Boucle While
		//Pour une utilisation avec N et n'importe quoi
//		String prenom;
//		char reponse = 'O';
//		Scanner sc = new Scanner(System.in);
//		while (reponse == 'O')
//		{
//		  System.out.println("Donnez un prénom : ");
//		  prenom = sc.nextLine();
//		  System.out.println("Bonjour " +prenom+ ", comment vas-tu ?");
//		  System.out.println("Voulez-vous réessayer ? (O/N)");
//		  reponse = sc.nextLine().charAt(0);
//		}
//		System.out.println("Au revoir…");
		
		//Pour une utilisation avec N et O uniquement
//		String prenom;
//		char reponse = 'O';
//		Scanner sc = new Scanner(System.in);
//		while (reponse == 'O')
//		{
//		  System.out.println("Donnez un prénom : ");
//		  prenom = sc.nextLine();
//		  System.out.println("Bonjour " +prenom+ ", comment vas-tu ?");                        
//		  reponse = ' ';
//		  while(reponse != 'O' && reponse != 'N')
//		  {
//		    System.out.println("Voulez-vous réessayer ? (O/N)");
//		    reponse = sc.nextLine().charAt(0);
//		  }
//		}
//		System.out.println("Au revoir…");
		
		//Un exemple avec do...While
		String prenom = new String();
		char reponse = ' ';
		 
		Scanner sc = new Scanner(System.in);
		 
		do{
		  System.out.println("Donnez un prénom : ");
		  prenom = sc.nextLine();
		  System.out.println("Bonjour " +prenom+ ", comment vas-tu ?");
		       
		  do{
		    System.out.println("Voulez-vous réessayer ? (O/N)");
		    reponse = sc.nextLine().charAt(0);
		  }while(reponse != 'O' && reponse != 'N');
		        
		}while (reponse == 'O');
		 
		System.out.println("Au revoir…");
		
		//Boucle For
		
	}
}
