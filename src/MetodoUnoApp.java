/**
 * 
 * @author Eloy Altozano Meijer
 *
 */
import java.util.Scanner;
import java.lang.Math;
public class MetodoUnoApp {

	public static void main(String[] args) {
		System.out.println("Escribe cual quieres calcular (circulo, triangulo, cuadrado):");
		//Metodo que se utiliza para pedir datos al usuario
		Scanner sc = new Scanner(System.in);
		String nombre = sc.nextLine();
		sw(nombre);
		}
	public static void sw(String nombre) {
		switch(nombre) {
			case "circulo":
				System.out.println("Escribe el numero de radio a calcular: ");
				//Funcion que se utiliza para pedir datos al usuario
				Scanner sc2 = new Scanner(System.in);
				//Asignamos el scanner a una variable tipo String
				String radio = sc2.nextLine();
				//Pasamos de string a double
				double radiof= Double.parseDouble(radio);
				//Llamamos al meotodo circulo y lo ponemos en un println para leer el resultado
				System.out.println(circulo(radiof));
				break;
			case "triangulo":
				System.out.println("Escribe la base del triangulo: ");
				Scanner sc3 = new Scanner(System.in);
				String base = sc3.nextLine();
				double basef= Double.parseDouble(base);
				System.out.println("Escribe la altura del triangulo: ");
				Scanner sc4 = new Scanner(System.in);
				String altura = sc4.nextLine();
				double alturaf= Double.parseDouble(altura);
				System.out.println(triangulo(basef,alturaf));
				break;
			case "cuadrado":
				System.out.println("Escribe el primer lado del cuadrado: ");
				Scanner sc5 = new Scanner(System.in);
				String lado1 = sc5.nextLine();
				double lado1f= Double.parseDouble(lado1);
				System.out.println("Escribe el segundo lado del cuadrado: ");
				Scanner sc6 = new Scanner(System.in);
				String lado2 = sc6.nextLine();
				double lado2f= Double.parseDouble(lado2);
				System.out.println(cuadrado(lado1f,lado2f));
				break;
			}
	}
	//Metodos del circulo, triangulo y cuadrado
	public static double circulo (double x) {
		//Se utiliza math para calcular el area del circulo
		double resultado=(Math.pow(x, 2))*Math.PI;
		return resultado;
		
	}
	public static double triangulo (double x, double y) {
		double resultado=(x*y)/2;
		return resultado;
		
	}
	public static double cuadrado (double x, double y) {
		double resultado=x*y;
		return resultado;
	}
	

}
