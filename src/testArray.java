import java.util.Scanner;

public class testArray {

	public static void main(String[] args) {
//		int tabInt[] = {0,1,2};
//		double tabDouble[] = {0.0, 1.1, 2.2};
//		char tabChar[] = {'a','b','c'};
//		String tabString[] = {"chaine1", "chaine2", "chaine3"};
//		System.out.println(tabInt[0] + " " + tabDouble[0] + " " + tabChar[0] + " " + tabString[0]);
//		
//		int tabEntier[] = new int[6];
//		int[] tabEntier2 = new int[6];
//		System.out.println(tabEntier[0] + " " + tabEntier2[0]);
//		
//		int firstNumber[][] = {{0,2,4,6,8},{1,3,5,7,9}}, a = 0, b =0;
//		System.out.println(firstNumber[1][0]);
//		
//		for(int i = 0; i < tabChar.length; i++)
//		{
//		  System.out.println("À l'emplacement " + i +" du tableau nous avons = " + tabChar[i]);
//		}
//		
//		//Recherche dans un tableau
//		int i = 0;
//		char reponse = ' ', charac = ' ';
//		Scanner sc = new Scanner(System.in);
//		do {//Boucle principale
//			do {
//				i = 0;
//				System.out.println("Rentrer une lettre en minuscule svp?");
//				charac = sc.nextLine().charAt(0);
//				while(i < tabChar.length && charac != tabChar[i]) {
//					i++;
//				}
//				if(i < tabChar.length) {
//					System.out.println("La lettre " + charac + " se trouve bien dans le tableau");
//				}else {
//					System.out.println("La lettre " + charac + " ne se trouve pas dans le tableau");
//				}
//			}while(i >= tabChar.length);
//			do {
//				System.out.println("Voulez-vous essayer à nouveau ? (O/N)");
//				reponse = sc.nextLine().charAt(0);
//			}while(reponse != 'O' && reponse != 'N');
//		}while(reponse == 'O');
//		System.out.println("Au revoir et à bientôt ;p");
//		
//		while (a < 2)
//		{
//		  b = 0;
//		  while(b < 5)
//		  {
//		    System.out.print(firstNumber[a][b]);
//		    b++;
//		  }
//		  System.out.println("");
//		  a++;
//		}
//		
//		for(int c = 0; c < 2; c++)
//
//		{    
//
//		  for(int d = 0; d < 5; b++)
//
//		  {
//
//		    System.out.print(firstNumber[c][d]);       
//		  }
//		  System.out.println("");     
//		}
		String tab[][]={{"toto", "titi", "tutu", "tete", "tata"}, {"1", "2", "3", "4"}};
		int i = 0, j = 0;
		 
		for(String sousTab[] : tab)
		{
		  i = 0;
		  for(String str : sousTab)
		  {     
		    System.out.println("La valeur de la nouvelle boucle est  : " + str);
		    System.out.println("La valeur du tableau à l'indice ["+j+"]["+i+"] est : " + tab[j][i]);
		    i++;
		  }
		  j++;
		}
	}

}
