/**
 * 
 * @author Eloy Altozano Meijer
 *
 */
import java.util.Scanner;
import java.lang.Math;
public class MetodoDoceApp {

	public static void main(String[] args) {
		System.out.println("Escribe la longtiud del array: ");
		Scanner scan = new Scanner(System.in);
		int parametro=scan.nextInt();
		int array[]=new int[parametro];
		rellenar(array);
		mostrarEnd(array);
		}
	
	public static void rellenar(int array[]) {
		System.out.println("Todo el Array:");
		for(int i=0;i<array.length;i++) {
			array[i]=(int) (Math.random()*300);
			System.out.println(array[i]);
		}
	}
	
	public static void mostrarEnd(int array[]) {
		System.out.println("Escribe con que numero acabar: ");
		Scanner num = new Scanner(System.in);
		String numFinal=num.nextLine();
		for(int i=0;i<array.length;i++) {
			String numString=String.valueOf(array[i]);
			if(numString.endsWith(numFinal)) {
				System.out.println(array[i]);
			}
		}
	}

}
