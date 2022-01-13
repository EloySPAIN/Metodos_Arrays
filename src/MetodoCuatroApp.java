/**
 * 
 * @author Eloy Altozano Meijer
 *
 */
public class MetodoCuatroApp {

	public static void main(String[] args) {
		System.out.println(factorial(5));
	}
	
	public static int factorial(int x) {
		int resultado=1;
		for(int i=x;i>0;i--) {
			resultado*=i;
			x--;
		}
		return resultado;
	}

}
