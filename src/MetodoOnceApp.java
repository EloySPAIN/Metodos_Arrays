/**
 * 
 * @author Eloy Altozano Meijer
 *
 */
import java.util.Scanner;
import java.lang.Math;
public class MetodoOnceApp {

	public static void main(String[] args) {
		System.out.println("Escribe la longitud de los dos arrays: ");
		Scanner scan= new Scanner(System.in);
		int parametro=scan.nextInt();
		int array[]=new int[parametro];
		int array2[]=new int[parametro];
		arrayUnoNum(array);
		arrayUnoNumMostrar(array);
		array2=array;
		System.out.println("\nARRAY 2");
		arrayDosNumMostrar(array2);
		System.out.println("\n---------------");
		arrayDosNum(array2);
		arrayUnoNumMostrar(array);
		System.out.println("\nARRAY 2");
		arrayDosNumMostrar(array2);
		arrayMultiplicado(array,array2,parametro);

	}
	
	public static void arrayUnoNum(int array[]) {
		for(int i=0;i<array.length;i++) {
			array[i]=(int) (Math.random()*100);
		}
	}
	public static void arrayUnoNumMostrar(int array[]) {
		for(int i=0;i<array.length;i++) {
			System.out.println(array[i]);
		}
	}
	
	public static void arrayDosNum(int array2[]) {
		for(int i=0;i<array2.length;i++) {
			array2[i]=(int) (Math.random()*100);
		}
	}
	public static void arrayDosNumMostrar(int array2[]) {
		for(int i=0;i<array2.length;i++) {
			System.out.println(array2[i]);
		}
	}
	
	public static void arrayMultiplicado(int array[], int array2[], int parametro) {
		int arrayMulti[]=new int[parametro];
		System.out.println("\n\nArray Multiplicado: ");
		for(int i=0;i<parametro;i++) {
			arrayMulti[i]=array[i]*array2[i];
			System.out.println(arrayMulti[i]);
		}
	}

}
