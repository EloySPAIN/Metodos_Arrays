/**
 * 
 * @author Eloy Altozano Meijer
 *
 */
import java.util.Scanner;
public class MetodoCincoApp {
	
	public static void main(String[] args) {
		System.out.println("Escribe el numero: ");
		Scanner scan=new Scanner(System.in);
		int numero= scan.nextInt();
		bait(numero);

	}
	
	public static void bait(int x) {
		String n="";
		String bin="";
		//La i del bucle siempre sera 0 ya que tenemos i-- cada vez que entra en el if, 
		//para acabar el bucle se utiliza el x=x/2 hasta que sea menos de 0. Cada vez que pasa por el if
		//se sabra el resto de x. Cuando acabe el bucle, podremos ver el decimal en binario
		for(int i=0;i<x;i++) {
			if(x%2==0) {
				n="0";
				i--;
			}else {
				n="1";
				i--;
			}
			x=x/2;
			bin=n+bin;
		}
		System.out.println(bin);
	}

}
