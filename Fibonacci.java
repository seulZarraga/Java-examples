import java.util.Scanner;
public class Fibonacci {
	public static void main(String[] args) {
		int number1 = 1;
		int number2 = 0;
		int i; 
		int resultado;
		int iteraciones;

		Scanner scanner = new Scanner(System.in);
		System.out.print("Cuantas iteraciones quieres: ");
		iteraciones = scanner.nextInt();
		System.out.println("==================================================\n\n");


		for( i = 0; i < iteraciones; i++) {
		
			resultado = number1 + number2;
			
			System.out.print(resultado + ", " );
			number1 = number2; 
			number2 = resultado; 
		}
		System.out.println("\n\n" + "==================================================\n\n");
	}
}