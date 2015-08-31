import java.util.Scanner;
public class HelloWorld {
	public static void main( String args[]){
		Scanner scanner = new Scanner(System.in);
		String sentence;

		System.out.print("Ingresa algo: ");
		sentence = scanner.nextLine();

		System.out.println("Tu texto es: "\n + sentence);
	}
}