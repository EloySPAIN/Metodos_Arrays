/**
 * 
 * @author Eloy Altozano Meijer
 *
 */
import java.util.Scanner;
import java.lang.Math;
public class MetodoDosApp {

	public static void main(String[] args) {
		int num1;
		int num2;
		System.out.println("Escribe el primer numero del rango: ");
		Scanner sc1=new Scanner(System.in);
		num1= sc1.nextInt();
		System.out.println("Escribe el segundo numero del rango: ");
		Scanner sc2=new Scanner(System.in);
		num2= sc2.nextInt();
		System.out.println("Numero random: "+ random(num1, num2));
	}
	
	public static int random(int x, int y) {
		//Math.random, rango minimo x, rango maximo y, se añade + x para que no coja ningun numero del 0 a la x
		int rand = (int) (Math.random() * (y - x)+x);
		return rand;
	}

}
