import java.util.Scanner;
public class chicharrones {
	public static void main(String[] args) {
		double a, b, c, x, x1;
		Scanner scanner = new Scanner(System.in);
		System.out.println("Give me the value for a: ");
		a = scanner.nextDouble();
		System.out.println("Give me the value for b: ");
		b = scanner.nextDouble();
		System.out.println("Give me the value for c: ");
		c = scanner.nextDouble();

		x= ((-b) + (Math.sqrt((Math.pow(b,2) - (4*a*c))))/(2*a));
		x1= ((-b) - (Math.sqrt((Math.pow(b,2) - (4*a*c))))/(2*a));

		System.out.println("Result 1: " + x);
		System.out.println("Result 2: " + x1);
	}
}