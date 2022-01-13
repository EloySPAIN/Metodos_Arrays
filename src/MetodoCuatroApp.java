/**
 * 
 * @author Eloy Altozano Meijer
 *
 */
import java.util.Scanner;
public class MetodoCuatroApp {

	public static void main(String[] args) {
		System.out.println("Escribe el numero: ");
		Scanner scan=new Scanner(System.in);
		int numero= scan.nextInt();
		System.out.println(factorial(numero));
	}
	
	public static int factorial(int x) {
		int resultado=1;
		for(int i=x;i>0;i--) {
			//La variable resultado se multiplica a si mismo con el numero anterior
			resultado*=i;
			x--;
		}
		return resultado;
	}

}
