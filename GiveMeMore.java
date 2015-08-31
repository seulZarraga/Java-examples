import java.util.Scanner;
public class GiveMeMore {
	public static void main(String[] args) {
		Scanner scanner =  new Scanner(System.in);
		System.out.println(" Give me three lines: ");
		String firstLine = scanner.nextLine();

		System.out.println(" Give me two more: ");
		String secondLine = scanner.nextLine();

		System.out.println(" Just onde more: ");
		String lastLine = scanner.nextLine();

		System.out.println("\n\n\n\n==================================================\n" + "\t" + firstLine + "\n" + "\t" + secondLine + "\n" + "\t" + lastLine + "\n" + "==================================================" + "\n\n\n\n");
		
	}
}