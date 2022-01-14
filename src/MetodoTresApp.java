/**
 * 
 * @author Eloy Altozano Meijer
 *
 */
public class MetodoTresApp {

	public static void main(String[] args) {
		if(primo(37)) {
			System.out.println("El numero es primo");
		}else {
			System.out.println("El numero no es primo");
		}

	}
	
	public static boolean primo(int x) {
		boolean bol= true;
		
		int i=2;
		
		while((bol) && (i != x)) {
			
			if(x %  i == 0) {
				bol = false;
			}
			i++;
		}
		
		return bol;
	}

}
