import java.util.Scanner;
import java.util.Random;

public class Ejercicio4{

	public static void main(String[] args){

		Random rand = new Random();
		int a = rand.nextInt(100);
		int b; 
		Scanner scanner = new Scanner(System.in);

	do{
		System.out.println("Adivina el numero, entre 1 y 100: "); 
		b = scanner.nextInt();  


		if ( a == b) System.out.println("Acertaste");
		if ( a < b) System.out.println("Menos.");
		if ( a > b) System.out.println("Más.");
		System.out.println();
		System.out.println();
		} while (a != b );
	}

}