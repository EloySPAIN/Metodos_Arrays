/**
 * 
 * @author Eloy Altozano Meijer
 *
 */
import java.util.Scanner;
public class MetodoSieteApp {

	public static void main(String[] args) {
		System.out.println("Escribe los €: ");
		Scanner dinero=new Scanner(System.in);
		double numero= dinero.nextDouble();
		System.out.println("Escribe la divisa (libra, dolar, yenes: ");
		Scanner div=new Scanner(System.in);
		String divisa=div.nextLine();
		cambio(numero, divisa);
	}
	
	public static void cambio(double x, String y) {
		final double libras=0.86;
		final double dolar=1.28611;
		final double yenes=129.852;
		double resultado=0;
		switch(y) {
		case "libra":
			resultado=x*libras;
			System.out.println("El cambio es de: "+resultado+" libras");
			break;
		case "dolar":
			resultado=x*dolar;
			System.out.println("El cambio es de: "+resultado+" $");
			break;
		case "yenes":
			resultado=x*yenes;
			System.out.println("El cambio es de: "+resultado+" yenes");
			break;
		}
	}

}
