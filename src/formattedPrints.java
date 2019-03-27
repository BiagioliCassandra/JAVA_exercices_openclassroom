import java.io.File;
import java.util.Date;


public class formattedPrints {

	public static void main(String[] args) {
		int num = 25;
		int den = 11;
		System.out.println("[" + num + "/" + den + "]");
		System.out.printf("[%d/%d]\n", num, den);
		String message = String.format("[%d/%d]", num, den);
		System.out.println(message);
		
		//Types entiers : 
		System.out.printf(">%5d<\n", num);
		System.out.printf(">%05d<\n", num);
		System.out.printf(">%d<\n", 1_000_000_000);
		System.out.printf(">%,d<\n", 1_000_000_000);
		
		//%d (decimal) %o (octal) %x (hexadecimal)
		System.out.printf("%d %o %x\n", num, num, num); //25 31 19
		System.out.printf(">%08x<\n", num); //00000019

		//Types flottants
		System.out.printf("%f\n", Math.PI); //3,141593
		System.out.printf("%05.2f\n", Math.PI); //03,14
		System.out.printf(">%,11.2f<\n", 10000.256); //>  10 000,26<
		System.out.printf("%e\n", Math.PI);//exponentielle : 3,141593e+00

		//Caractères et chaines de caractères
		System.out.printf("%c - %s\n", 'z', "Zoro"); //z - Zoro
		System.out.printf(">%10s<\n", "Toto"); //>      Toto<
		System.out.printf(">%-10s<\n", "Toto");//>Toto      <
		System.out.printf("%%\n"); //% (pour avoir % faut %%)

		//Autres types de données
			//Boolean
		System.out.printf("%b\n", true); //true
		System.out.printf("%h\n", new Date());//b502afba même chose que faire : System.out.print(Integer.toHexString(args.hashCode()));
		System.out.printf("%tF %tT\n", new Date(), new Date()); //2019-03-25 14:20:45
		
		//Exemple concret
		System.out.println("+------------+---------------------+---------------------+");
		System.out.println("+ Size (Ko)  +   Date       Time   +      File Name      +");
		System.out.println("+------------+---------------------+---------------------+");

		File [] files = new File(".").listFiles();
		for (File file : files) {
			long sizeKo = file.length() / 1024;
			Date lastModified = new Date( file.lastModified());
			String name = file.getName();
			System.out.printf("| %,10d | %tF %tT | %-20s|\n", sizeKo, lastModified, lastModified, name);
		}
		System.out.println("+------------+---------------------+---------------------+");
		
	}

}
