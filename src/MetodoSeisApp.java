/**
 * 
 * @author Eloy Altozano Meijer
 *
 */
import java.util.Scanner;
public class MetodoSeisApp {

	public static void main(String[] args) {
		System.out.println("Escribe el numero: ");
		Scanner scan=new Scanner(System.in);
		int numero= scan.nextInt();
		contador(numero);

	}
	
	public static void contador(int x) {
		//Convertimos de integer a string
		String chr = String.valueOf(x);
		int cadena=chr.length();
		System.out.println(cadena);
	}

}
