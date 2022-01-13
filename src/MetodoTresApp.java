/**
 * 
 * @author Eloy Altozano Meijer
 *
 */
public class MetodoTresApp {

	public static void main(String[] args) {
		if(primo(7)) {
			System.out.println("El numero es primo");
		}else {
			System.out.println("El numero no es primo");
		}

	}
	
	public static boolean primo(int x) {
		boolean bol= true;
		//Recorremos del numero 1 hasta el cociente de x/2
		for(int i=1;i<x/2;i++) {
			//Si el resto de x y i es 0, es un numero no primo, si no da 0 es numero primo
			if(x%i==0) {
				bol=false;
			}else
				bol=true;
		}
		return bol;
	}

}
