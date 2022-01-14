/**
 * 
 * @author Eloy Altozano Meijer
 *
 */
import java.util.Scanner;
import java.lang.Math;
public class MetodoDiezApp {
	
	public static void main(String[] args) {
		System.out.println("Escribe la longitud del array: ");
		Scanner arr= new Scanner(System.in);
		int arraynum=arr.nextInt();
		int array[]=new int[arraynum];
		
		System.out.println("Escribe un numero minimo: ");
		Scanner minimo= new Scanner(System.in);
		int min=arr.nextInt();
		
		System.out.println("Escribe un numero maximo: ");
		Scanner maximo= new Scanner(System.in);
		int max=arr.nextInt();

		primo(min, max, array);
		listar(array);
		maximo(array);
		
	}
	
	
	public static void primo(int min, int max, int array[]) {
		for(int i=0;i<array.length;i++) {
			boolean booleano = false;
			while(booleano==false){
				int numrandom = (int) (Math.random() * (max - min)*min);
				if(calcPrimo(numrandom)) {
					array[i]=numrandom;
					booleano=true;
				}
			}
		}
	}
	
	public static boolean calcPrimo(int n) {
		int i=2;
		boolean boleano = true;
		
		while((boleano) && (i != n)) {
			
			if(n %  i == 0) {
				boleano = false;
			}
			i++;
		}
		
		return boleano;
		
	}
	
	public static void listar(int array[]) {
		for(int i=0;i<array.length;i++) {
			System.out.println("Numero: "+array[i]);
		}
	}
	
	public static void maximo(int array[] ) {
		int max=0;
		for(int i=0;i<array.length;i++) {
			if(max<array[i]) {
				max=array[i];
			}
		}
		System.out.println("El maximo es :" + max);
		
	}

}
