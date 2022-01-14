/**
 * 
 * @author Eloy Altozano Meijer
 *
 */
import java.util.Scanner;
import java.lang.Math;
public class MetodoNueveApp {
	
	public static void main(String[] args) {
		System.out.println("Escribe la longitud del array: ");
		Scanner arr= new Scanner(System.in);
		int arraynum=arr.nextInt();
		int array[]=new int[arraynum];
		rellenar(array);
		mostrar(array);
		System.out.println("La suma de todos los numeros: "+ sumar(array));
	}
	
	public static void rellenar(int array[]) {
		for(int i=0;i<array.length;i++) {
			array[i]=(int) (Math.random() * 9);
		}
		
	}
	
	public static void mostrar(int array[]) {
		for(int i=0;i<array.length;i++) {
			System.out.println("Posicion: "+i+ " numero: "+array[i]);
		}
	}
	
	public static int sumar(int array[]) {
		int suma=0;
		for(int i=0;i<array.length;i++) {
			suma+=array[i];
		}
		return suma;
	}

}
