import java.util.Scanner;
	public class Input {
		public static void main(String[] args) {

			Scanner scanner = new Scanner(System.in);
			System.out.println("Dame tu edad: ");
			int age = scanner.nextInt();
			

			System.out.println("Cuanto quieres ganar ");
			double money = scanner.nextDouble();
			
			scanner.nextLine();

			System.out.println("Dame tu nombre: ");
			String name = scanner.nextLine();

			

			System.out.println(" Your integer was: " + age);
			System.out.println(" Your double was: " + money);
			System.out.println(" Your string was: " + name);




		}
	}