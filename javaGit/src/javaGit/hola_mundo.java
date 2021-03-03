package javaGit;
import java.util.Scanner;
public class hola_mundo {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Hola, me llamo Jesús y esto es una prueba ");
		
		System.out.print("¿Cuántas subidas a Github quieres que haga?: ");
		int numero = sc.nextInt();
		
		if(numero == 2) {
			System.out.print("De acuerdo");
			
		}else {
			System.out.print("Yo creo que son demasiadas");
		}
		
	}

}
