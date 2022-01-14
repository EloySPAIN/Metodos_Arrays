/**
 * 
 * @author Eloy Altozano Meijer
 *
 */
import java.util.Scanner;
public class MetodoOchoApp {
	static int num[]=new int [10];

	public static void main(String[] args) {
		pedir();
		mostrar();

	}
	
	public static void pedir() {
		System.out.println("Escribe 10 numeros: ");
		for(int i=0;i<num.length;i++) {
			Scanner scan = new Scanner(System.in);
			int numero=scan.nextInt();
			num[i]=numero;
		}
	}
	
	public static void mostrar() {
		System.out.println("\n\nImprimiendo: ");
		for(int i=0;i<num.length;i++) {
			System.out.println(num[i]);
		}
	}
	

}
